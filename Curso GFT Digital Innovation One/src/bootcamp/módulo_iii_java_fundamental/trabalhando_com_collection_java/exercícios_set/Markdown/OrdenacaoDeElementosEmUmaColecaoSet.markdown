````java

        /*OBS: Para imprimir uma lista ou um conjunto de elementos q são referência <> String, Double, Integer, Object, posso apenas printar todo um conjunto.
            Agora se for referenciar um objeto <Series> ou <Notas>, esse objeto terá uma classe e p/ imprimir eu tenho 2 opções:
            usar o método toString() lá na classe ou formatar a impressão forá da classe pegando os atributos da classe através do método get()*/
            //Site p/ saber mais http://tdsa2014.blogspot.com/2014/05/tipos-de-dados-primitivos-e-de.html

            
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
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

        /*Primeiro tenho q criar a classe para colocar os atributos: 
        nome - genêro - tempo de episódio*/
        
      System.out.println("\nOrdem aleatória - Resultado impresso de 3 formas diferentes.\n");

        Set<Series> minhasSeries1 = new HashSet<>() {{
            add(new Series("Got", "Fantasia", 60));
            add(new Series("Dark", "Drama", 60));
            add(new Series("That '70s show", "Fantasia", 25));
        }};

        //System.out.println(minhasSeries.toString());

        /* 3 formas de impressão q resultam no mesmo resultado: imprimir cada posição, separadamente: 
            - forEach: buscando os atributos lá da classe atráves do método get()
            - forEach: imprimindo de uma vez só o conjunto "minhasSeries", com a formatação do método toString() criado na classe "Series"
            - forEach e imprimir com printf: usando o System.out.printf p /formatar os valores.*/    

            System.out.println("Impresso usando o loop forEach e buscando os atributos lá da classe atráves do método get()\n");
        for (Series recebeSeries : minhasSeries1) {
            System.out.println("Nome: " + recebeSeries.getNome() + " - " + 
            "Genêro: " +  recebeSeries.getGenero() + " - " + 
            "Tempo de episódio: " + recebeSeries.getTempoEpisodio());
        }

        
            System.out.println("\nImpresso com o loop forEach e o método toString criado lá na " + 
        "classe (Series) que faz referência ao conjunto Set\n");
        //Será impresso do jeito q foi definido no método toString() lá na classe q representa o objeto <Series>
        for (Series serie : minhasSeries1) { //imprimindo cada linha separadamente
            System.out.println(serie);
        }

      
            System.out.println("\nImpresso usando forEach e formatando com o printf\n");
        //imprimindo com a função printf: formatação da String
        for (Series series : minhasSeries1) {
            System.out.printf("Nome: %s - Genêro: %s - Tempo de Episódio: %s\n", 
            series.getNome(), series.getGenero(), series.getTempoEpisodio());
        }

        /*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

        System.out.println("\nOrdem de inserção"); //ordem em que cada espaço foi preenchido

        Set<Series> minhasSeries2 = new LinkedHashSet() {{
            add(new Series("Got", "Fantasia", 60));
            add(new Series("Dark", "Drama", 60));
            add(new Series("That '70s show", "Fantasia", 25));
        }};

        for (Series series : minhasSeries2) {
            System.out.println(series);
        }

        /*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

        System.out.println("\nOdem natural por (Tempo de episódio)"); //ordenar, numéricamente: irá verificar o tempo de episódio d ordenar

        Set<Series> minhasSeries3 = new TreeSet<>(minhasSeries1); /*Estou passando o conjunto minhasSeries1 como argumento para conjunto minhasSeries3.
                                                                    Isso só possível pq os elemento da minhasSeries1 é do tipo Double assim como minhasSeries3 têm a interface "comparable". 
                                                                    Se você uma classe que não tivesse o a interface "compareble" e nem tivesse o método comparareTo, 
                                                                    eu não conseguiria passar minhasSeries1 como argumento.*/

        for (Series series : minhasSeries3) { //Uma das séries não será mostrado pois elas têm o mesmo tempo de episódio e a Interface Set não permite elementos duplicados(repetidos)
            System.out.println(series);
        }      
        
        /*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

        System.out.println("\nOrdem por Nome, Genêro e Tempo de Episódio"); //criei a classe de comparação lá no final

        //Irei criar uma classe para comparação:
        Set<Series> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempo()); //coloquei como argumento a classe q irá fazer as comparações
        System.out.println(minhasSeries4);//a coleção vai estar vazia pois eu apenas iniciei e informei pelo meio da classe como quero q TreeSet seja comparado.

        minhasSeries4.addAll(minhasSeries1);//Aqui eu preenchi o TreeSet com outra Collection
                             

        for (Series series : minhasSeries4) { //como os nomes das séries são diferentes o método compare() ordenou por em nomes
            System.out.println(series);
        }   
    }
}

class Series implements Comparable<Series>{
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

    /*É muito importante usar os métodos equals() e hashCode() em implementações q no nome têm a palavra hash como:
      HashSet e LinkedHashSet*/

      // Sempre que sobrescrever o equals, sobrescreva também o hashCode. Ele é usado normalmente para agilizar a busca em collections. 

    @Override//Verificando se o Objeto que estou pesquisando têm um "HashCode" dentro da classe
    public boolean equals(Object obj) { //equals() pega o Objeto passado como argumento e verifica se a lista ou conjunto contém(contains) esse argumento: precissa conter a mesma escrita e a mesma posição
        if (this == obj) {  //contains retorna true se a lista ou conjunto conter o argumento(obj) --- contains usa o método equals p/ saber se o objeto está dentro da lista ou conjunto
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) { //O que é getClass?  
            return false;
        }
        Series serie = (Series) obj; //O que está acontecendo nessa linha?????
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);//????????????
    }

    @Override //Estou informando como que eu quero q seja feita essas comparações ele hashCode() irá retornar o código hash do objeto.
    public int hashCode() { //HashCode gera um número inteiro e coloca no "bucket" e na hr HashSet realizar uma busca ela vai direto no bucket específico, fazendo uma busca rápida 
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override/*Uma das séries não será mostrado pois elas têm o mesmo tempo de episódio e a Interface Set não permite elementos duplicados(repetidos). 
                Então tenho q dar um critério de desimpati p/ quando surgir dois critério iguais, um dos elementos não ficarem "ocultos". 
                Se o tento for igual, os elementos serão comparados por genêro da série.*/
    public int compareTo(Series series) {
        Integer tempoEpisodio = Integer.compare(this.getTempoEpisodio(), series.getTempoEpisodio()); //Irá comparar o tempo de episódio.
        if (tempoEpisodio != 0) {                                                                   // Se o tempo de episódio d um elemento for diferente d outro elemento e os dois forem diferentes de 0, retorna o tempo de episódio. 
            return tempoEpisodio;                                                                  // Se essa condições não forem atendidas, o método irá comparar esses mesmos 2 elementos mas agora serão comparados pelo genêro.
        } else {
            return this.getGenero().compareTo(series.getGenero());
        }                                                                                               
    }
}

//Classe com implementação da interface Comparato<>

class ComparatorNomeGeneroTempo implements Comparator<Series>{

    @Override
    public int compare(Series series1, Series series2) {
        int nome = series1.getNome().compareTo(series2.getNome()); // se os nomes da série forem diferentes, então a comparação será feita por nome
        if (nome != 0) {
            return nome;
        } 
        int genero = series1.getGenero().compareTo(series2.getGenero()); // se os nomes forem iguais, e os genêros forem diferentes então a comparação será feita por genêro
        if (genero != 0) {
            return genero;
        }

        return Integer.compare(series1.getTempoEpisodio(), series2.getTempoEpisodio()); // se os nomes e os genêros forem todos iguais, então a comparação será feita por tempo de episódio
    }

}

````