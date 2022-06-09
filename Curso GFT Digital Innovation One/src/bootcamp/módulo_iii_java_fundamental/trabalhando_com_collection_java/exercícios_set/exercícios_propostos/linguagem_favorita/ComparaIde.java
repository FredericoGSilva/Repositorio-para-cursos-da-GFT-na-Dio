package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_set.exercícios_propostos.linguagem_favorita;

import java.util.Comparator;

public class ComparaIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita ide1, LinguagemFavorita ide2) {
        if (ide1.getIde().equalsIgnoreCase(ide2.getIde())) {
            return 1;
        } else {
            return -1;
        }
    }

}