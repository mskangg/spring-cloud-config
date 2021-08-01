package com.github.mskangg.configclient2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class DynamicConfigService {

    @Value("${baemin.gift}")
    private String gift;

    public String getGift() {
        return gift;
    }
}
