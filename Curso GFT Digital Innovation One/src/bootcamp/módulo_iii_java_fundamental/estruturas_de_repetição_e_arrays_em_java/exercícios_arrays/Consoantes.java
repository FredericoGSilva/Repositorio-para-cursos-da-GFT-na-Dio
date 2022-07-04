package bootcamp.módulo_iii_java_fundamental.estruturas_de_repetição_e_arrays_em_java.exercícios_arrays;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Consoantes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];

        int quantidadeConsoantes = 0;

        int i = 0;
        do {
            System.out.println("Digite uma letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {

                consoantes[i] = letra;
                quantidadeConsoantes++;
            }
            i++;
        } while (i < consoantes.length);

        scan.close();

        System.out.println("Consoantes: ");

        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.print(consoante + " ");
            }

        }
        System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);
    }
}
