```java

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class MaiorEmenor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = 0;
        int numero;
        int maior = 0;// Irá armazenar o maior número
        int media = 0; // Irá armazenar a média dos números

        do {
            System.out.println("Insirá um número: ");
            numero = scan.nextInt();

            if (numero > maior) { // Se variável "numero" for maior q a variável "maior", "maior" recebe "numero".
                maior = numero;
            }
            media += numero;

            i++;
        } while (i < 5);

        media /= 5;//media está somou todos os 5 números inseridos e agora dividi pela quantidade d números inseridos

        System.out.println("O maior número é: " + maior);
        System.out.println("A média dos 5 números é: " + media);

        scan.close();
    }
}
```