package introCollections.ArrayList;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adIciona 7 notas");

        //List notas = new ArrayList(); //antes do Java 5
        //A partir do Java5, foi implementado o conceito de Generics
        //List<Double> notas = new ArrayList<>(); //Diamond operator (não precisa colocar o tipo na <>)
        //ArrayList<Double> notas = new ArrayList<>(); // nao recomenado, melhor programar focado na interface e nao na implementação
        // List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5,0d));
        /*List<Double> notas = Arrays.asList(7d, 8.5, 5d); // nao é possível adicionar nem retirar elementos dessa list
        notas.add(10d);
        notas.remove(8.5d);
        System.out.println(notas);*/

        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5: " + notas.indexOf(5d));

        System.out.println("Adicione na posição 4 da lista a nota 8: ");
        notas.add(4, 8d);
        System.out.println(notas.toString());

        System.out.println("Substitua a nota 5 pela nota 6: ");
        notas.set(notas.indexOf(5d),6d);
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5 esta na lista: " + notas.contains(5d));

        System.out.println("Imprima as notas individualmente na ordem que foram infomadas: ");
        for (Double nota: notas) {
            System.out.println(nota);
        }
        System.out.println("Exiba a terceira nota adiciona: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println(notas.toString());

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba media dos valores: " + soma/notas.size());

        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores do que 7");
        Iterator<Double> iterator1 = notas.iterator();

        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista esta vazia: " + notas.isEmpty()) ;


    }

}
