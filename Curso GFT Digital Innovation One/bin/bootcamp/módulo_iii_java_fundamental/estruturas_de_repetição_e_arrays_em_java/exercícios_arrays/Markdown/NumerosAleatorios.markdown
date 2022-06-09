```java

/*
Faça um Programa que leia 20 números inteiros (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números, seus sucessores e seus antecessores.
*/

public class NumerosAleatorios {
    public static void main(String[] args) {
        
        //Random = classe q gera números aleatóios
        Random random = new Random();

        int[] numerosAleatorios = new int[20];
    
        //loop p/ colocar valores nessas 20 posições do Array
        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numeros = random.nextInt(100);//variável número receberá a cada loop um número aleatório, até 100
            numerosAleatorios[i] = numeros;//Array irá ser preenchido com os numeros aletório gerado pelo Random
        }

        //imprimir números gerados, seus sucessores e antecessores
        //para imprimir o for each é mais recomentado
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


```