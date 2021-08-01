package com.github.mskangg.configclient1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StaticConfigService {

    @Value("${baemin.gift}")
    private String gift;

    public String getGift() {
        return gift;
    }
}
