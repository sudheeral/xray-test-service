package com.pearson.xraytestservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import javax.servlet.Filter;
import com.amazonaws.xray.javax.servlet.AWSXRayServletFilter;

@Configuration
public class XrayConfig {

  @Bean
  public Filter TracingFilter() {
    String segmentName = System.getenv("XRAY_SEGMENT_NAME");
    System.out.println("XRAY_SEGMENT_NAME: " + segmentName);
    return new AWSXRayServletFilter(segmentName);
  }
}