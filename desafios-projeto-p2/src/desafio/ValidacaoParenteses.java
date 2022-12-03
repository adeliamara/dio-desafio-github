package desafio;

import java.util.Scanner;

public class ValidacaoParenteses {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        String[] aux = {"(",")", "[", "]", "{","}"};
        String[] arrayString = s.split("");
        if(s.length() == 0){
            return true;
        }
        for(int i = 0; i < aux.length-1; i++){
            if(arrayString[0].equals(aux[i])){
                if(arrayString[1].equals(aux[i+1])){
                    return true;
                }
            }
        }
        return false;

    }

}
