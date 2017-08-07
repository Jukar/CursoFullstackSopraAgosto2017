package com.sopra.meetic.negocio.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfiguracionPersistencia {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
