package bootcamp.módulo_iii_java_fundamental.estruturas_de_repetição_e_arrays_em_java.exercícios_sobre_estrutura_de_repetição;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int fatorial;
        int multiplicacao = 1;//

        System.out.println("Digite um número: ");
        fatorial = scan.nextInt();

        scan.close();

        System.out.print(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--) { //i receber fatorial;  enquanto i maior ou igual 1;  i--;  Ou seja, fatorial tem q diminuir até chegar a 1 
            multiplicacao *= i;

        }

        System.out.println(multiplicacao);
    }
}
