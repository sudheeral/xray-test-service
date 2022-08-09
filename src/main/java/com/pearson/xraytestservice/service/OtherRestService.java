package com.pearson.xraytestservice.service;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@XRayEnabled
public class OtherRestService {
    private final RestTemplate restTemplate;

    @Value("${url}")
    private String url;
    public OtherRestService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String getRemoteSample() {
        return this.restTemplate.getForObject(url, String.class);
    }
}