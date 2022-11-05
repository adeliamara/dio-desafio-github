package edu.introdutorio.metodos;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        int num = numero.nextInt();

        //TODO: Imprima o somatório de N (utilize o método "somatorio").

        if(verificarPalavra(num) == "nenhum"){
            System.out.print(num);
        }else{
            System.out.print(verificarPalavra(num));
        }

    }

    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static String verificarPalavra(int numero) {
        if (numero % 3 == 0) {
            if(numero % 5 == 0){
                return "FizzBuzz";
            }
            return "Fizz";
        } else if(numero % 5 == 0){
            return "Buzz";
        }
        return "nenhum";
    }
}
