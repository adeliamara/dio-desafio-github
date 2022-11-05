package edu.introdutorio.metodos;

import java.util.Locale;
import java.util.Scanner;

public class Igualdade {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in).useLocale(Locale.US);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if(number2 == number1){
            System.out.print("Sao iguais!");
        }else{
            System.out.print("Nao sao iguais!");
        }


    }

}
