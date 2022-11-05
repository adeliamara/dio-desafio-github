package edu.introdutorio.inputDados;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Input {

    public static void main (String[] args){
        Scanner scanner =  new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um texto");
        String text = scanner.next();
        System.out.print(text);

    }

}
