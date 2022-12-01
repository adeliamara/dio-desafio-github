package introCollections.ArrayList.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AVGTemperatura {

    public static void main(String[] args) {
        ArrayList<Double> tempeturas = new ArrayList<Double>();
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 6; i++){
            System.out.println("Insira a temperatura do mes " + i + ": ");
            Double temperatura = scan.nextDouble();
            tempeturas.add(temperatura);
        }

        System.out.println("==================================== ");

        System.out.println("Temperaturas: ");
        tempeturas.forEach(t-> System.out.print(t + " "));


        System.out.println(" \n ==================================== ");


        double media = tempeturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);

        System.out.printf("Media: %.1f", media);


        System.out.println(" \n ==================================== ");
        System.out.println(" \n Temperaturas acima da media: ");
        tempeturas.stream().
                filter(t -> t > media).
                forEach(System.out::println);


        Iterator<Double> iterator = tempeturas.iterator();

        int count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }
    }



}
