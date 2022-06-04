package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_map;

import java.util.*;

public class ConhecendoOsMétodosMapParte1 {
    public static void main(String[] args) {
/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:

Modelo é a chave e o consumo é o valor: 
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */
//          Algumas formas de iniciar o Map:
//        Map carrosPopulares2020 = new HashMap(); //antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)
        
        System.out.println("\nCrie um dicionário que relacione os modelos e seus respectivos consumos: ");

        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("Gol", 14.4);
            put("Uno", 15.6); 
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());
        System.out.println("-----------------------------------------------------------------------------------------\n");

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);
        System.out.println("-----------------------------------------------------------------------------------------\n");

        System.out.println("Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));
        System.out.println("-----------------------------------------------------------------------------------------\n");
                
        System.out.println("Exiba o consumo do Uno: " + carrosPopulares.get("Uno"));
        System.out.println("-----------------------------------------------------------------------------------------\n");

       // System.out.println("Exiba o terceiro modelo adicionado: " );// Não existe um método para isso.

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        System.out.println("-----------------------------------------------------------------------------------------\n");

        System.out.println("Exiba os consumos dos carros: ");              
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos); 
        System.out.println("-----------------------------------------------------------------------------------------\n");                                                    

        System.out.println("Exiba o modelos mais econômico: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());

        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();

        String modeloMaisEficiente = "";

        for (Map.Entry<String,Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) { 
                modeloMaisEficiente = entry.getKey(); 
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - Seu consumo: " + consumoMaisEficiente);
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------\n");   
    }
}
