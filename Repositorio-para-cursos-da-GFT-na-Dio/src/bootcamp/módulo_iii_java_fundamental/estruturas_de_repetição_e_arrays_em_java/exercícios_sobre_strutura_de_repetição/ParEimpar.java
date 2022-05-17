package bootcamp.módulo_iii_java_fundamental.estruturas_de_repetição_e_arrays_em_java.exercícios_sobre_strutura_de_repetição;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class ParEimpar {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
    
        int quantidadeDeNumeros;
        int numeros;
        int calculoSoma = 0;
        int quantidadeDeNumerosPares = 0; int quantidadeDeNumerosImpares = 0;
        int i = 0;

        System.out.println("\nQuantidade de números: ");
        quantidadeDeNumeros = scan.nextInt();

        do {
            System.out.println("\nInsira um número");
            numeros = scan.nextInt();

            calculoSoma += numeros;

            if (numeros % 2 == 0) {
                System.out.println("O número " + numeros + " é par.\n");
                quantidadeDeNumerosPares++;
            } else {
                System.out.println("O número " + numeros + " é ímpar.\n");
                quantidadeDeNumerosImpares++;
            }
            
            i++;
            
        } while (i < quantidadeDeNumeros);

        System.out.println("Soma dos números inseridos: " + calculoSoma);
        System.out.println("Quantidade de números pares: " + quantidadeDeNumerosPares);
        System.out.println("Quantidade de números ímpares: " + quantidadeDeNumerosImpares);

        scan.close();
    }
}
