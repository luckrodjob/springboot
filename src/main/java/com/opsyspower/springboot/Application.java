package com.opsyspower.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//相当于spring xml配置文件
@Configuration
// 相当于spring xml配置文件中的<componentscan>标签
@ComponentScan(basePackages = { "com.opsyspower" }, includeFilters = { @Filter(type = FilterType.ANNOTATION, classes = {
		org.springframework.stereotype.Controller.class,
		org.springframework.web.bind.annotation.ControllerAdvice.class,
		org.springframework.web.bind.annotation.RestController.class }) })
// 导入其他配置文件
// @Import(value = { ApplicationService.class, ApplicationDao.class })
@EnableAutoConfiguration
// 自动装载依赖的相关注解配置，如jpa等
public class Application extends WebMvcConfigurerAdapter {
	public static void main(String[] args) {
		// 注意只能存在一个主配置文件，如果是使用多个sources文件进行run方法调用的话，则会启动报错
		SpringApplication.run(Application.class);
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		super.addInterceptors(registry);
	}

}
