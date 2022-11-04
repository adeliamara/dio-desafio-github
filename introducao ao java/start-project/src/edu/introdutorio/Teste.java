package edu.introdutorio;

public class Teste {

    public static void main(String[] args) {
        String primeiroNome = "Adelia";
        String segundoNome = "Carvallho0";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
