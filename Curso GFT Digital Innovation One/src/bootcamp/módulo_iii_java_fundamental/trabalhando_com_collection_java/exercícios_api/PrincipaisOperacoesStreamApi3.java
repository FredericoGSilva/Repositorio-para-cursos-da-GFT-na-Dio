package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_api;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class PrincipaisOperacoesStreamApi3 {
    public static void main(String[] args) {
        
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5"); 
        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma list: ");
        //Primeiro tenho q transformar essa Lista de String em uma Lista de Integer.

        System.out.println("Usando os 2 princípios da Stream API: Classe Anônima e a Interface Function - ");                                                    
        List<Integer> numerosInteiros = numerosAleatorios.stream().map(new Function<String,Integer>() {
            @Override
            public Integer apply(String numero) {
                return Integer.parseInt(numero);
            }
        })
        .filter(new Predicate<Integer>() {
            public boolean test(Integer numero) {
                if (numero % 2 == 0 && numero > 2) { 
                    return true;
                } else {
                    return false;
                }
            };
        })
        .collect(Collectors.toList());
        Iterator<Integer> iterator = numerosInteiros.iterator(); //Usando o iterator e o while p/ imprimir
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ 
        System.out.println("Usando os 3 princípios da Stream API: Classe Anônima, Function Interface e Lambda - ");
                                                                                                                                
        List<Integer> numerosInteiros2 = numerosAleatorios.stream().map((numeroString) -> Integer.parseInt(numeroString)).filter(numero -> numero % 2 == 0 && numero > 2).collect(Collectors.toList());

        Iterator<Integer> iterator2 = numerosInteiros2.iterator();
        while(iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("Usando os 4 princípios da Stream API: Classe Anônima, Function Interface, Lamba e Reference Method - ");

        List<Integer> numerosInteiros3 = numerosAleatorios.stream().map(Integer :: parseInt).filter(numero -> numero % 2 == 0 && numero > 2).collect(Collectors.toList());
        System.out.println(numerosInteiros3);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Mostre a média dos números: ");

        System.out.println("Usando os 2 princípios da Stream API: Classe Anônima e a Interface Function - ");
                            
        numerosAleatorios.stream()

        .mapToInt(new ToIntFunction<String>() { 
            public int applyAsInt(String numeros) {
                return Integer.parseInt(numeros);
            };
        }) 
        .average()
        .ifPresent(new DoubleConsumer() {
            @Override
            public void accept(double mediaDosNumeros) { //Imprimi
                System.out.println(mediaDosNumeros);
            }
        });
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("Usando os 4 princípios da Stream API: Classe Anônima, Function Interface, Lamba e Reference Method - ");
        
        numerosAleatorios.stream().mapToInt(numeros -> Integer.parseInt(numeros)).average().ifPresent(System.out :: println);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Remova os números ímpares: ");/*Aqui não irá trabalhar cm String pois o Stream não modifica a "fonte" 
                                                            e nesse exercícios é precisso modificar removendo números ímpares.*/

        System.out.println("Usando os 2 princípios da Stream API: Classe Anônima e a Interface Function - ");
        //1° - Converter a Lista de String em Lista de Integer como nos exercícios acima:
        List<Integer> numerosInteiros4 = numerosAleatorios.stream().map(new Function<String, Integer>() {
            public Integer apply(String numero) {
                return Integer.parseInt(numero);
            };
        }).collect(Collectors.toList());

        //2° - Agora q a Lista de String virou uma Lista de Inteiros irei remover os numeros ímpares:
        numerosInteiros4.removeIf(new Predicate<Integer>() {
            public boolean test(Integer numero) {
                if (numero % 2 != 0) { 
                    return true;
                } else {
                    return false;
                }
            };
        });
        System.out.println(numerosInteiros4);
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("Usando os 3 princípios da Stream API: Classe Anônima, Function Interface e Lambda - ");

        List<Integer> numerosInteiros5 = numerosAleatorios.stream().map(numero -> Integer.parseInt(numero)).collect(Collectors.toList());

        numerosInteiros5.removeIf(numero -> numero % 2 != 0);
        System.out.println(numerosInteiros5);

    }
}
   