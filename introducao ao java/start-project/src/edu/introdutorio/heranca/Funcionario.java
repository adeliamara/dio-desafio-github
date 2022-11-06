package edu.introdutorio.heranca;


public class Funcionario {
    private int _matricula;
    private String _nome;
    private boolean _ativo = true;

    private  double _salario = 2000;

    Funcionario(int matricula, String nome, boolean ativo){
        this._matricula = matricula;
        this._nome = nome;
        this._ativo = ativo;
    }

    public double getBonificacao() {
        return this._salario * 0.15;
    }

    public int get_matricula() {
        return _matricula;
    }

    public String get_nome() {
        return _nome;
    }


    public double get_salario() {
        return _salario;
    }

    public boolean get_ativo() {
        return _ativo;
    }




}
