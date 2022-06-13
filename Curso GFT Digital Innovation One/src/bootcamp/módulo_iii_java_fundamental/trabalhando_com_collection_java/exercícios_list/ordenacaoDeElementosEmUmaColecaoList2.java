package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ordenacaoDeElementosEmUmaColecaoList2 {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>() {{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("Ordem idade");
        /*Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos);                                      */
        
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);
        /*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
 
        System.out.println("\nOrdem cor");
        meusGatos.sort(new ComparaCor());
        System.out.println(meusGatos);

        System.out.println("\nOrdem Nome, Cor, Idade");
        meusGatos.sort(new ComparatorNomeCorIdade());
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
    public String toString() { 
        // TODO Auto-generated method stub
        return "{" + 
                "nome ='" + nome + '\'' +
                ", idade =" + idade +
                ", cor ='" + cor + '\'' +
                '}';
    }
    //MÉTODOS DE COMPARAÇÃO
    @Override
    public int compareTo(Gato gato) {
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(getNome());

    }

}

//CRIANDO OUTRA CLASSE

class ComparatorIdade implements Comparator<Gato> { 

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());

    } 
}     

class ComparaCor implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getCor().compareToIgnoreCase(gato2.getCor()); 
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if (nome != 0) { 
            return nome;
        }

        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor()); 
        
        if (cor != 0) {
            return cor;
        } else {
            return Integer.compare(gato1.getIdade(), gato2.getIdade());
        }
    }

}