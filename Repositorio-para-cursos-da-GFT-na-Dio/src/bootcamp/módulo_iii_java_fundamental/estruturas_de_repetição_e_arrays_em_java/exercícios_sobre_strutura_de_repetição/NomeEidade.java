package bootcamp.módulo_iii_java_fundamental.estruturas_de_repetição_e_arrays_em_java.exercícios_sobre_strutura_de_repetição;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare inserindo o valor 0 no campo nome)
*/

public class NomeEidade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");

            nome = scan.next();
            if (nome.equals("0")) {
                break;
            }

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui....");

        scan.close();

    }

}