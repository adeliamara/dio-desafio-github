package introCollections.ArrayList;

import introCollections.ArrayList.ComparatorCor;
import introCollections.ArrayList.ComparatorIdade;
import introCollections.ArrayList.ComparatorNomeCorIdade;
import introCollections.ArrayList.Gato;

import java.util.*;

public class OrdenationList {

    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "Preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "Amarelo"));
        }};

        System.out.println("Exibindo gatos pela ordem de inserção");
        System.out.println((meusGatos));


        System.out.println("Exibindo gatos em ordem aleatoria");
        Collections.shuffle(meusGatos);
        System.out.println((meusGatos));


        System.out.println("Exibindo pela ordem natural");
        Collections.sort(meusGatos);
        System.out.println((meusGatos));

        //como o comparable ja foi utilizado, podemos usar o comparator
        System.out.println("Exibindo pela idade");
        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println((meusGatos));

        System.out.println("Exibindo pela cor");
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println((meusGatos));


        System.out.println("Exibindo pela cor");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        System.out.println((meusGatos));

        meusGatos.sort(new ComparatorIdade());

        List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');
        System.out.println(consoantesMeuNome);

        Set<String> coresDaBandeiraDoBrasil = new TreeSet<>(Arrays.asList("verde", "amarelo", "azul", "branco"));
        System.out.println(coresDaBandeiraDoBrasil);

    }
}
