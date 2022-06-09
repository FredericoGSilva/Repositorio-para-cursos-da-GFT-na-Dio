```java

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args) {
        
        //Array unidimensional --- apenas uma linha
        int[] vetor = {-5, -6, 15, 50, 8, 4};
        
        int contador = 0;

        System.out.println("Vetor normal");
        while (contador <= (vetor.length -1)) {/*length retorna o tamanho do vetor. -1 é porque o vetor começa no 0  
                                              length irá percorrer as posições e como eu tenho 6 elementos em 5 posições, p/ java entender q não é 6 posições e sim 5*/

            System.out.print(vetor[contador] + " "); //Assim q iniciar o contador será 0 e mostrará vetor na posição 0 q será o elemento -5 e assim seguirá o loop até contador ser menor ou igual ao vetor.length-1
            contador++;                                 /*Poderia declarar contador < vetor.length q daria o mesmo resultado 
                                                        pois quando "contador" chegasse na posição 6, o espaço estaria vazio e não seria valeria*/ 
        }

        System.out.println("\nVetor inverso");
        /*como vetor será lido d trás p/ frente, tenho q declarar length -1 para q a posição 6 q está vazia n seja lida*/
        for (int i = (vetor.length - 1); i >= 0; i--) {//loop irá parar quando o i for menor ou igual a 0.
            System.out.print(vetor[i] + " ");           //O loop só irá parar quando o vetor chegar na posição 0.

        }
    }
}

```