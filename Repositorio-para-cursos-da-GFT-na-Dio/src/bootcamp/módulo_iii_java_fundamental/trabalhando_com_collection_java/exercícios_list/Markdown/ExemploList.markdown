```java

package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_framework.exercícios_list;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        //Algumas formas de iniciar um List:

//      Forma 1: List notas = new ArrayList(); //antes do java 5

//      Forma 2: List<Double> notas = new ArrayList<>(); //a partir do java 5: coneito Generics(jdk 5) - a partir do java 7: Diamont Operator(jdk 7) --- sinal <> no final.
//        <Double> --- Generics "para saber q os elementos da lista notas é do tipo Double" 

//      Forma 3: ArrayList<Double> notas = new ArrayList<>(); --- a implementação ArrayList fica no começo e no final, mas não é a melhor opções pois devemos programar voltado p/ a interface e não p/ a implementação

//      Forma 4: List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); -- intância o ArrayList e dentro dele passar um argumento() asList com os elementos dentro.
        
        /*Forma 5: List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); --- Não inicia com a implementação ArrayList e sim passo direto para dentro da List um Array.asList
                    notas.add(10d); --- Limitada: add. não posso adicionar novos elementos e nem remover elementos.
                    System.out.println(notas);*/

        /*Forma 6: List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); --- Limitada: add. não posso adicionar novos elementos e nem remover elementos.
                    notas.add(1d);
                    notas.remove(5d);
                    System.out.println(notas);*/


         System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>();
        
        //adicionar elementos na lista usando o método add
        notas.add(7.0);//poderia colocar um 7d para o java sabe q é um double
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);     //add os elementos na lista
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString()); //---toString: método retorna a representação string d um objeto

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0)); // indexOf = método q retorna um índice ou uma posição int - tenho q passar o elemento para retornar a posição q o elemento está.
    
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);//usando o método add, irei passar 2 argumentos: a posição e o elemento
        System.out.println(notas);//verificar se 8 foi adicionado na posição 4
        
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        // set = método de substituição: recebe a posição q quero substituir e o elemento q vai p/ essa posição
        notas.set(notas.indexOf(5.0), 6.0);//usando o método indexOf para retornar a posição.
        System.out.println(notas);
                                                                //notas vai aqui dentro pq retorna um boolean
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));// contains: método q retorn true se o elemento passado no parâmetro estiver na lista
    
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");//É só imprimir notas, mas irei imprimir uma nota em baixo da outra
        //imprimindo uma nota em baixo da outra
        for (Double nota : notas) {
            System.out.println(nota);
        }
    }
}

```