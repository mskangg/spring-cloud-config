package com.github.mskangg.configclient1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private final StaticConfigService staticConfigService;
    private final DynamicConfigService dynamicConfigService;

    public SampleController(StaticConfigService staticConfigService, DynamicConfigService dynamicConfigService) {
        this.staticConfigService = staticConfigService;
        this.dynamicConfigService = dynamicConfigService;
    }

    @GetMapping("/static")
    public ResponseEntity<String> getStaticGift() {
        return ResponseEntity.ok()
                .body(staticConfigService.getGift())
                ;
    }

    @GetMapping("/dynamic")
    public ResponseEntity<String> getDynamicGift() {
        return ResponseEntity.ok()
                .body(dynamicConfigService.getGift())
                ;
    }
}
