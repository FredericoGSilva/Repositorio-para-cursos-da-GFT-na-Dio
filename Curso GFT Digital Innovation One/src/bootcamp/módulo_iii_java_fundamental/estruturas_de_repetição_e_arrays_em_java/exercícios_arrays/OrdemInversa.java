package bootcamp.módulo_iii_java_fundamental.estruturas_de_repetição_e_arrays_em_java.exercícios_arrays;

import java.util.Scanner;

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

        Scanner scan = new Scanner(System.in);
	
		int tamanho = 6;
		int[] vetorNumerosInteiros = new int[tamanho];//Criando o vetor com uma variável q representa o tamanho
	
		System.out.println("Digite 6 números: ");//testar se números diferentes repetem no Array ou não
		
		//adicionando o dado inserido pelo o usuário no vetor
		for(int i = 0; i <= (vetorNumerosInteiros.length - 1); i++) {// o Vetor têm 6 posições: 0 a 5 pois o 0 conta como posição. Por isso o -1 é para o loop não chamar uma posição 6 pois o vetor ficaria com o tamanho 7: 0 a 6
			vetorNumerosInteiros[i] = scan.nextInt();
		}
		scan.close();
		
		/*
		while(i < vetorNumerosInteiros.length) { // Posso fazer sem o -1 e e em vez de usar <= posso usar só < porque quando o loop chegar na posição 6 o loop n irá ler
			int numeros = scan.nextInt();
			vetorNumerosInteiros[i] = numeros;
			i++;
		}*/
		
		//mostrar os elementos do vetor, de trás para frente
		for(int i = vetorNumerosInteiros.length - 1; i >= 0; i--) {//aqui eu tb preciso colocar -1 pois como irá imprimir de trás para frente o loop precisa saber q a posição 6 está vazia pois as posições do Vetor vai de 0 a 5
			System.out.println(vetorNumerosInteiros[i]);		   //Loop irá percorrer enquanto i for maior ou igual a 0. Então quanto o loop chegar a 0 irá imprimir o vetor e o laço irá parar.
		}	
    }
}
