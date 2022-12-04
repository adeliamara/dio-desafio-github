package dio.aulaspringdatajpa.repository;

import dio.aulaspringdatajpa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Integer> {
}
