package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_api;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PrincipaisOperacoesStreamApi3 {
    public static void main(String[] args) {
        
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5"); 

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma list: ");

        //Primeiro tenho q transformar essa Lista de String em uma Lista de Integer.

        System.out.println("Usando os 2 princípios da Stream API: Classe Anônima e a Interface Function - ");
        //Colocar toda a operação em uma variável:                                                      
        List<Integer> numerosInteiros = numerosAleatorios.stream().map(new Function<String,Integer>() {
            @Override
            public Integer apply(String numero) {
                return Integer.parseInt(numero);
            }
        })
        //Depois de transformar uma lista de String em um Stream de Inteiros, tenho q filtrar(filter()) pegando os pares maiores q 2.
        .filter(new Predicate<Integer>() {//Predicate(): Interface Funcional recebe um valor genérico e retorna um booleano.
            public boolean test(Integer numero) {
                if (numero % 2 == 0 && numero > 2) { //se o resto da divisão de numero / 2 for 0: numero é par e o numero têm q ser maior q 2.
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
 
        System.out.println("Usando os 3 princípios da Stream API: Classe Anônima, Function Interface e Lambda - ");
                                                                                                                                //n precisa declarar p/ retornar true ou false pois o Lambda já entende q ou é true ou false.
        List<Integer> numerosInteiros2 = numerosAleatorios.stream().map((numeroString) -> Integer.parseInt(numeroString)).filter(numero -> numero % 2 == 0 && numero > 2).collect(Collectors.toList());
        /*map() poderia converter os elementos String para Inteiros usando o Reference Method: 
            map(Integer :: parseInt)*/

        Iterator<Integer> iterator2 = numerosInteiros2.iterator();
        while(iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        System.out.println("Usando os 4 princípios da Stream API: Classe Anônima, Function Interface, Lamba e Reference Method - ");

        List<Integer> numerosInteiros3 = numerosAleatorios.stream().map(Integer :: parseInt).filter(numero -> numero % 2 == 0 && numero > 2).collect(Collectors.toList());
                                                            //acima eu usei Lambda no map() já aqui eu usei Reference Method no map()

        System.out.println(numerosInteiros3);

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Mostre a média dos números: ");

        System.out.println("Usando os 2 princípios da Stream API: Classe Anônima e a Interface Function - ");
                            
        numerosAleatorios.stream()
        //mapToInt(): irá mapear cada Stream e irá pegar cada um. Além de permitir manipulações. mapToInt() pede uma função.
        //Parecido cm o método map() usado em exercícios anteriores.
        .mapToInt(new ToIntFunction<String>() { 
            public int applyAsInt(String numeros) {
                return Integer.parseInt(numeros);
            };
        }) 
        //average():retorna um OptionalDouble descrevendo a média aritmética dos elementos deste fluxo, ou um opcional vazio se este fluxo estiver vazio.(caso especial de redução)
        //Optional trabalha com cm números null p/ evitar retorno null 
        //como average() retorna um Optional 
        .average()
        //Tenho q usar o método ifPresente() q encapsula o retorno d métodos e informa se um valor está presente ou não.
        //ifPresent() evita erros NullPointerException e n faz verificação d valor nulo. 
        .ifPresent(new DoubleConsumer() {// DoubleConsumer<>: interface funcional cujo o método funcional é accept(Object) q aceita um argumento de valor duplo e n retorna nada. 
            @Override
            public void accept(double mediaDosNumeros) { //Imprimi
                System.out.println(mediaDosNumeros);
            }
        });

        System.out.println("Usando os 4 princípios da Stream API: Classe Anônima, Function Interface, Lamba e Reference Method - ");
        
        numerosAleatorios.stream().mapToInt(numeros -> Integer.parseInt(numeros)).average().ifPresent(System.out :: println);
        /*mapToInt() poderia converter os elementos de String para Inteiros usando Rference Method:
            mapToInt(Integer :: parseInt)*/ 

        /*Resumo: Irá tentar fazer a média.(average())
                se a média conseguir ser cálculada(ifPresent()),
                ela será exibida.(accept()) 
                se a média não conseguir ser calculado nada irá acontecer.*/
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
        numerosInteiros4.removeIf(new Predicate<Integer>() {//removeIf(): é um método de List q vai alterar a Lista, por isso está operação ocorre "forá" do Stream. OBS: se fosse um método de Stream n iria alterar a Lista pois Stream n faz modificações
            public boolean test(Integer numero) {
                if (numero % 2 != 0) { //se o resto da divisão de numero / 2 diferente de 0: numero é ímpar.
                    return true;
                } else {
                    return false;
                }
            };
        });
        System.out.println(numerosInteiros4);

        System.out.println("Usando os 3 princípios da Stream API: Classe Anônima, Function Interface e Lambda - ");

        List<Integer> numerosInteiros5 = numerosAleatorios.stream().map(numero -> Integer.parseInt(numero)).collect(Collectors.toList());
                                                                    //Poderia ter usado o Reference Method no map() - map(Integer :: parseInt )
        numerosInteiros5.removeIf(numero -> numero % 2 != 0);
        System.out.println(numerosInteiros5);

    }
}
   