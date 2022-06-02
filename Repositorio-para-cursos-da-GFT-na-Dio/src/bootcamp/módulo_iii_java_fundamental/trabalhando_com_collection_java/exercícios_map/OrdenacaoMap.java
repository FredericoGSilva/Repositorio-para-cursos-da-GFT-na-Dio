package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_map;

import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

public class OrdenacaoMap {
    public static void main(String[] args) {
        
        System.out.println("Ordem aleatória - exibindo (Nome Autor - Nome Livro): ");            
        //chave é o autor = String 
        //valor vêm da classe Livro
        Map<String, Livro> meusLivros1 = new HashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));// key: é o nome do autor e value é a instanciação da classe Livro  
            put("Duhigg, Charles", new Livro("O poder do Hábito", 408));          //onde será preenchido os atributos nomeDoLivro e paginasDoLivro
            put("Harari Yuval Noah", new Livro("Lições Para o Século 21", 432));

        }};

        Set<Map.Entry<String, Livro>> entry = meusLivros1.entrySet(); //entrySet(): "anda" pelo conjunto meusLivros e "separa" keys de values
        for (Map.Entry<String,Livro> recebeEntry : entry) { //entrySet() é passado para recebeEntry
            System.out.println(recebeEntry.getKey() + " - " + recebeEntry.getValue().getNome());/*recebeEntry pega a chave p/ imprimir o nome do autor
                                                                                                recebeEntry pega o valor e como valor vêm da classe Livro, pegar tb o getNome()*/
        }
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Ordem de Inserção: ");

        Map<String, Livro> meusLivros2 = new LinkedHashMap<>() {{//LinkedHashMap é a implementação q odena os elementos na sua ordem d inserção
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do Hábito", 408));          
            put("Harari Yuval Noah", new Livro("Lições Para o Século 21", 432));
        }}; 
        Set<Map.Entry<String, Livro>> entries2 = meusLivros2.entrySet();
        for (Map.Entry<String,Livro> recebeEntry : entries2) {
            System.out.println(recebeEntry.getKey() + " - " + recebeEntry.getValue().getNome());
        }
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Ordem alfabética (autores): ");
        
        Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros1);//Tree Map organiza os elemento d acordo cm sua ordem natural
        
        Set<Map.Entry<String, Livro>> entries3 = meusLivros3.entrySet();

        for (Map.Entry<String,Livro> recebeEntry : entries3) {
            System.out.println(recebeEntry.getKey() + " - " + recebeEntry.getValue().getNome());
        }
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Ordem alfabética (nomes dos livros)");
        //Map.Entry: tipo dos elementos
        //String: tipo da chave
        //Livro: Classe, o tipo do valor
        //TreeSet usa a implementação TreeMap  ---- TreeSet ordena os elementos d acordo cm sua ordem natural
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());//TreeSet pois preciso usar a interface Comparator<> //É só iniciar o método q faz a comparação --- new ComparatorNome()
        meusLivros4.addAll(meusLivros1.entrySet());//adiconando livros1 ao meusLivros4. Estou colocando um Set de entry dentro de meusLivros1 pq dentro d meusLivros4 têm um Map.Entry    
        
        for (Map.Entry<String,Livro> recebeEntry : meusLivros4) {
            System.out.println(recebeEntry.getKey() + " - " + recebeEntry.getValue()); /*será imprimido - Lições para o século 21, O poder do Hábito e Uma breve história do tempo
                                                                                        nome dos livros em ordem alfabética.*/
        }    
        
    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }
    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return "Nome do livro: " + nome
        + " - Páginas: " + paginas;
    }

    public boolean equals(Object objLivro) {
        if (this == objLivro) {
            return true;
        } 
            //this != livros
        if ( objLivro == null|| getClass() != objLivro.getClass()) {
            return false;
        }
        Livro livro = (Livro) objLivro;
        return nome.equals(livro.getNome()) && paginas.equals(livro.getPaginas());
    }

    public int hashCode() {
        return Objects.hash(nome, paginas);
    }   
}
//Classe referente ao "Ordem alfabética (nomes dos livros)"
//Comparator está comparando Set<Map.Entry<String, Livro>> 
class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> livro1, Entry<String, Livro> livro2) {
        return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());//livro1 pega o valor() e no valor pega o nome  e comparaIgnorandoMaiusculaOuMinuscula com livro2 pega o valor() e no valor pega o nome 
    }


}
