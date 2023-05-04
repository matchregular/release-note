package com.heodae.releasenote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class ReleaseNoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReleaseNoteApplication.class, args);
    }

}
