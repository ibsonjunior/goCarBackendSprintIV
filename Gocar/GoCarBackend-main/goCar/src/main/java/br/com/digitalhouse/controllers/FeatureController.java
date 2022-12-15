package br.com.digitalhouse.controllers;

import br.com.digitalhouse.dtos.FeatureDto;
import br.com.digitalhouse.services.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/features")
public class FeatureController {

    @Autowired
    FeatureService featureService;

    @GetMapping
    public ResponseEntity<List<FeatureDto>> searchAllFeatures() {
        List<FeatureDto> featureDtoList = featureService.searchAll();
        return ResponseEntity.ok().body(featureDtoList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<FeatureDto> searchFeatureById(@PathVariable Integer id) {
        FeatureDto featureDto = featureService.searchById(id);
        return ResponseEntity.ok().body(featureDto);
    }

    @PostMapping
    public ResponseEntity<FeatureDto> insertFeature(@RequestBody FeatureDto featureDto) {
        featureDto = featureService.insert(featureDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(featureDto.getId()).toUri();
        return ResponseEntity.created(uri).body(featureDto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<FeatureDto> updateFeature(@PathVariable Integer id, @RequestBody FeatureDto featureDto) {
        featureDto = featureService.update(id, featureDto);
        return ResponseEntity.ok().body(featureDto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteFeature(@PathVariable Integer id) {
        featureService.delete(id);
        return ResponseEntity.noContent().build();
    }

}