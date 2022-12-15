package br.com.digitalhouse.controllers;

import br.com.digitalhouse.dtos.CityDto;
import br.com.digitalhouse.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/cities")
public class CityController {

    @Autowired
    CityService cityService;

    @GetMapping
    public ResponseEntity<List<CityDto>> searchAllCities() {
        List<CityDto> cityDtoList = cityService.searchAll();
        return ResponseEntity.ok().body(cityDtoList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CityDto> searchCityById(@PathVariable Integer id) {
        CityDto cityDto = cityService.searchById(id);
        return ResponseEntity.ok().body(cityDto);
    }

    @PostMapping
    public ResponseEntity<CityDto> insertCity(@RequestBody CityDto cityDto) {
        cityDto = cityService.insert(cityDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(cityDto.getId()).toUri();
        return ResponseEntity.created(uri).body(cityDto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<CityDto> updateCity(@PathVariable Integer id, @RequestBody CityDto cityDto) {
        cityDto = cityService.update(id, cityDto);
        return ResponseEntity.ok().body(cityDto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteCity(@PathVariable Integer id) {
        cityService.delete(id);
        return ResponseEntity.noContent().build();
    }

}