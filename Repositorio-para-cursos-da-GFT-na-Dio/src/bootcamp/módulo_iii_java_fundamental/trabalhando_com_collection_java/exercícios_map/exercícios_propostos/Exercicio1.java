package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_map.exercícios_propostos;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.sound.sampled.Line;

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
        Map<String, Integer> estadoPopulacao1 = new HashMap<>() { //HashMap organiza os elementos de forma aleatória com o a classe Random
            {
                put("PE", 9616621);
                put("AL", 3351543);
                put("CE", 9187103);
                put("RN", 3534265);
            }
        };
        Set<Map.Entry<String, Integer>> entry = estadoPopulacao1.entrySet(); //Como formatar casas decimais
        for (Map.Entry<String, Integer> recebeEntry : entry) {
            System.out.println("Estado = " + recebeEntry.getKey() + " - " 
                    + "População = " + recebeEntry.getValue());   
        }                                           
        System.out.println("-------------------------------------------------------------------------------------------------");
 /* 
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
        Map<String, Integer> estadoPopulacao2 = new LinkedHashMap<>() {{ //LinkedHashMap organiza os elementos de acordo cm o modo q foram inseridos
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estadoPopulacao2);
        System.out.println("-------------------------------------------------------------------------------------------------");

        System.out.println("Exiba os estados e suas populações e em ordem alfabética: ");
        Map<String, Integer> estadoPopulacao3 = new TreeMap<>(estadoPopulacao1);// Implementação TreeMap organiza os elementos de acordo cm sua ordem natural
        System.out.println(estadoPopulacao3);
        System.out.println("-------------------------------------------------------------------------------------------------");*/

        System.out.println("Exiba o estado com a menor população e sua quantidade: "); 

        Iterator<Integer> iterator2 = estadoPopulacao1.values().iterator();/*Eu até poderia ter usado o a interface Iterator mas ela só conseguiria retornar um tipo, 
                                                                            ou seja ou retorna String(Estado) ou retorna Integer(população)*/
        while (iterator2.hasNext()) {
            Integer recebeIterator = iterator2.next();
            if (recebeIterator.equals(Collections.min(estadoPopulacao1.values()))) {
                System.out.println(recebeIterator);
            }
        }
                                                                            
 /*       Set<Map.Entry<String, Integer>> entry2 = estadoPopulacao1.entrySet();//usando o primeiro dicionário criado lá em cima

        for (Map.Entry<String,Integer> recebeEntry : entry2) {
            if (recebeEntry.getValue().equals(Collections.min(estadoPopulacao1.values()))) {//se o valor de recebeEntry2(estadoPopulacao1) q estiver passando pelo loop for igual ao valor mínimo descoberto pelo Collections.min(estadoPopulacao1) 
                System.out.println("O estado com a menor população é: " + recebeEntry.getKey() + //esse recebeEntry será imprimido pois é o estado com menor população.
                " - Sua população é: " + recebeEntry.getValue());
            }
        }                                                                                                                                                       */ 
        System.out.println("-------------------------------------------------------------------------------------------------");

        System.out.println("Exiba o estado com a maior população e sua quantidade: ");//Igual ao exercício acima.

        Set<Map.Entry<String, Integer>> entry3 = estadoPopulacao1.entrySet();
        /*Diferente do exercício acima dessa vez irei criar uma variável auxiliar
          q irá armazenar os dados sobre o valor máximo no dicionário: */
        Integer valorMaximo = Collections.max(estadoPopulacao1.values());

        for (Map.Entry<String,Integer> recebeEntry4 : entry3) {
            if (recebeEntry4.getValue().equals(valorMaximo)) {
                System.out.println("O estado com a maior população é: " + recebeEntry4.getKey() +
                " - Sua população é: " + recebeEntry4.getValue());
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------------");

        System.out.println("Exiba a soma da população desses estados: ");//Estou usando o Set Entry do exercícios acima. 
        
        Iterator<Integer> iteranto = estadoPopulacao1.values().iterator();

        int somaDasPopulacoes = 0;

/*         while (iteranto.hasNext()) {
            somaDasPopulacoes += iteranto.next();
        }
        System.out.println("Soma das populaçoes: " + somaDasPopulacoes);
        
        for (Map.Entry<String,Integer> recebeEntry : entry3) {
            somaDasPopulacoes += recebeEntry.getValue();
        }
        System.out.println("Soma das populações: " + somaDasPopulacoes);            */
    
    }
}
