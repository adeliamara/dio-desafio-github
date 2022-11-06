package edu.introdutorio.heranca;

public class App {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(1, "Joao", true);

        Funcionario gerente = new Gerente(2, "Pedro", false);
        Funcionario vendedor = new Vendedor(3, "Maria", true);

        System.out.print(funcionario.getBonificacao());
        System.out.print(gerente.getBonificacao());
        System.out.print(vendedor.getBonificacao());

    }
}







