package com.heodae.releasenote.service;

import com.heodae.releasenote.domain.Feature;

import java.time.LocalDate;
import java.util.List;

public interface FeatureService {
    List<Feature> findAll();

    List<Feature> findByReleaseDate(LocalDate releaseDate);

    Feature insert(Feature feature);

    List<Feature> delete(LocalDate releaseDate);

    boolean deleteAll();
}
