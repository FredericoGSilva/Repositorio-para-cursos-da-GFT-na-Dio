package bootcamp.módulo_iii_java_fundamental.estruturas_de_repetição_e_arrays_em_java.exercícios_arrays;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o menor número da matriz e a sua posição(linha, coluna).
*/

public class ArrayMultidimensional {
    public static void main(String[] args) {
        
        Random random = new Random();//classe q gera números aleatórios

        //Matriz --- cada linha representa um Array
        int[][] M = new int[4][4];
        
        //Primeiro for irá navegar dentro da matriz geral
        //i < M.length --- loop só para quando i for menor q o tamanho da matriz
        for (int i = 0; i < M.length; i++) {//i representa cada linha da matriz e cada linha vai ter vários elementos dentro
            
            //j < M[j].length --- 
            for (int j = 0; j < M[i].length; j++) {// j é cada coluna dentro da linha i. esse loop é percorrido até j ser menor do q o tamanho da linha i
                M[i][j] = random.nextInt(9);//Na matriz M [linha i] [coluna j] será inserido um número aleatório.
            }
        }

        System.out.println("\nMatriz"); 
        for (int[] linha : M) {//Irá navegar e pegar cada elemento da primeira linha e vai imprimir
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
