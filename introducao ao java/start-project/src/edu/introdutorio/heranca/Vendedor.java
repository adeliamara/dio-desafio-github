package edu.introdutorio.heranca;

public class Vendedor extends Funcionario{

    Vendedor(int matricula, String nome, boolean ativo){
        super(matricula, nome, ativo);
    }

    @Override
    public double getBonificacao() {
        return this.get_salario() * 0.05;
    }

}
