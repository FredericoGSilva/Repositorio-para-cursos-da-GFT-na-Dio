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

        System.out.println("Exiba o modelo menos econômico e seu consumo - ");

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());   
        Set<Map.Entry <String, Double>> entries = carrosPopulares.entrySet();

        String modeloMenosEficiente = "";

        for (Map.Entry<String,Double> entry : entries) {
            if (entry.getValue().equals(consumoMenosEficiente)) { 
                modeloMenosEficiente = entry.getKey(); 
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

        //Também consigo usar o Iterator e o laço while

        Iterator<Double> iterator = carrosPopulares.values().iterator(); 
        Double soma2 = 0.0;
        while (iterator.hasNext()) {
            soma2 += iterator.next();
        }
        System.out.println("Soma dos consumos usando Iterator: " + soma2);
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma2 / carrosPopulares.size()));

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Remova os modelos com o consumo igual a 15,6km/l: ");

        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while (iterator2.hasNext()) {
            Double remover = iterator2.next();
            if (remover == 15.6) {
                iterator2.remove();
            }
        }                                                                          
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
        System.out.println("Usando Set Entry: ");
        for (Map.Entry<String,Double> entry2 : entries2) {
            System.out.println(entry2.getKey());
        }
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares);
        System.out.println("Usando TreeMap: " + carrosPopulares3);
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionário está vazia: ");
        System.out.println(carrosPopulares.isEmpty());
        System.out.println("Vazio: " + carrosPopulares);
         
    }
}
