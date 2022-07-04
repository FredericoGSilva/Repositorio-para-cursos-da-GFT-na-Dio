package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_api;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrincipaisOperacoesStreamApi2 {
    public static void main(String[] args) {
        
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("1 - Imprima todos os elementos dessa Lista String: ");
        
        System.out.println("Classe Anônima - ");
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String numerosDaListaStream) { 
                System.out.println(numerosDaListaStream);
            }
        });

        System.out.println("Lambda - ");
        numerosAleatorios.stream().forEach(numeros -> System.out.println(numeros)); 

        System.out.println("Reference Method - ");  
        numerosAleatorios.stream().forEach(System.out :: println);   

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");  
    
        System.out.println("2 - Pegue os 5 primeiros números e coloque dentro de um Set: ");

        System.out.println(" Reference Method - ");
        numerosAleatorios.stream().limit(5 + 1).collect(Collectors.toSet()).forEach(System.out :: println);

        System.out.println(" O mesmo resultado mas agora passando o List para um Set de um jeito mais explícito - ");
        Set<String> numerosAleatorios2 = numerosAleatorios.stream().limit(5 + 1).collect(Collectors.toSet());
        Iterator<String> iteraSet = numerosAleatorios2.iterator();
        while (iteraSet.hasNext()) {
            System.out.println(iteraSet.next());
        }

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Transforme esta lista de String em uma lista de números inteiros: ");

        System.out.println("Function Interface - ");
        numerosAleatorios.stream().
        map(new Function<String, Integer>() {
            @Override
            public Integer apply(String lista) {
                return Integer.parseInt(lista);
            }
        })
        .collect(Collectors.toList());                                                    
        System.out.println(numerosAleatorios);

        System.out.println("Lambda - ");
        numerosAleatorios.stream().map((lista) -> Integer.parseInt(lista)).collect(Collectors.toList());
        for(String imprimiLista : numerosAleatorios) {
            System.out.println(imprimiLista);
        }
        
        System.out.println("Reference Method - ");
        numerosAleatorios.stream().map(Integer :: parseInt).collect(Collectors.toList())
        .forEach(System.out :: println); 
    
    }
}
