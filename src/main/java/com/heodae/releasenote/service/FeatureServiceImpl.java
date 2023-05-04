package com.heodae.releasenote.service;

import com.heodae.releasenote.domain.Feature;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class FeatureServiceImpl implements FeatureService{
    List<Feature> featureList = new ArrayList<>();
    @Override
    public List<Feature> findAll() {
        return featureList;
    }

    @Override
    public List<Feature> findByReleaseDate(LocalDate releaseDate) {
        return featureList.stream().filter(feature -> feature.getReleaseDate().equals(releaseDate)).toList();
    }

    @Override
    public Feature insert(Feature feature) {
        featureList.add(feature);
        return feature;
    }

    @Override
    public List<Feature> delete(LocalDate releaseDate) {
        return featureList.stream().filter(feature -> !feature.getReleaseDate().equals(releaseDate)).toList();
    }

    @Override
    public boolean deleteAll() {
        featureList = null;
        return true;
    }
}
