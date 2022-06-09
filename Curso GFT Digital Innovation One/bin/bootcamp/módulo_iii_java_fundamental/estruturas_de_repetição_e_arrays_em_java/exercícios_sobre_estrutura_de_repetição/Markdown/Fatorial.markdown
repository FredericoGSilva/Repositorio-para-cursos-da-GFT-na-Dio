```java

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
        
        //para: variável i = numero, até i maior que 0, diminuimos 1 ao valor de i a cada loop.
        System.out.print(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--) { //i receber fatorial;  enquanto i maior ou igual 1;  i--;  Ou seja, fatorial tem q diminuir até chegar a 1 
            multiplicacao *= i;//multiplicamos os valores de i e armazenamos na variável multiplicação

        }

        System.out.println(multiplicacao);
    }
```