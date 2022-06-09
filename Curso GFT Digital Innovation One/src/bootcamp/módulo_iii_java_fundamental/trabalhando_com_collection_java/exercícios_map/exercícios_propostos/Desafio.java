package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_map.exercícios_propostos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
Faça um programa que simule um lançamento de dados. 
- Lance o dado 100 vezes e armazene.
- Depois, mostre quantas vezes cada valor foi conseguido.
 */

public class Desafio {
    public static void main(String[] args) {

        int quantidade = 100; 

        List<Integer> listaDeDados = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) { 
            Random geraNumero = new Random();
            int guardaNumero = geraNumero.nextInt(6) + 1;
            listaDeDados.add(guardaNumero);
        }
        System.out.println(listaDeDados);

        Map<Integer, Integer> mapDados = new HashMap<>(); 
        for (Integer recebeLista : listaDeDados) { 
            if (mapDados.containsKey(recebeLista)) {
                mapDados.put(recebeLista, mapDados.get(recebeLista) + 1); 
            } else {
                mapDados.put(recebeLista, 1);
            }
        }

        System.out.println(mapDados);
        
        for (Map.Entry<Integer, Integer> recebeMapEntry : mapDados.entrySet()) {
            System.out.println(recebeMapEntry.getKey() + " - " + recebeMapEntry.getValue());
        }                  

    }
}
