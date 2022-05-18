```java

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

        //A cada loop, é pego um número digitado pelo usuário.
        do {
            System.out.println("\nInsira um número");
            numeros = scan.nextInt();

            calculoSoma += numeros;//soma um número com o a anterior a cada loop.

            if (numeros % 2 == 0) {//a cada laço, o número da "vez" irá ser dividido por 2, assim irá verificar se o número é par ou ímpar.
                System.out.println("O número " + numeros + " é par.\n");
                quantidadeDeNumerosPares++;//conta quantos números ímpares tem
            } else {
                System.out.println("O número " + numeros + " é ímpar.\n");
                quantidadeDeNumerosImpares++;//conta quantos números ímpares tem
            }
            
            i++;
            
        } while (i < quantidadeDeNumeros);

        System.out.println("Soma dos números inseridos: " + calculoSoma);
        System.out.println("Quantidade de números pares: " + quantidadeDeNumerosPares);
        System.out.println("Quantidade de números ímpares: " + quantidadeDeNumerosImpares);

        scan.close();
    }
}
```