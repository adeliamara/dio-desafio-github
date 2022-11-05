package edu.introdutorio.metodos;

import java.util.Scanner;

public class SomatorioRecursivo {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        int number1 = numero.nextInt();

        //TODO: Imprima o somatório de N (utilize o método "somatorio").
        System.out.print(somatorio(number1));
    }

    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
