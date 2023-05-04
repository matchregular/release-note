package com.heodae.releasenote.enums;

import lombok.Getter;

@Getter
public enum Project {
    BO("어드민")
    ,MALL("자사몰");

    String desc;
    Project(String desc){
        this.desc = desc;
    }
}
