package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ConhecendoOsMétodosMapParte2 {
    public static void main(String[] args) {
    
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("Gol", 15.2);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }}; 

        System.out.println("Exiba o modelo menos econômico e seu consumo - ");//Exercício será resolvido do mesmo jeito q o último exercício na parte 1

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());// classe Collections irá usar o método min() p/ percorrer o conjunto carrosPopulares e "pegar" o menor valor.
                                                                                //values() retorna uma coleçção(Collections) de valores

        /*Depois q descubro qual é o menor valor, tenho q descobrir qual é a chave que possui esse menor valor 
            ou seja, descobrir qual carro(Key) q faz um consumo igual ao consumoMenosEficiente(value)*/ 

        //Estudar sobre Entry --- lembra um Iterator                                                             
        Set<Map.Entry <String, Double>> entries = carrosPopulares.entrySet();// entrySet(): retorna um Set e dentro desse Set eu posso manipular chaves e valores separadamente

        /* 1 - Collections.min() irá pegar o menor valor do conjunto e será guardada na variável consumoMenosEficiente
           2 - entrySet() irá "navegar" o conjunto e separar chaves e valores.
           3 - No forEach entries irá percorrer o conjunto e irá verificar: 
           se o valor do elemento q está passando pelo loop for igual o valor mínimo q está na varável consumoMenosEficiente:
           então o modeloMenosEficiente.*/

        String modeloMenosEficiente = "";

        for (Map.Entry<String,Double> entry : entries) {
            if (entry.getValue().equals(consumoMenosEficiente)) { // se o valor do entry q está passando pelo loop, for igual ao consumoMenosEficiente 
                modeloMenosEficiente = entry.getKey(); /*a chave(key) q se liga ao valor(value) é o modeloMenosEficiente. --- 
                                                        entry é o elemento q está no momento passando pelo loop e getKet() é chave do elemento*/
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + 
                " - Consumo: " + consumoMenosEficiente);
            }
        }
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Exiba a soma dos consumos - ");

        Set<Map.Entry<String, Double>> entry = carrosPopulares.entrySet();
        Double soma = 0.0;
        for (Map.Entry<String,Double> entry2 : entry) {
            soma += entry2.getValue();
        }
        System.out.println("Soma dos consumos usando o entrySet(): " + soma);

        //Também consigo usar o Iterator 

        Iterator<Double> iterator = carrosPopulares.values().iterator(); //values(): é para o iterator irá andar polo conjunto e irá "interagir" só cm os valores
        Double soma2 = 0.0;
        while (iterator.hasNext()) {
            soma2 += iterator.next();
        }
        System.out.println("Soma dos consumos usando Iterator: " + soma2);
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma2 / carrosPopulares.size()));

        System.out.println("----------------------------------------------------------------------------------------");
        /*
        System.out.println("Remova os modelos com o consumo igual a 15,6km/l: ");

        Iterator<Double> iterator2 = carrosPopulares.values().iterator();

        while (iterator2.hasNext()) {
            Double remover = iterator2.next();
            if (remover == 15.6) {
                iterator2.remove();
            }
        }                                                                           */
        System.out.println(carrosPopulares.toString());
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Exiba todos os carros na ordem que foram informados: ");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>() {{
            put("Gol", 15.2);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }}; 
        System.out.println(carrosPopulares2.toString());
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        
        Set<Map.Entry<String, Double>> entries2 = carrosPopulares.entrySet();
        
        for (Map.Entry<String,Double> entry2 : entries2) {
            System.out.println(entry2.getKey());
        }

        /*Tb poderia usar a implementação TreeMap pois ele organiza 
        os elementos pelas chaves e nesse caso a chave é o modelo.
        Se as chaves forem número: ordem numérica.
        Se as chaves forem palavras: ordem alfabética.*/
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares);
        System.out.println(carrosPopulares3);
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear(); // apagando o dicionário

        System.out.println("Confira se o dicionário está vazia: ");
        System.out.println(carrosPopulares.isEmpty());//conferindo se o dicionário está vazio
        System.out.println("Vazio: " + carrosPopulares);
         
    }
}
