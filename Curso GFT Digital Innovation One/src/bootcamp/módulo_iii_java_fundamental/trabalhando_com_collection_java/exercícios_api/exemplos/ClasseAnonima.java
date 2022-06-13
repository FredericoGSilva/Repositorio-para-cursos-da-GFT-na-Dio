package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_api.exemplos;

import java.util.List;
import java.util.function.Function;
import java.util.ArrayList;
import java.util.Comparator;

public class ClasseAnonima {
    public static void main(String[] args) {
        
        List<Gato> meusGatos = new ArrayList<>() {{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};
/* 
        meusGatos.sort(Comparator.comparing(new Function<Gato,String>() {

            @Override
            public String apply(Gato gato) {
                // TODO Auto-generated method stub
                return gato.getNome();
            }
            
        }));                                                                                            */

        /*meusGatos está sendo organizado, comparado atrvés da interface Comparator utilizando o método estático comparing().
        o argumento de comparing( Function"interface Funcional") q através do Lambda fica simplificado.
        comparing() pede p/ implementar -> */
        //meusGatos.sort(Comparator.comparing((Gato gato) -> gato.getNome()));

        meusGatos.sort(Comparator.comparing(Gato :: getNome));
    }
}

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

    @Override
    public int compareTo(Gato o) {
        return this.getNome().compareToIgnoreCase(getNome());
    }
}
