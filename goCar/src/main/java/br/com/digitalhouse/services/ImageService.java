package br.com.digitalhouse.services;

import br.com.digitalhouse.dtos.ImageDto;
import br.com.digitalhouse.dtos.ProductForImageDto;
import br.com.digitalhouse.entities.Image;
import br.com.digitalhouse.entities.Product;
import br.com.digitalhouse.repositories.ImageRepository;
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
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private ProductRepository productRepository;

    // SearchAll
    @Transactional(readOnly = true)
    public List<ImageDto> searchAll() {
        try {
            List<Image> imageList = imageRepository.findAll();
            return imageList.stream().map(x -> new ImageDto(x)).collect(Collectors.toList());
        } catch (EntityNotFoundException e) {
            throw new DatabaseCarException(
                    "Registros não encontrados!"
            );
        }
    }

    // SearchById
    @Transactional(readOnly = true)
    public ImageDto searchById(Integer id) {
        Optional<Image> objectImage = imageRepository.findById(id);
        Image image = objectImage.orElseThrow(() -> new EntityCarNotFoundException("Registro: " + id + " não encontrado!"));
        return new ImageDto(image);
    }

    // Insert
    @Transactional
    public ImageDto insert(ImageDto imageDto) {
        Image image = new Image();
        copyDtoForEntity(imageDto, image);
        image = imageRepository.save(image);
        return new ImageDto(image);
    }

    // Update
    @Transactional
    public ImageDto update(Integer id, ImageDto imageDto) {
        try {
            Image image = imageRepository.getReferenceById(id);
            copyDtoForEntity(imageDto, image);
            image = imageRepository.save(image);
            return new ImageDto(image);
        } catch (EntityNotFoundException e) {
            throw new DatabaseCarException(
                    "Registro " + id + " não encontrado!"
            );
        }
    }

    // Delete
    public void delete(Integer id) {
        try {
            imageRepository.deleteById(id);
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

    private void copyDtoForEntity(ImageDto imageDto, Image image) {
        image.setTitle(imageDto.getTitle());
        image.setUrlImage(imageDto.getUrlImage());

        ProductForImageDto productForImageDto = imageDto.getProduct();
        Product product = productRepository.getReferenceById(productForImageDto.getId());
        image.setProduct(product);
    }

}