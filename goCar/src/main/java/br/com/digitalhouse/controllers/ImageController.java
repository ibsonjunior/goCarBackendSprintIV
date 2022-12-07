package br.com.digitalhouse.controllers;

import br.com.digitalhouse.dtos.ImageDto;
import br.com.digitalhouse.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/images")
public class ImageController {

    @Autowired
    ImageService imageService;

    @GetMapping
    public ResponseEntity<List<ImageDto>> searchAllImages() {
        List<ImageDto> imageDtoList = imageService.searchAll();
        return ResponseEntity.ok().body(imageDtoList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ImageDto> searchImageById(@PathVariable Integer id) {
        ImageDto imageDto = imageService.searchById(id);
        return ResponseEntity.ok().body(imageDto);
    }

    @PostMapping
    public ResponseEntity<ImageDto> insertImage(@RequestBody ImageDto imageDto) {
        imageDto = imageService.insert(imageDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(imageDto.getId()).toUri();
        return ResponseEntity.created(uri).body(imageDto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ImageDto> updateImage(@PathVariable Integer id, @RequestBody ImageDto imageDto) {
        imageDto = imageService.update(id, imageDto);
        return ResponseEntity.ok().body(imageDto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteImage(@PathVariable Integer id) {
        imageService.delete(id);
        return ResponseEntity.noContent().build();
    }

}