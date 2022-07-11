package com.projetos.curso.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@EnableSwagger2
public class SwaggerConf {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_12)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.projetos.curso"))
        .paths(PathSelectors.ant("/**"))
        .build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo("title", 
        "description", 
        "version", 
        "", 
        new Contact("Projeto solo", 
            "http://github.com/Gerson-Rodrigues", 
            "gerson.rodrigues@castgroup.com.br"), 
            "Licensa API",
            "http://castgroup.com.br",Collections.emptyList());
    }
    
}
