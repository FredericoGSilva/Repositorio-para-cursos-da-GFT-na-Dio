package bootcamp.módulo_iii_java_fundamental.estruturas_de_repetição_e_arrays_em_java.exercícios_arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {-5, -6, 15, 50, 8, 4};
        
        int contador = 0;

        System.out.println("Vetor normal");
        while (contador < (vetor.length)) {/*length retorna o tamanho do vetor. -1 é por causa do 0 
                                              length irá percorrer as posições e como eu tenho 6 elementos em 5 posições, p/ java entender q são não é 6 posições e sim 5*/

            System.out.print(vetor[contador] + " "); //Assim q iniciar o contador será 0 e mostrará vetor na posição 0 q será -5 ....
            contador++;
        }

        System.out.println("\nVetor inverso");
        for (int i = (vetor.length - 1); i >= 0; i--) {//O loop só irá parar quando o vetor chegar na posição 0.
            System.out.print(vetor[i] + " ");
        }
    }
}
