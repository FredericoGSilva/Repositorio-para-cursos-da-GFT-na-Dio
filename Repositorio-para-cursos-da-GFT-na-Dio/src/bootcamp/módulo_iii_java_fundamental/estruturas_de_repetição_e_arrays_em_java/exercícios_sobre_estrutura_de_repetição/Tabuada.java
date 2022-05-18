package bootcamp.módulo_iii_java_fundamental.estruturas_de_repetição_e_arrays_em_java.exercícios_sobre_estrutura_de_repetição;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.println("Escolha uma tabuada de 1 a 10");
        tabuada = scan.nextInt();

        for (int tentativas = 0; tentativas < 5; tentativas++) {
            if (tabuada < 1 || tabuada > 10) {
                System.out.println("Voce só pode escolher tabuadas do 1 ao 10.");
                tabuada = scan.nextInt();
            } else {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
                }
                break;
            }

        }
        
        scan.close();
    }
}
