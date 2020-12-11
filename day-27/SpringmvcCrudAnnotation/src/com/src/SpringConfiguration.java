package com.src;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@ComponentScan(basePackages="com.src")
@Configuration
public class SpringConfiguration extends WebMvcConfigurationSupport {
	@Bean
	public ViewResolver view()
	{
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
				vr.setViewClass(JstlView.class);
				vr.setPrefix("WEB-INF/jsp");
				vr.setSuffix(".jsp");
				return vr;
				
	}

}
