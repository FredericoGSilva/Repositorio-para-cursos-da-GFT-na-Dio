package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_set.exercícios_propostos;

import bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_set.exercícios_propostos.linguagem_favorita.ComparaIde;
import bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_set.exercícios_propostos.linguagem_favorita.CompareAnoCriacaoEnome;
import bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_set.exercícios_propostos.linguagem_favorita.LinguagemFavorita;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class LinguagemFavoritaMain {
    public static void main(String[] args) {

        System.out.println("A. Ordem de inserção: ");
        Set<LinguagemFavorita> linguagem1 = new LinkedHashSet<>() { {
                add(new LinguagemFavorita("Java", 1991, "VSCode ou Eclipse"));
                add(new LinguagemFavorita("Python", 1990, "VSCode"));
            }};
           
        for (LinguagemFavorita linguagemPrint : linguagem1) {
            System.out.println(linguagemPrint);
        }
        System.out.println("------------------------------------------------------------------------------------------------------");
// ---------------------------------------------------------------------------------------------------------------------------------------
        
        System.out.println("B. Ordem Natural (nome): ");
        Set<LinguagemFavorita> linguagem2 = new TreeSet<>(linguagem1);

        for (LinguagemFavorita linguagemFavorita : linguagem2) {
            System.out.println(linguagemFavorita);
        }
        System.out.println("------------------------------------------------------------------------------------------------------");
// ---------------------------------------------------------------------------------------------------------------------------------------
        
        System.out.println("C. IDE: ");
        Set<LinguagemFavorita> linguagem3 = new TreeSet<>(new ComparaIde());
        linguagem3.addAll(linguagem1);

        for (LinguagemFavorita imprimiLinguagem : linguagem3) {
            System.out.println(imprimiLinguagem);
        }
        System.out.println("------------------------------------------------------------------------------------------------------");
// ---------------------------------------------------------------------------------------------------------------------------------------        

        System.out.println("D. Ano de criação e nome: ");
        Set<LinguagemFavorita> linguagem4 = new TreeSet<>(new CompareAnoCriacaoEnome());
        linguagem4.addAll(linguagem1);

        for (LinguagemFavorita imprimiLinguagem : linguagem4) {
            System.out.println(imprimiLinguagem);
        }
        System.out.println("------------------------------------------------------------------------------------------------------");
// ---------------------------------------------------------------------------------------------------------------------------------------        

        System.out.println("E. Nome, ano de criação e IDE: ");
        /*Set<LinguagemFavorita> linguagem5 = new TreeSet<>(new CompareNomeAnoCriacaoIDE());
        linguagem5.addAll(linguagem1);*/

        Set<LinguagemFavorita> linguagem5 = new TreeSet<>() {{
            add(new LinguagemFavorita("Java", 1991, "VSCode ou Eclipse"));
            add(new LinguagemFavorita("C++", 1991, "Intellij"));
        }};

        for (LinguagemFavorita imprimiLinguagem : linguagem5) {
            System.out.println(imprimiLinguagem);
        }
                                                                                              
        System.out.println("Comparação do HashCode entre os conjutos.");
        System.out.println("HashCode da linguagem1" + linguagem1.hashCode());
        System.out.println("HashCode da linguagem2" + linguagem2.hashCode());
        System.out.println("HashCode da linguagem3" + linguagem3.hashCode());
        System.out.println("HashCode da linguagem4" + linguagem4.hashCode());
        System.out.println("HashCode da linguagem5" + linguagem5.hashCode());
        System.out.println(linguagem1.equals(linguagem2));
        System.out.println(linguagem1.equals(linguagem3));
        System.out.println(linguagem1.equals(linguagem4));
        System.out.println(linguagem1.equals(linguagem5));
    }
}
