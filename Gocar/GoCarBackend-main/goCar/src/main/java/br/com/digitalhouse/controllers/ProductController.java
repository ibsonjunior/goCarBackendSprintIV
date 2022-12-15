package br.com.digitalhouse.controllers;

import br.com.digitalhouse.dtos.ProductDto;
import br.com.digitalhouse.entities.Product;
import br.com.digitalhouse.repositories.ProductRepository;
import br.com.digitalhouse.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<List<ProductDto>> searchAllProducts() {
        List<ProductDto> productDtoList = productService.searchAll();
        return ResponseEntity.ok().body(productDtoList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductDto> searchProductById(@PathVariable Integer id) {
        ProductDto productDto = productService.searchById(id);
        return ResponseEntity.ok().body(productDto);
    }

    @GetMapping(value = "/category-id/{categoryId}")
    public ResponseEntity<List<ProductDto>> searchProductsByCategoryId(@PathVariable Integer categoryId) {
        List<ProductDto> productDtoList = productService.searchProductsByCategoryId(categoryId);
        return ResponseEntity.ok().body(productDtoList);
    }

    @GetMapping(value = "/city-id/{cityId}")
    public ResponseEntity<List<ProductDto>> searchProductsByCityId(@PathVariable Integer cityId) {
        List<ProductDto> productDtoList = productService.searchProductsByCityId(cityId);
        return ResponseEntity.ok().body(productDtoList);
    }

    //    Filter dates
    @GetMapping("/dates/")
    public ResponseEntity<List<ProductDto>> listaPorDatas(
            @RequestParam(name = "dateStart") String dateStart,
            @RequestParam(name = "dateEnd") String dateEnd) {

        LocalDate dateInitialDay = LocalDate.parse(dateStart, DateTimeFormatter.ISO_DATE);
        LocalDate dateFinalDay = LocalDate.parse(dateEnd, DateTimeFormatter.ISO_DATE);

        List<Product> productList = productRepository.findProductByDate(dateFinalDay,  dateInitialDay);

        List<ProductDto> outputList = productList.stream().map(x -> new ProductDto(x)).collect(Collectors.toList());
        return ResponseEntity.ok(outputList);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<ProductDto> insertProduct(@RequestBody ProductDto productDto) {
        productDto = productService.insert(productDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(productDto.getId()).toUri();
        return ResponseEntity.created(uri).body(productDto);
    }

    @PutMapping(value = "/{id}")
    @Transactional
    public ResponseEntity<ProductDto> updateProduct(@PathVariable Integer id, @RequestBody ProductDto productDto) {
        productDto = productService.update(id, productDto);
        return ResponseEntity.ok().body(productDto);
    }

    @DeleteMapping(value = "/{id}")
    @Transactional
    public ResponseEntity<Void> deleteProduct(@PathVariable Integer id) {
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }

}