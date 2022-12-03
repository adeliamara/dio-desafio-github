package desafio;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class QuadradoPerfeito {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.println(calculaNumQuadradosPerfeito(n));
    }

    public static boolean isQuadradoPerfeito(int n){
        Double raizQuadrada = Math.sqrt(n);
        return raizQuadrada == raizQuadrada.intValue();
    }

    public static int calculaNumQuadradosPerfeito(int n) {
        if (isQuadradoPerfeito(n)) {
            return 1;
        }
        int result = n;
        for (int i = 1; i*i < n; i++){
            result = Integer.min(result, 1 + calculaNumQuadradosPerfeito(n - i*i));
        }
        return result;
    }
}




