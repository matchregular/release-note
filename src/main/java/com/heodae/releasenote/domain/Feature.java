package com.heodae.releasenote.domain;

import com.heodae.releasenote.enums.FeatureStatus;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Feature {
    Version version;

    LocalDate releaseDate;
    FeatureStatus status;
    String title;
    List<Link> linkList;
}
