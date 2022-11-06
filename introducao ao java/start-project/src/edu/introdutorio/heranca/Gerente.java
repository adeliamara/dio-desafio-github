package edu.introdutorio.heranca;

public class Gerente extends Funcionario {

    Gerente(int matricula, String nome, boolean ativo){
        super(matricula, nome, ativo);

    }

    @Override
    public double getBonificacao() {
        return this.get_salario() * 0.25;
    }
}
