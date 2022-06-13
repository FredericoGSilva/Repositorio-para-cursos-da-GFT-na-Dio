package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);

Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

public class OrdenacaoDeElementosEmUmaColecaoSet {
    public static void main(String[] args) {

        /*
         * Primeiro tenho q criar a classe para colocar os atributos:
         * nome - genêro - tempo de episódio
         */

        System.out.println("\nOrdem aleatória - Resultado impresso de 3 formas diferentes.\n");

        Set<Series> minhasSeries1 = new HashSet<>() {
            {
                add(new Series("Got", "Fantasia", 60));
                add(new Series("Dark", "Drama", 60));
                add(new Series("That '70s show", "Fantasia", 25));
            }
        };
        //3 formas diferente de imprimir 
        System.out.println("Impresso usando o loop forEach e buscando os atributos lá da classe atráves do método get()\n");
        for (Series recebeSeries : minhasSeries1) {
            System.out.println("Nome: " + recebeSeries.getNome() + " - " +
                    "Genêro: " + recebeSeries.getGenero() + " - " +
                    "Tempo de episódio: " + recebeSeries.getTempoEpisodio());
        }

        System.out.println("\nImpresso com o loop forEach e o método toString criado lá na " +
                "classe (Series) que faz referência ao conjunto Set\n");

        for (Series serie : minhasSeries1) {
            System.out.println(serie);
        }

        System.out.println("\nImpresso usando forEach e formatando com o printf\n");

        for (Series series : minhasSeries1) {
            System.out.printf("Nome: %s - Genêro: %s - Tempo de Episódio: %s\n",
                    series.getNome(), series.getGenero(), series.getTempoEpisodio());
        }

        System.out.println("------------------------------------------------------------------------------------------------------------------");

       
    }
}

class Series implements Comparable<Series> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Series(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return String.format("Nome: " + this.nome + " - Genêro: "
                + this.genero + " - Tempo de Episódio: "
                + this.tempoEpisodio);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Series serie = (Series) obj;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Series series) {
        Integer tempoEpisodio = Integer.compare(this.getTempoEpisodio(), series.getTempoEpisodio());
        if (tempoEpisodio != 0) {
            return tempoEpisodio;
        } else {
            return this.getGenero().compareTo(series.getGenero());
        }
    }
}

class ComparatorNomeGeneroTempo implements Comparator<Series> {

    @Override
    public int compare(Series series1, Series series2) {
        int nome = series1.getNome().compareTo(series2.getNome());
        if (nome != 0) {
            return nome;
        }
        int genero = series1.getGenero().compareTo(series2.getGenero());
        if (genero != 0) {
            return genero;
        }

        return Integer.compare(series1.getTempoEpisodio(), series2.getTempoEpisodio());
    }

}
