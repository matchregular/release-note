package com.heodae.releasenote.domain;

import lombok.Data;

import java.util.List;

@Data
public class Release {
    List<Feature> featureList;
}
