````java

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

        //Set de notas, implementei o HashSet e coloque como argumento um Arrays.asList com os elementos "notas"
        Set<Double> notas = new HashSet<>(Arrays.asList(7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6));/*asList: método q retorna uma lista d tamanho fixo pela matriz específicada.
                                                                                                    este método atua como uma ponte entre APIs baseadas em Array e Coleção*/

        System.out.println(notas.toString());//os elementos não ficam na ordem q foram inseridos e os elementos 7.0 e 7.0 não se dublicam ou seja só aparece uma vez na hr da impressão.                                                                                            
    
        /*interface Set n faz buscas d acordo com a posição principalmente com a implementação HashSet 
        que apresenta os elementos de forma aleatória, por isso Set n têm o método indexOf() diferentemente da interface List.*/
        System.out.println("Exiba o posição da nota 5.0: ");
        System.out.println("Não é possível");

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");//a mesma situação do exercício d cima
        System.out.println("Não é possível");

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));//contains: verifica se o elemento está no conjunto retorna e true estiver ou false

        System.out.println("Exiba a terceira nota adicionada: ");//n é possível pois Set não têm o método get() para ser passado o índice em q a nota está
        System.out.println("Não é possível");

        System.out.println("Exiba a menor nota: " + Collections.min(notas));//Classe Collections têm o método min() q recebe uma interface Collection e um Set é uma Collection

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
   
        System.out.println("Exiba a média das notas: " + (resultadoDaSoma / notas.size()));//método size() retorna a quantidade de elementos no conjunto

        System.out.println("Remova a nota 0: ");
        notas.remove(0.0); //método remove(): passar a posição ou o valor. Como interface Set os elementos ficam em posições aleatórias, nesse caso eu passo o valor do elemento
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0: ");//Na interface Set os elementos ficam em posições aleatórias então n sei ql é a posição 0
        System.out.println("Não é possível");

         /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

        //ATENÇÃO COM ESSE EXERCÍCIO:

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
    
        Iterator<Double> iterator2 = notas.iterator();

        while(iterator2.hasNext()) {
            if(iterator2.next() < 7) { //Agora sem usar variável auxiliar para receber iterator.next()
                iterator2.remove();
            }
            
        }

        System.out.println(notas);

        /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

        //ATENÇÃO COM ESSE EXERCÍCIO:

        System.out.println("Exiba todas as notas na ordem que foram informadas: "); /*para esse exerício eu não posso usar a extensão HashSet, tenho q usar a LinkedHashSet pois 
                                                                                        a LinkedHashSet matém os elementos na ordem em que foram inseridas além de repertir números 
                                                                                        iguais diferente da extensão HashSet.*/
        //O comum é criar a lista igual abaixo:
        //Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6));
                                            
        //Mas irei adicionar os dados um por um:
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7.7);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);

        System.out.println(notas2);

        /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        
        //ATENÇÃO COM ESSE EXERCÍCIO:

        System.out.println("Exiba todas as notas na ordem crescente: ");/*Para esser exercício tenho q usar a extensão TreeSet pois ela organiza os elementos de acordo com
                                                                            sua ordem natural: Exemplo - ordem alfabética ou ordem numérica.*/

        Set<Double> notas3 = new TreeSet<>(notas2);/*Estou passando o conjunto notas2 como argumento para conjunto notas3.
                                                    Isso só possível pq os elemento da notas2 é do tipo Double assim como o notas3 e notas2 têm a interface "comparable". 
                                                    Se você uma classe que não tivesse o a interface "compareble" e nem tivesse o método comparareTo, 
                                                    eu não conseguiria passar notas2 como argumento.*/
        System.out.println(notas3);

        /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

        System.out.println("Apague todo o conjunto: ");//estou apagando o primeiro conjunto 
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: ");
        System.out.println(notas.isEmpty());/*isEmpty: confere se o conjunto está vazio ou está preenchido, 
                                            retornando true p/ vazio ou false p/ preenchido*/
    }
}

````