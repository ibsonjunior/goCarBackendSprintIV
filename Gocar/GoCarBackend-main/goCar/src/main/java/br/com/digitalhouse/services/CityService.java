package br.com.digitalhouse.services;

import br.com.digitalhouse.dtos.CityDto;
import br.com.digitalhouse.dtos.ProductDto;
import br.com.digitalhouse.entities.City;
import br.com.digitalhouse.entities.Product;
import br.com.digitalhouse.repositories.CityRepository;
import br.com.digitalhouse.repositories.ProductRepository;
import br.com.digitalhouse.services.exceptions.DatabaseCarException;
import br.com.digitalhouse.services.exceptions.EntityCarNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import javax.persistence.PreRemove;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private ProductRepository productRepository;

    // SearchAll
    @Transactional(readOnly = true)
    public List<CityDto> searchAll() {
        try {
            List<City> cityList = cityRepository.findAll();
            return cityList.stream().map(x -> new CityDto(x)).collect(Collectors.toList());
        } catch (EntityNotFoundException e) {
            throw new DatabaseCarException(
                    "Registros não encontrados!"
            );
        }
    }

    // SearchById
    @Transactional(readOnly = true)
    public CityDto searchById(Integer id) {
        Optional<City> objectCity = cityRepository.findById(id);
        City city = objectCity.orElseThrow(() -> new EntityCarNotFoundException("Registro: " + id + " não encontrado!"));
        return new CityDto(city);
    }

    // Insert
    @Transactional
    public CityDto insert(CityDto cityDto) {
        City city = new City();
        copyDtoForEntity(cityDto, city);
        city = cityRepository.save(city);
        return new CityDto(city);
    }

    // Update
    @Transactional
    public CityDto update(Integer id, CityDto cityDto) {
        try {
            City city = cityRepository.getReferenceById(id);
            copyDtoForEntity(cityDto, city);
            city = cityRepository.save(city);
            return new CityDto(city);
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
            City cityReturn = cityRepository.findById(id).orElseThrow(EntityNotFoundException::new);
            cityReturn.getProducts().clear();
            List<Product> productList = productRepository.findAllProductsByCityId(id);
            for (Product product : productList) {
                product.setCity(null);
            }
            productRepository.saveAll(productList);
            cityRepository.saveAndFlush(cityReturn);
            cityRepository.delete(cityReturn);
//            cityRepository.deleteById(id);
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

    private void copyDtoForEntity(CityDto cityDto, City city) {
        city.setName(cityDto.getName());
        city.setCountry(cityDto.getCountry());

        city.getProducts().clear();
        for (ProductDto productDto : cityDto.getProducts()) {
            Product product = productRepository.getReferenceById(productDto.getId());
            city.getProducts().add(product);
        }
    }

}