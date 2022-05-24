package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);
Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/
 
public class ordenacaoDeElementosEmUmaColecao1 {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>() {{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarela"));
        }};
        System.out.println(meusGatos);

        System.out.println("Odem de inserção: "); 
        System.out.println(meusGatos);

        System.out.println("Ordem aleatória: ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        /*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */

        //ATENÇÃO COM ESSE EXERCÍCIO:

        System.out.println("Ordem natural");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        
    }
}

// CRIANDO A CLASSE

class Gato implements Comparable<Gato> {

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() { //método de impressão
        // TODO Auto-generated method stub
        return "{" +
                "nome ='" + nome + '\'' +                                              
                ", idade =" + idade +
                ", cor ='" + cor + '\'' + 
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(getNome());
    }                                                           
                                                            
}                                                           

 /*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */



                                                                                                                 

