package bootcamp.módulo_iii_java_fundamental.estruturas_de_repetição_e_arrays_em_java.exercícios_arrays;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o menor número da matriz e a sua posição(linha, coluna).
*/

public class ArrayMultidimensional {
    public static void main(String[] args) {
        
        Random random = new Random();

        int[][] matriz = new int[4][4]; 
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(9);
            }
        }

        System.out.println("\nMatriz\n"); 
        for (int[] linha : matriz) {
            for (int elementoDaColuna : linha) {
                System.out.print(elementoDaColuna + " ");
            }
            System.out.println(); 
        }
    }
}