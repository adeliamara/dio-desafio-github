package edu.introdutorio.metodos;

import java.util.Locale;
import java.util.Scanner;

public class Somatorio {



        public static void main(String[] args) {
            int A, N;

            Scanner input = new Scanner(System.in);
            A = input.nextInt();
            N = input.nextInt();
            int somatorio = 0;

            for(int i = A; i <= N; i++){
                if(i%A == 0){
                    somatorio+=i;
                }
            }

            System.out.println(somatorio);

        }
}
