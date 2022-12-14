package com.pearson.xraytestservice.service;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@XRayEnabled
public class RestService {
    @Autowired
    private OtherRestService otherRestService;

    public String getRemoteSample() {
        return otherRestService.getRemoteSample() + "-remote";
    }
}