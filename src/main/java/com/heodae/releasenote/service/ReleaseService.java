package com.heodae.releasenote.service;

import com.heodae.releasenote.domain.Release;

import java.time.LocalDate;

public interface ReleaseService {

    Release getReleaseService(LocalDate fromDate);

    Release getReleaseService(LocalDate fromDate, LocalDate toDate);
}
