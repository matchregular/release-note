package com.heodae.releasenote.enums;

import lombok.Getter;

@Getter
public enum FeatureStatus {
    FIXED("버그 수정")
    ,NEW("새로운 기능")
    ,ADDED("추가 기능")
    ,IMPROVED("기존 기능 성능 향상")
    ;
    String desc;
    FeatureStatus(String desc){
        this.desc = desc;
    }
}
