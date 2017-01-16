package com.opsyspower.springboot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.opsyspower" }, includeFilters = { @Filter(type = FilterType.ANNOTATION, classes = {
		org.springframework.stereotype.Service.class,
		org.springframework.stereotype.Component.class }) })
public class ApplicationService {

}
