package bootcamp.módulo_iii_java_fundamental.estruturas_de_repetição_e_arrays_em_java.exercícios_arrays;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números, seus sucessores e seus antecessores.
*/

public class NumerosAleatorios {
    public static void main(String[] args) {
        
        Random random = new Random();

        int[] numerosAleatorios = new int[20];
    
        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numeros = random.nextInt(100);
            numerosAleatorios[i] = numeros;
        }

        System.out.print("\nNúmeros aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.println();

        System.out.print("\nSucessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }
        System.out.println();

        System.out.print("\nAntecessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero - 1) + " ");
        }

    }
}
