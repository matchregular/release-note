package com.heodae.releasenote.domain;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ReleaseNote {
    public ReleaseNote(LocalDate fromDate){
        // get fromdate ~ latest version
    }

    public ReleaseNote(LocalDate fromDate, LocalDate toDate){
        // get fromDate ~ toDate version
    }

    List<Release> releaseList;
}
