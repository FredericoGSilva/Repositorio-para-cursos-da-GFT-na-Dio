package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConhecendoOsMétodosSet {
    public static void main(String[] args) {
        
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        //Algumas formas de iniciar o Set:

//      Set notas = new HashSet(); //antes do java 5

//      HashSet<Double> notas = new HashSet<>();

//      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)

/*      Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);

        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
*/

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6));
        System.out.println(notas.toString());                                                                                           
    
        System.out.println("Exiba o posição da nota 5.0: ");
        System.out.println("Não é possível");

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        System.out.println("Não é possível");

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));

        System.out.println("Exiba a terceira nota adicionada: ");
        System.out.println("Não é possível");

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

        //ATENÇÃO COM ESSE EXERCÍCIO:
        System.out.println("Exiba a soma dos valores: ");

        Iterator<Double> iterator = notas.iterator();

        float resultadoDaSoma = 0.0f;

        while(iterator.hasNext()) {
            Double soma = iterator.next();
            resultadoDaSoma += soma;
        }

        System.out.println(resultadoDaSoma);

        /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
   
        System.out.println("Exiba a média das notas: " + (resultadoDaSoma / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0.0); 
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0: ");
        System.out.println("Não é possível");

         /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

        //ATENÇÃO COM ESSE EXERCÍCIO:

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
    
        Iterator<Double> iterator2 = notas.iterator();

        while(iterator2.hasNext()) {
            if(iterator2.next() < 7) { 
                iterator2.remove();
            }
            
        }

        System.out.println(notas);

        /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

        //ATENÇÃO COM ESSE EXERCÍCIO:

        System.out.println("Exiba todas as notas na ordem que foram informadas: "); 

        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);

        System.out.println(notas2);

        /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        
        //ATENÇÃO COM ESSE EXERCÍCIO:

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

        System.out.println("Apague todo o conjunto: ");//estou apagando o primeiro conjunto 
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: ");
        System.out.println(notas.isEmpty());
    }
}