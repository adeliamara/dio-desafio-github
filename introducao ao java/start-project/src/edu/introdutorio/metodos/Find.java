package edu.introdutorio.metodos;

import java.util.Scanner;

public class Find {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        int numeroBuscado = leitor.nextInt();

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

        buscaNumero(elementos, numeroBuscado);

    }


    public static void buscaNumero(int[] elementos, int numeroBuscado){
        for(int i=0; i< elementos.length;i++){
            if(elementos[i] == numeroBuscado) {
                System.out.print("Achei " + numeroBuscado + " na posicao " + i);
                return;
            }
        }
        System.out.print("Numero " + numeroBuscado + " nao encontrado!");
    }
}
