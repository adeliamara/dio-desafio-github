package edu.introdutorio.testeArgumentos;

public class AverageFinder {
    public static void main(String[] args) {
        System.out.println("Average finder v0.1");
        double average = findAverage(args);
        System.out.println("The average is " + average);
    }

    private static double findAverage(String[] args) {
        double result = 0;
        int length = args.length;
        for (String s : args) {
            result += Integer.parseInt(s);
        }
        return result/length;
    }
}