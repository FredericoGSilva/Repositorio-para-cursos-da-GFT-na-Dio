package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) {
            System.out.println(nota);
        }

        //PARTE 2 DOS EXERCÍCIOS

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2)); 
            
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        /*------------------------------------------------------------------------------------------------------------------------------------------------------ */
        
        //ATENÇÃO COM ESSE EXERCÍCIO:

        System.out.println("Exiba a soma dos valores: ");
        
        Iterator<Double> iterator1 = notas.iterator();
        
        Double soma = 0.0;

        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            soma += next; 
        }                

        System.out.println("Soma dos valores: " + soma);

        /*-----------------------------------------------------------------------------------------------------------------------------------------------------------*/
                
        System.out.println("Exiba a média das notas: " + soma / notas.size());

        System.out.println("Remova a nota 0: ");
        notas.remove(0.0); 
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        /*-----------------------------------------------------------------------------------------------------------------------------------------------------------*/

        //ATENÇÃO COM ESSE EXERCÍCIO:

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");

        Iterator<Double> iterator2 = notas.iterator();

        while(iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7) {
                iterator2.remove();
            }            
        }

        System.out.println(notas);

        /*-----------------------------------------------------------------------------------------------------------------------------------------------------------*/
        
        System.out.println("Apague toda a lista notas: ");
        notas.clear();//clear = apaga toda a lista
        System.out.println("Lista vazia: " + notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());   
        /*-----------------------------------------------------------------------------------------------------------------------------------------------------------*/

    //  ATENÇÃO: Para você - Resolva esses exercícios utilizando os métodos da implementação LinkedList:

        System.out.println("\nCrie uma lista chamada notas3 e coloque todos os elementos da list Arraylist nessa nova lista: ");

        List<Double> notas2 = new ArrayList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);

        List<Double> notas3 = new LinkedList<>(); // LinkedList notas3 irá receber ArraysList notas2

        notas3.addAll(notas2);
        System.out.println(notas3);
        /*-----------------------------------------------------------------------------------------------------------------------------------------------------------*/

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");

        System.out.println(notas3.get(0));

/*        Iterator<Double> iterator3 = notas3.iterator();
 
        while(iterator3.hasNext()) {
            System.out.println(iterator3.next());
            break;
        }
        */
        /*-----------------------------------------------------------------------------------------------------------------------------------------------------------*/
 
        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");

        System.out.println(notas3.get(0));
        notas3.remove(0);

        System.out.println(notas3.toString());

    }                                                                                       
}