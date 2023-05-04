package com.heodae.releasenote.controller;

import com.heodae.releasenote.domain.Feature;
import com.heodae.releasenote.service.FeatureService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class FeatureController {

    private final FeatureService featureService;

    public FeatureController(FeatureService featureService) {
        this.featureService = featureService;
    }

    @GetMapping(path = "/feature")
    public List<Feature> getFeature(@RequestHeader HttpHeaders headers){
        System.out.println("authorization : " + headers.get("authorization"));
        System.out.println(headers);
        return featureService.findAll();
    }

    @GetMapping("/feature/{releaseDate}")
    public List<Feature> getFeature(@PathVariable LocalDate releaseDate){
        return featureService.findByReleaseDate(releaseDate);
    }

    @PostMapping("/feature")
    public Feature insertFeature(@RequestBody Feature feature){
        return featureService.insert(feature);
    }

    @DeleteMapping("/feature/{releaseDate}")
    public List<Feature> deleteFeature(@PathVariable LocalDate releaseDate){
        return featureService.delete(releaseDate);
    }

    @DeleteMapping("/feature")
    public HttpStatus deleteFeature(){
        featureService.deleteAll();
        return HttpStatus.NO_CONTENT;
    }
}
