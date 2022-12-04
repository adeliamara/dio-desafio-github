package dio.primeirospassosspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(PrimeirosPassosSpringApplication.class, args);

		//Calculadora calculadora = new Calculadora(); // ao criar uma instancia isso nao sera gerenciado pelo spring boot

		//System.out
		// println(calculadora.somar(2,3));
	}

}
