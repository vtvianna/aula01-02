package br.com.senacniteroi.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/*
 * ARQUITETURA MVC
 * 
 * 
 * VIEWS - FRONTED PRONTO QUE EXIBIRÁ O RESULTADO DAS REQUISIÇÕES
 * CONTROLLERS - VÃO ADMINISTRAR AS REQUISIÇÕES
 * SERVICES - VÃO "SERVIR" AS REQUISIÇÕES
 * MODELS - SERÃO O MODELO DAS REQUISIÇÕES 
 * 
 * 
 * 
 */
@SpringBootApplication
public class SpringbootapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootapiApplication.class, args);
	}

}
