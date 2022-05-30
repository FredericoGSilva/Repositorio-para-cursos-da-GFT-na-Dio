package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_set.exercícios_propostos.linguagem_favorita;

import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    
    private String nome;
    private int anoDeCriacao;
    private String ide;
    
    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide; 
    }

    public String getNome() {
        return nome;
    }
    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }
    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "Linguagem favorita: " + this.nome +
                " - Ano de criação da linguagem: " + this.anoDeCriacao
                + " - IDE favorida: " + this.ide; 
    }

    @Override
    public int compareTo(LinguagemFavorita liguagemFavorita) { 
        return this.nome.compareTo(liguagemFavorita.nome);          
    }

   @Override
   public boolean equals(Object obj) {
       if (this == obj) {
        return true;
       }
       if (obj == null || getClass() != obj.getClass()) {
        return false;
       }
        LinguagemFavorita that = (LinguagemFavorita) obj;
        return nome.equals(that.nome);
   }

   @Override
   public int hashCode() {
       return Objects.hash(nome);
   }
}                                            