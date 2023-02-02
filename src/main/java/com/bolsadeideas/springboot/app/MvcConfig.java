package com.bolsadeideas.springboot.app;

// import java.nio.file.Paths;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry){
		registry.addViewController("/error_403").setViewName("error_403");
	}

	@Bean
	public Jaxb2Marshaller jaxb2Marshaller(){
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setClassesToBeBound(new Class[]{com.bolsadeideas.springboot.app.view.xml.ClienteList.class});
		return marshaller;
	}


}
