package dio.aulaspringdatajpa.model;


import jakarta.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    @Column(length = 50)
    private String nome;
    @Column(length = 20)
    private String username;
    @Column(length = 100)

    private String password;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "id: " + id +
                " nome: " + nome +
                " user: " + username +
                " senha: " + password;
    }
}
