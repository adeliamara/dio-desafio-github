package desafio;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        String[] letrasPalavra = palavra.split("");

        String palavra_invertida = "";

        for (int i = letrasPalavra.length - 1; i >= 0  ;i--){
            palavra_invertida += letrasPalavra[i];
        }

        String result = palavra_invertida.equals(palavra)?"TRUE":"FALSE";
        System.out.println(result);
    }
}
