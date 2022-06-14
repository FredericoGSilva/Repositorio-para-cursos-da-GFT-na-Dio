package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_map.exercícios_propostos;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

public class Exercicio2 {
    public static void main(String[] args) { 

        System.out.println("Ordem aleatória: ");

        Map<Integer, Agenda> agendaDeContatos1 = new HashMap<>() {{ 
            put(1, new Agenda("Simba", 2222222)); 
            put(4, new Agenda("Cami", 55555555));      
            put(3, new Agenda("Jon", 1111111));    
        }};    
        Set<Map.Entry<Integer, Agenda>> entry = agendaDeContatos1.entrySet();
        for(Map.Entry<Integer, Agenda> imprimiEntry : entry) {
            System.out.println(imprimiEntry.getKey() + " - " + imprimiEntry.getValue().getNome()); 
        }
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Ordem de inserção: ");

        Map<Integer, Agenda> agendaDeContatos2 = new LinkedHashMap<>() {{
            put(5, new Agenda("Simba", 2222222));
            put(1, new Agenda("Cami", 55555555));
            put(3, new Agenda("Jon", 1111111));
            put(2, new Agenda("Fred", 77777777));
            put(4, new Agenda("Beth", 74747474));
        }};
        for(Map.Entry<Integer, Agenda> imprimiEntryObjeto : agendaDeContatos2.entrySet()) {
            System.out.println(imprimiEntryObjeto.getKey() + "- " + imprimiEntryObjeto.getValue().getNome());
        }
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Ordem Id: "); 

        Map<Integer, Agenda> agendaDeContatos3 = new TreeMap<>();
        agendaDeContatos3.putAll(agendaDeContatos2);
        for(Map.Entry<Integer, Agenda> imprimiEntry : agendaDeContatos3.entrySet()) {
            System.out.println(imprimiEntry.getKey() + " - " + imprimiEntry.getValue().getNome());
        }
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Ordem número telefone: "); 

        Set<Map.Entry<Integer, Agenda>> agendaDeContatos4 = new TreeSet<>(new ComparaNumero());
        agendaDeContatos4.addAll(agendaDeContatos1.entrySet());
        for(Map.Entry<Integer, Agenda> imprimiEntry : agendaDeContatos4) {
            System.out.println(imprimiEntry.getKey() + " - " + imprimiEntry.getValue().getNumero());
        }    
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Ordem nome contato: ");

        Set<Map.Entry<Integer, Agenda>> agendaDeContatos5 = new TreeSet<>(new ComparaNome());
        agendaDeContatos5.addAll(agendaDeContatos1.entrySet());
        for(Map.Entry<Integer, Agenda> imprimirEntry : agendaDeContatos5) {
            System.out.println(imprimirEntry.getKey() + " - " + imprimirEntry.getValue().getNome());
        }
    }

}

class Agenda {
    private String nome;
    private Integer numero;

    public Agenda(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }
    public Integer getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Agenda agenda = (Agenda) obj;
        return nome.equals(agenda.nome) && numero.equals(agenda.numero); 
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }

    @Override
    public String toString() {
        return " Nome: " + nome 
        + " - Numero: " + numero;
    }
}
 class ComparaNumero implements Comparator<Map.Entry<Integer, Agenda>>{
    @Override
    public int compare(java.util.Map.Entry<Integer, Agenda> obj1, java.util.Map.Entry<Integer, Agenda> obj2) {
        return Integer.compare(obj1.getValue().getNumero(), obj2.getValue().getNumero());
    }
}

class ComparaNome implements Comparator<Map.Entry<Integer, Agenda>> {
    @Override
    public int compare(java.util.Map.Entry<Integer, Agenda> obj1, java.util.Map.Entry<Integer, Agenda> obj2) {
    return obj1.getValue().getNome().compareToIgnoreCase(obj2.getValue().getNome());
    }

}
