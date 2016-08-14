package com.jasvirdi.solitaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jasvirdi.solitaire.services.GameService;
import com.jasvirdi.solitaire.web.resource.GameResource;

@Configuration
@EnableAutoConfiguration
@Import({GameResource.class, GameService.class})
public class Solitaire {

  public static void main(String[] args) {
    SpringApplication.run(Solitaire.class, args);

  }

  @Bean
  public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
    MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
    ObjectMapper objectMapper = new ObjectMapper();
    jsonConverter.setObjectMapper(objectMapper);
    return jsonConverter;
  }

}
