package com.heodae.releasenote.domain;

import com.heodae.releasenote.enums.Project;
import lombok.Data;

@Data
public class Version {
    Project project;
    int major;
    int minor;
    int patch;
}
