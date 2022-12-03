package desafio;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class ClassificandoMatrizes {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int i;
        int N = input.nextInt();
        int[] nums = new int[N];
        for (i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }
        //TODO: mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares
        int j = 0;
        boolean feitoTroca = false;


        for (i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                for (j = i; j < nums.length; j++) {
                    if (nums[j] % 2 == 0) {
                        int aux = nums[i];
                        nums[i] = nums[j];
                        nums[j] = aux;
                        feitoTroca = true;
                        break;
                    }
                }
                if (!feitoTroca) break;
            }

        }

        for (var entry : nums) {
            System.out.println(entry);
        }
    }
}
