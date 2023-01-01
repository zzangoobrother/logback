package dev.be.logback.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo() {
        log.trace("log --> trace");
        log.info("log --> info");
        log.debug("log --> debug");
        log.warn("log --> warn");
        log.error("log --> error");
        return "get";
    }
}
