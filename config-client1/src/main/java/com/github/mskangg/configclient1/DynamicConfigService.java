package com.github.mskangg.configclient1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class DynamicConfigService {

    @Value("${baemin.gift}")
    private String gift;

    @Value("${baemin.mainPage}")
    private String mainPage;

    @Value("${baemin.version}")
    private String version;

    public String getGift(){
        return gift;
    }

    public String getMainPage(){
        return mainPage;
    }

    public String getVersion() {
        return version;
    }
}
