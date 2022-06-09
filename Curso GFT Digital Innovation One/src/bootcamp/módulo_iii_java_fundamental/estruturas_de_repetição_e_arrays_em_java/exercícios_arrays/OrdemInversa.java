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
        while (contador <= (vetor.length -1)) {
            System.out.print(vetor[contador] + " "); 
            contador++;
        }

        System.out.println("\nVetor inverso");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
