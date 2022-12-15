package br.com.digitalhouse.services;

import br.com.digitalhouse.dtos.CategoryDto;
import br.com.digitalhouse.dtos.ProductDto;
import br.com.digitalhouse.entities.Category;
import br.com.digitalhouse.entities.Product;
import br.com.digitalhouse.repositories.CategoryRepository;
import br.com.digitalhouse.repositories.ProductRepository;
import br.com.digitalhouse.services.exceptions.DatabaseCarException;
import br.com.digitalhouse.services.exceptions.EntityCarNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    // SearchAll
    @Transactional(readOnly = true)
    public List<CategoryDto> searchAll() {
        try {
            List<Category> categoryList = categoryRepository.findAll();
            return categoryList.stream().map(x -> new CategoryDto(x)).collect(Collectors.toList());
        } catch (EntityNotFoundException e) {
            throw new DatabaseCarException(
                    "Registros não encontrados!"
            );
        }
    }

    // SearchById
    @Transactional(readOnly = true)
    public CategoryDto searchById(Integer id) {
        Optional<Category> objectCategory = categoryRepository.findById(id);
        Category category = objectCategory.orElseThrow(() -> new EntityCarNotFoundException("Registro: " + id + " não encontrado!"));
        return new CategoryDto(category);
    }

    // Insert
    @Transactional
    public CategoryDto insert(CategoryDto categoryDto) {
        Category category = new Category();
        copyDtoForEntity(categoryDto, category);
        category = categoryRepository.save(category);
        return new CategoryDto(category);
    }

    // Update
    @Transactional
    public CategoryDto update(Integer id, CategoryDto categoryDto) {
        try {
            Category category = categoryRepository.getReferenceById(id);
            copyDtoForEntity(categoryDto, category);
            category = categoryRepository.save(category);
            return new CategoryDto(category);
        } catch (EntityNotFoundException e) {
            throw new DatabaseCarException(
                    "Registro " + id + " não encontrado!"
            );
        }
    }

    // Delete
    public void delete(Integer id) {
        try {
            Category categoryReturn = categoryRepository.findById(id).orElseThrow(EntityNotFoundException::new);
            categoryReturn.getProducts().clear();
            List<Product> productList = productRepository.findAllProductsByCategoryId(id);
            for (Product product : productList) {
                product.setCategory(null);
            }
            productRepository.saveAll(productList);
            categoryRepository.saveAndFlush(categoryReturn);
            categoryRepository.delete(categoryReturn);
        } catch (EmptyResultDataAccessException e) {
            throw new EntityCarNotFoundException(
                    "Exclusão não realizada! Registro " + id + " não encontrado!"
            );
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseCarException(
                    "Violação de integridade: Registro " + id + " está em outro registro!"
            );
        }
    }

    private void copyDtoForEntity(CategoryDto categoryDto, Category category) {
        category.setQualification(categoryDto.getQualification());
        category.setDescription(categoryDto.getDescription());
        category.setUrlImage(categoryDto.getUrlImage());

        category.getProducts().clear();
        for (ProductDto productDto : categoryDto.getProducts()) {
            Product product = productRepository.getReferenceById(productDto.getId());
            category.getProducts().add(product);
        }
    }

}