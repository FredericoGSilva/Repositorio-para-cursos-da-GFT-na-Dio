package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_set.exercícios_propostos.linguagem_favorita;

import java.util.Comparator;

public class CompareNomeAnoCriacaoIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita obj1, LinguagemFavorita obj2) {
        int nome = obj1.getNome().compareToIgnoreCase(obj2.getNome());
        if (nome != 0) {
            return nome;
        } 
        int anoDeCriacao = Integer.compare(obj1.getAnoDeCriacao(), obj2.getAnoDeCriacao());
        if (anoDeCriacao != 0) {
            return anoDeCriacao;
        }
        return obj1.getIde().compareToIgnoreCase(obj2.getIde());
    }
    
}
