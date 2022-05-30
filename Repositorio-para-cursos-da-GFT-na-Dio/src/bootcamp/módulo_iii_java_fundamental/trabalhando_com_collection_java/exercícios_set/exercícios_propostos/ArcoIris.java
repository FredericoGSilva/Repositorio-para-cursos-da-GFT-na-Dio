package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_set.exercícios_propostos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ArcoIris {
    public static void main(String[] args) {

        //A. Exiba todas as cores uma abaixo da outra
        Scanner scan = new Scanner(System.in);

        Set<String> arcoIris1 = new LinkedHashSet<>(); 

        for (int i = 0; i < 7; i++) { 
            System.out.println();
            System.out.println("Insira uma cor: ");
            String recebeCor = scan.nextLine(); 
            arcoIris1.add(recebeCor);
        }
        scan.close();
        System.out.println();

        for (String cor : arcoIris1) { 
            System.out.println(cor);
        }                                                                                              
//--------------------------------------------------------------------------------------------------------------------------------------------------------   

        //B. Quantidade de cores que o arco-íris1 têm
        System.out.println("Quantidade de elementos do conjunto acima:" + arcoIris1.size()); 
        System.out.println();//Pula linha
//--------------------------------------------------------------------------------------------------------------------------------------------------------  

        //C. Exibiba as cores em ordem alfabética
        Set<String> arcoIris2 = new TreeSet<>() {{                                                                             
            add("Vermelho");
            add("Laranja");
            add("Amarelo");
            add("Verde");
            add("Azul");
            add("Anil");
            add("Violeta");
        }};

        System.out.printf("Imprimindo as cores em ordem alfabética: %s", arcoIris2);
//--------------------------------------------------------------------------------------------------------------------------------------------------------          

        //D. Exiba as cores na ordem inversa da que foi informada
        List<String> coresInvertidas = new ArrayList<>(arcoIris2);

        Collections.reverse(coresInvertidas);                                             
        System.out.println();
        System.out.println(coresInvertidas);                                
//--------------------------------------------------------------------------------------------------------------------------------------------------------          

        //E. Exiba todas as cores que começam com a letra "V"
        Set<String> cores3 = new HashSet<>() {{
            add("Vermelho");
            add("Laranja");
            add("Amarelo");
            add("Verde");
            add("Azul");
            add("Anil");
            add("Violeta");
        }};  
        
        Iterator<String> iterator = cores3.iterator();

        while(iterator.hasNext()) { 
            String cor = iterator.next();
            if (cor.startsWith("V")) {
                System.out.println(cor);
            }
        }       
//--------------------------------------------------------------------------------------------------------------------------------------------------------          

        //F. Remova todas as cores que não começam com V.
        Iterator<String> iterator2 = cores3.iterator();

        System.out.println("\nCores que não começam com V foram removidos.\n");

        while(iterator2.hasNext()) {
            String corComV = iterator2.next();
            
            if (corComV.startsWith("V") || corComV.startsWith("v")) { 
                System.out.println(corComV);
            } else {
                iterator2.remove(); 
            }
          
        }
//--------------------------------------------------------------------------------------------------------------------------------------------------------

        //G. Remova o conjunto
        cores3.clear(); //Apagando o conjunto

        //H. Confira se o conjunto está vazio
        cores3.isEmpty();
        System.out.println(cores3);


    }
}