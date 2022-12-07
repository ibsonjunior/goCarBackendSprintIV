package br.com.digitalhouse.services;

import br.com.digitalhouse.dtos.FeatureDto;
import br.com.digitalhouse.entities.Feature;
import br.com.digitalhouse.repositories.FeatureRepository;
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
public class FeatureService {

    @Autowired
    private FeatureRepository featureRepository;

    // SearchAll
    @Transactional(readOnly = true)
    public List<FeatureDto> searchAll() {
        try {
            List<Feature> featureList = featureRepository.findAll();
            return featureList.stream().map(x -> new FeatureDto(x)).collect(Collectors.toList());
        } catch (EntityNotFoundException e) {
            throw new DatabaseCarException(
                    "Registros não encontrados!"
            );
        }
    }

    // SearchById
    @Transactional(readOnly = true)
    public FeatureDto searchById(Integer id) {
        Optional<Feature> objectFeature = featureRepository.findById(id);
        Feature feature = objectFeature.orElseThrow(() -> new EntityCarNotFoundException("Registro: " + id + " não encontrado!"));
        return new FeatureDto(feature);
    }

    // Insert
    @Transactional
    public FeatureDto insert(FeatureDto featureDto) {
        Feature feature = new Feature();
        copyDtoForEntity(featureDto, feature);
        feature = featureRepository.save(feature);
        return new FeatureDto(feature);
    }

    // Update
    @Transactional
    public FeatureDto update(Integer id, FeatureDto featureDto) {
        try {
            Feature feature = featureRepository.getReferenceById(id);
            copyDtoForEntity(featureDto, feature);
            feature = featureRepository.save(feature);
            return new FeatureDto(feature);
        } catch (EntityNotFoundException e) {
            throw new DatabaseCarException(
                    "Registro " + id + " não encontrado!"
            );
        }
    }

    // Delete
    public void delete(Integer id) {
        try {
            featureRepository.deleteById(id);
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

    private void copyDtoForEntity(FeatureDto featureDto, Feature feature) {
        feature.setName(featureDto.getName());
        feature.setIcon(featureDto.getIcon());
    }

}