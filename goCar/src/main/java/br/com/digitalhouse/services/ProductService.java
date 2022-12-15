package br.com.digitalhouse.services;

import br.com.digitalhouse.dtos.*;
import br.com.digitalhouse.entities.*;
import br.com.digitalhouse.repositories.*;
import br.com.digitalhouse.services.exceptions.DatabaseCarException;
import br.com.digitalhouse.services.exceptions.EntityCarNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import javax.persistence.PreRemove;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private FeatureRepository featureRepository;

    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private BookingRepository bookingRepository;

    // SearchAll
    @Transactional(readOnly = true)
    public List<ProductDto> searchAll() {
        try {
            List<Product> productList = productRepository.findAll();
            return productList.stream().map(x -> new ProductDto(x)).collect(Collectors.toList());
        } catch (EntityNotFoundException e) {
            throw new DatabaseCarException(
                    "Registros não encontrados!"
            );
        }
    }

    // SearchById
    @Transactional(readOnly = true)
    public ProductDto searchById(Integer id) {
        Optional<Product> objectProduct = productRepository.findById(id);
        Product product = objectProduct.orElseThrow(() -> new EntityCarNotFoundException("Registro: " + id + " não encontrado!"));
        return new ProductDto(product);
    }

    // SearchProductsByCategoryId
    @Transactional(readOnly = true)
    public List<ProductDto> searchProductsByCategoryId(Integer categoryId) {
        List<Product> productList = productRepository.findAllProductsByCategoryId(categoryId);
        List<ProductDto> productDtoList = new ArrayList<>();
        for (Product product : productList) {
            productDtoList.add(new ProductDto(product));
        }
        return productDtoList;
    }

    // SearchProductsByCityId
    @Transactional(readOnly = true)
    public List<ProductDto> searchProductsByCityId(Integer cityId) {
        List<Product> productList = productRepository.findAllProductsByCityId(cityId);
        List<ProductDto> productDtoList = new ArrayList<>();
        for (Product product : productList) {
            productDtoList.add(new ProductDto(product));
        }
        return productDtoList;
    }

    // Insert
    @Transactional
    public ProductDto insert(ProductDto productDto) {
        Product product = new Product();
        copyDtoForEntity(productDto, product);
        product = productRepository.save(product);
        return new ProductDto(product);
    }

    // Update
    @Transactional(readOnly = true)
    public ProductDto update(Integer id, ProductDto productDto) {
        try {
            Product product = productRepository.getReferenceById(id);
            copyDtoForEntity(productDto, product);
            product = productRepository.save(product);
            return new ProductDto(product);
        } catch (EntityNotFoundException e) {
            throw new DatabaseCarException(
                    "Registro " + id + " não encontrado!"
            );
        }
    }

    // Delete
    @PreRemove
    public void delete(Integer id) {
        try {
            Product productReturn = productRepository.findById(id).orElseThrow(EntityNotFoundException::new);
            productReturn.getFeatures().clear();
            productReturn.getImages().clear();
            Category categoryReturn = categoryRepository.findById(productReturn.getCategory().getId())
                    .orElseThrow(EntityNotFoundException::new);
            categoryReturn.getProducts().remove(productReturn);
            categoryRepository.save(categoryReturn);
            City cityReturn = cityRepository.findById(productReturn.getCity().getId())
                    .orElseThrow(EntityNotFoundException::new);
            cityReturn.getProducts().remove(productReturn);
            cityRepository.save(cityReturn);
            productRepository.saveAndFlush(productReturn); // Testar retirando o mesmo para ver se roda
            productRepository.delete(productReturn);
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

    private void copyDtoForEntity(ProductDto productDto, Product product) {
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());

        product.getFeatures().clear();
        for (FeatureDto featureDto : productDto.getFeatures()) {
            Feature feature = featureRepository.getReferenceById(featureDto.getId());
            product.getFeatures().add(feature);
        }

        product.getImages().clear();
        for (ImageDto imageDto : productDto.getImages()) {
            Image image = imageRepository.getReferenceById(imageDto.getId());
            product.getImages().add(image);
        }

        //Booking Service
        product.getBookings().clear();
        for (BookingForProductDto bookingDto : productDto.getBooking()) {
            Booking booking = bookingRepository.getReferenceById(bookingDto.getId());
            product.getBookings().add(booking);
        }

        CategoryForProductDto categoryForProductDto = productDto.getCategory();
        Category category = categoryRepository.getReferenceById(categoryForProductDto.getId());
        product.setCategory(category);

        CityForProductDto cityForProductDto = productDto.getCity();
        City city = cityRepository.getReferenceById(cityForProductDto.getId());
        product.setCity(city);
    }

}