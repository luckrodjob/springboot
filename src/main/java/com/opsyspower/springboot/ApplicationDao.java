package com.opsyspower.springboot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;

@Configuration
@ComponentScan(basePackages = { "com.opsyspower" }, includeFilters = { @Filter(type = FilterType.ANNOTATION, classes = { org.springframework.stereotype.Repository.class }) })
public class ApplicationDao {

}
