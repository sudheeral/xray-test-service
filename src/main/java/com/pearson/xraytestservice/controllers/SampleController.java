package com.pearson.xraytestservice.controllers;

import com.pearson.xraytestservice.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
class SampleController {
  @Autowired
  private RestService service;

  @GetMapping("/sample")
  public String getSample() {
    return "sample";
  }

  @GetMapping("/sample-remote")
  public String getRemoteSample() {
    return service.getRemoteSample();
  }
}