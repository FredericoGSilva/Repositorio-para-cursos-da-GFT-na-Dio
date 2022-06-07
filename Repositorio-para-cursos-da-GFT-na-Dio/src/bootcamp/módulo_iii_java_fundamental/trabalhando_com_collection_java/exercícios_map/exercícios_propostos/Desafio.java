package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_map.exercícios_propostos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/*
Faça um programa que simule um lançamento de dados. 
- Lance o dado 100 vezes e armazene.
- Depois, mostre quantas vezes cada valor foi conseguido.
 */

public class Desafio {
    public static void main(String[] args) {
                                                                     
        //CADA ÍNDICE MOSTRA UM NÚMERO GERADO

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantas vezes o loop ocorrerá: ");
        int quantidadeDeLoop = scan.nextInt();

        List<Integer> listaDeDados = new ArrayList<>();

        for (int i = 0; i < quantidadeDeLoop; i++) {
            int contador = 0;
            Random geraNumeros = new Random();
            int recebe = geraNumeros.nextInt(100);
            listaDeDados.add(recebe);
        }
        //System.out.println(listaDeDados);
        

        Map<Integer, Integer> mapDados = new HashMap<>() {
            {  
                int i = 0;
                int contador = 0;
               while (i < quantidadeDeLoop) {
                   put(contador += 1, listaDeDados.get(i));
                   i++;
               }                                                                                                 
            }
        };

        Set<Map.Entry<Integer, Integer>> entry = mapDados.entrySet();

        for (Map.Entry<Integer,Integer> recebeEntry : entry) {
            System.out.println(recebeEntry.getKey() + " - " + recebeEntry.getValue());
        }                    
    }
}