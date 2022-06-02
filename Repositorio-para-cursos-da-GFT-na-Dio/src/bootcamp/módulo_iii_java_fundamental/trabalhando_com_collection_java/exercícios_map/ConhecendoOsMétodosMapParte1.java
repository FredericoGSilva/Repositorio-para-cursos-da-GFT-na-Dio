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

        Map<String, Double> carrosPopulares = new HashMap<>() {{//HashMap inseri de modo aleatório
            put("Gol", 14.4);//método put(): adicionar elemento
            put("Uno", 15.6); //a chave(key) não pode repetir, já o valor(value) pode
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carrosPopulares.toString());
        System.out.println("-----------------------------------------------------------------------------------------\n");

        /*Como n pode ter chaves repitidas, vou usa o método put() p/ fazer a substituição.
        Internamente irá verificar se já existe a chave gol e então só irá sobrescrever o valor. */
        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);
        System.out.println("-----------------------------------------------------------------------------------------\n");

        System.out.println("Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));// containsKey(): verifica a existência de uma chave no conjunto.
                                                                                                                        /*Tucson é o modelo e o modelo é a chave.
                                                                                                                            método containsKey(): "contém chave" --- eu passo a chave q quero verificar*/
        System.out.println("-----------------------------------------------------------------------------------------\n");
                
        System.out.println("Exiba o consumo do Uno: " + carrosPopulares.get("Uno"));// get: pega o objeto q em Map é a chave para retornar um valor
        System.out.println("-----------------------------------------------------------------------------------------\n");

       // System.out.println("Exiba o terceiro modelo adicionado: " );// Não existe um método para isso.

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();// KeySet(): retorna um Set. Colocar a chave.
        //coloquei em uma variável Set para mostrar q realmente retorna um Set. 
        System.out.println(modelos);
        System.out.println("-----------------------------------------------------------------------------------------\n");

        System.out.println("Exiba os consumos dos carros: ");              
        Collection<Double> consumos = carrosPopulares.values();// values(): retorna o valor. 
        System.out.println(consumos);
        //values retorna uma Colection   
        System.out.println("-----------------------------------------------------------------------------------------\n");                                                    

        /*Preciso saber qual é o carro, qual é o valor da chave q é mais eficiente.
        Ou seja, qual carro q faz mais quilometros por litro*/
        System.out.println("Exiba o modelos mais econômico: ");
        //Pegando o consumo(value) mais eficiente, o valor máximo do conjunto
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());// Collections.max() retorna uma Collection e values() retorna uma Collection cm todos os consumos
        // classe Collections irá usar o método min() p/ percorrer o conjunto carrosPopulares e "pegar" o menor valor.

        //Estou trabalhando com o Set:

        //agora tenho q descobir qual o carro q faz um consumo igual ao "consumoMaisEficiente"
        //precisso trabalha com chave e valor, de forma separada:
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();// entrySet(): método especial q retorna um Set e os elementos dentro desse Set é do tipo Entry
        // Interface Entry precisa de "key" e "values" e está dentro da Interface Map 

        String modeloMaisEficiente = "";// variável de controle

        for (Map.Entry<String,Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) { //se o primeiro elemento q eu pegar dentro do Set de entries(variável) 
                                                                //for igual ao consumoMaisEficiente:
                modeloMaisEficiente = entry.getKey(); //modeloMaisEficiente é igual a chave referente a esse valor(entry)
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - Seu consumo: " + consumoMaisEficiente); //todo modelo q tiver um consumo eficiente, será imprimido.
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------\n");   
    }
}
