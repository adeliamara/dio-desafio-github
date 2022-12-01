package introCollections.ArrayList;

import java.util.Comparator;

public class Gato implements Comparable<Gato>{
    private String _nome;
    private Integer _idade;
    private String _cor;

    public  Gato(String nome, Integer idade, String cor){
        _nome = nome;
        _idade = idade;
        _cor = cor;
    }

    public String get_nome() {
        return _nome;
    }


    public Integer get_idade() {
        return _idade;
    }


    public String get_cor() {
        return _cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "_nome='" + _nome + '\'' +
                ", _idade=" + _idade +
                ", _cor='" + _cor + '\'' +
                '}';
    }


    @Override
    public int compareTo(Gato gato) {
        return this.get_nome().compareToIgnoreCase(gato.get_nome());
    }
}


class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.get_idade(), g2.get_idade());
    }
}

class ComparatorCor implements  Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.get_cor().compareToIgnoreCase(g2.get_cor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.get_nome().compareToIgnoreCase(g2.get_nome());
        if(nome!=0){
            return nome;
        }

        int idade = Integer.compare(g1.get_idade(), g2.get_idade());
        if(idade!=0){
            return idade;
        }

        return g1.get_cor().compareToIgnoreCase(g2.get_cor());

    }
}
