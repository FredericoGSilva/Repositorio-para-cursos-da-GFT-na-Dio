package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_lists.exercícios_propostos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

public class Crime {
    public static void main(String[] args) {
        
        List<String> perguntas = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para vítima?");
        perguntas.add(scan.next() );

        System.out.println("Esteve no local do crime?");        
        perguntas.add(scan.next());

        System.out.println("Mora perto da vítima?");
        perguntas.add(scan.next());

        System.out.println("Devia para a vítima?");
        perguntas.add(scan.next());

        System.out.println("Já trabalhou com a vítima?");
        perguntas.add( scan.next());

        scan.close();

        System.out.println(perguntas);
        
        
        Iterator<String> iterator = perguntas.iterator();
        int contador = 0;

        while(iterator.hasNext()) {
            String reposta = iterator.next();

            if(reposta.equalsIgnoreCase("sim")) { 
                contador++;
            }
        }

        switch(contador) {
            case 2:
                System.out.println(">> SUSPEITA <<"); break;  
            case 3:  
            case 4:                                             
                System.out.println(">> CÚMPLICE <<"); break; 
            case 5:
                System.out.println(">> ASSASSINO <<"); break; 
            default:
                System.out.println(">> INOCENTE <<"); break; 
        }

    }
}


