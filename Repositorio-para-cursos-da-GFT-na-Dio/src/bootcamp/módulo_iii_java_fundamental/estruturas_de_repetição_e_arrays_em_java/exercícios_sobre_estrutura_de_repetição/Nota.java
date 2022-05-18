package bootcamp.módulo_iii_java_fundamental.estruturas_de_repetição_e_arrays_em_java.exercícios_sobre_estrutura_de_repetição;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Insira uma nota de 0 a 10: ");
        nota = scan.nextInt();// variável nota irá receber um dado através do Scanner

        while (true) {

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Por favor insirá um valor entre 0 e 10: ");
                nota = scan.nextInt();
            } else {
                break;
            }
        }

        scan.close();
    }
}
