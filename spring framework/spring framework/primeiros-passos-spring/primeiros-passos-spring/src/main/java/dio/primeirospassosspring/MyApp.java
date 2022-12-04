package dio.primeirospassosspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.nio.channels.CancelledKeyException;

@Component //use component quando temos acesso ao codigo fonte. se nao, use bean
public class MyApp implements CommandLineRunner {
    @Autowired //o conteiner quando for inicializado irá realizar uma injeção de dependencia atraves do autowired
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(calculadora.somar(2,3));
    }
}
