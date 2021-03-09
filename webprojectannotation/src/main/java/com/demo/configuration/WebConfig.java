package com.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;



@EnableWebMvc
@Configuration
@ComponentScan("com.demo.controller")
public class WebConfig implements WebMvcConfigurer {

	@Bean
    public ViewResolver internalResourceViewResolver()
    {
		InternalResourceViewResolver viewBean=new InternalResourceViewResolver();
		viewBean.setPrefix("/WEB-INF/pages/");
        viewBean.setSuffix(".jsp");
        return viewBean;
    }
}
