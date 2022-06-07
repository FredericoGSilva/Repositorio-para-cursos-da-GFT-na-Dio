package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_map.exercícios_propostos;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

public class Exercicio1 {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário e relacione os estados e suas populações: ");
        Map<String, Integer> estadoPopulacao1 = new HashMap<>() {
            {
                put("PE", 9616621);
                put("AL", 3351543);
                put("CE", 9187103);
                put("RN", 3534265);
            }
        };
        Set<Map.Entry<String, Integer>> entry = estadoPopulacao1.entrySet(); 
        for (Map.Entry<String, Integer> recebeEntry : entry) {
            System.out.println("Estado = " + recebeEntry.getKey() + " - " 
                    + "População = " + recebeEntry.getValue());   
        }                                           
        System.out.println("-------------------------------------------------------------------------------------------------");
  
        System.out.println("Substitua a população do estado do RN por 3.534.165: ");
        estadoPopulacao1.put("RN", 3534165);
        System.out.println(estadoPopulacao1);
        System.out.println("-------------------------------------------------------------------------------------------------");

        System.out.println("Confira se o estado de PB está no dicionário, caso não esteja, adicione PB - 4.039.277:");
        if (estadoPopulacao1.containsKey("PB")) {
            System.out.println("Contém PB");
        } else {
            estadoPopulacao1.put("PB", 4039277);
        } 
        System.out.println(estadoPopulacao1);
        System.out.println("-------------------------------------------------------------------------------------------------");

        System.out.println("Exiba a população de PE: ");
        System.out.println(estadoPopulacao1.get("PE"));
        System.out.println("-------------------------------------------------------------------------------------------------");                     

        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado: ");
        Map<String, Integer> estadoPopulacao2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estadoPopulacao2);
        System.out.println("-------------------------------------------------------------------------------------------------");

        System.out.println("Exiba os estados e suas populações e em ordem alfabética: ");
        Map<String, Integer> estadoPopulacao3 = new TreeMap<>(estadoPopulacao1);
        System.out.println(estadoPopulacao3);
        System.out.println("-------------------------------------------------------------------------------------------------");

        System.out.println("Exiba o estado com a menor população e sua quantidade: ");                                                     
        Set<Map.Entry<String, Integer>> entry2 = estadoPopulacao1.entrySet();
        for (Map.Entry<String,Integer> recebeEntry : entry2) {
            if (recebeEntry.getValue().equals(Collections.min(estadoPopulacao1.values()))) {
                System.out.println("O estado com a menor população é: " + recebeEntry.getKey() + 
                " - Sua população é: " + recebeEntry.getValue());
            }
        }                                                                                                                                                        
        System.out.println("-------------------------------------------------------------------------------------------------");

        System.out.println("Exiba o estado com a maior população e sua quantidade: ");
        Set<Map.Entry<String, Integer>> entry3 = estadoPopulacao1.entrySet();
        Integer valorMaximo = Collections.max(estadoPopulacao1.values());
        for (Map.Entry<String,Integer> recebeEntry4 : entry3) {
            if (recebeEntry4.getValue().equals(valorMaximo)) {
                System.out.println("O estado com a maior população é: " + recebeEntry4.getKey() +
                " - Sua população é: " + recebeEntry4.getValue());
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------------");

        System.out.println("Exiba a soma da população desses estados: ");
        Iterator<Integer> iteranto = estadoPopulacao1.values().iterator();
        int somaDasPopulacoes = 0;
         while (iteranto.hasNext()) {
            somaDasPopulacoes += iteranto.next();
        }
        System.out.println("Soma das populaçoes: " + somaDasPopulacoes);  
        System.out.println("-------------------------------------------------------------------------------------------------"); 

        System.out.println("Exiba a média da população deste dicionário de estados: " + (somaDasPopulacoes / estadoPopulacao1.size()));
        System.out.println("-------------------------------------------------------------------------------------------------");
        
        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator = estadoPopulacao1.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 4000000) {
                iterator.remove();
            }
        }
        System.out.println(estadoPopulacao1);
        System.out.println("-------------------------------------------------------------------------------------------------");

        System.out.println("Apague o dicionário: ");
        estadoPopulacao1.clear();

        System.out.println("Confira se o dicionário está vazio: ");
        System.out.println(estadoPopulacao1.isEmpty());
    }
}
