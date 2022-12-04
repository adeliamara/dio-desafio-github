package dio.aulaspringdatajpa;

import dio.aulaspringdatajpa.model.Usuario;
import dio.aulaspringdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository UserRepository;
    @Override
    public void run(String... args) throws Exception {
        Usuario usuario1 = new Usuario();
        usuario1.setNome("Adélia");
        usuario1.setUsername("adeliamara");
        usuario1.setPassword("senha teste");

        UserRepository.save(usuario1);

        for(Usuario u: UserRepository.findAll()){
            System.out.println(u);
        }
    }
}
