package com.heodae.releasenote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ReleaseController {
    @GetMapping("/release-notes")
    public String showReleaseNote(Model model){
        List<Release> releaseList = getReleases();

        model.addAttribute("releases", releaseList);

        return "release-notes";
    }


    // 실제로 사용할 Release 클래스와 데이터를 가져오는 로직을 구현해야 합니다.
    private List<Release> getReleases() {
        // GitHub Desktop의 버전 및 릴리즈 노트 정보를 가져오는 로직을 구현
        // 예시를 위해 임시로 데이터를 하드코딩하여 반환
        List<Release> releases = new ArrayList<>();
        releases.add(new Release("1.0.0", "https://example.com/releases/1.0.0"));
        releases.add(new Release("2.0.0", "https://example.com/releases/2.0.0"));
        releases.add(new Release("3.0.0", "https://example.com/releases/3.0.0"));
        return releases;
    }

    // Release 클래스 예시 (버전과 링크를 저장하는 클래스)
    public class Release {
        private String version;
        private String link;

        public Release(String version, String link) {
            this.version = version;
            this.link = link;
        }

        public String getVersion() {
            return version;
        }

        public String getLink() {
            return link;
        }
    }
}
