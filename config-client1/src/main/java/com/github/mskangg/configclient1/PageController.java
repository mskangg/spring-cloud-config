package com.github.mskangg.configclient1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    private final DynamicConfigService dynamicConfigService;

    public PageController(DynamicConfigService dynamicConfigService) {
        this.dynamicConfigService = dynamicConfigService;
    }

    @GetMapping("/main")
    public String main(Model model) {
        model.addAttribute("version", dynamicConfigService.getVersion());
        return dynamicConfigService.getMainPage();
    }
}
