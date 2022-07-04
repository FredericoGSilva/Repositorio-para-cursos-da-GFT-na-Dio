package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_api;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.function.Function;


/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

public class PrincipaisOperacoesStreamApi1 {
    public static void main(String[] args) {
        
        Map<Integer, Agenda> agendaDeContatos1 = new HashMap<>() {{ 
            put(1, new Agenda("Simba", 2222222));  
            put(4, new Agenda("Cami", 55555555));      
            put(3, new Agenda("Jon", 1111111));    
        }};    

        System.out.println("1 - Ordem número telefone: ");

        // Classe Anônima
        Set<Map.Entry<Integer, Agenda>> agendaDeContatos2 = new TreeSet<>(new Comparator<Map.Entry<Integer, Agenda>>() {      
            @Override
            public int compare(Entry<Integer, Agenda> contato1, Entry<Integer, Agenda> contato2) {  
                return Integer.compare(contato1.getValue().getNumero(), contato2.getValue().getNumero());
            }
        });
        agendaDeContatos2.addAll(agendaDeContatos1.entrySet());
        for(Map.Entry<Integer, Agenda> imprimiEntry : agendaDeContatos2) {
            System.out.println(imprimiEntry.getKey() + " - " + imprimiEntry.getValue().getNumero());
        } 
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        // Function Interface usando Classe Anônima 
        Set<Map.Entry<Integer, Agenda>> agendaDeContatos3 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Agenda>, Integer>() {
            @Override
            public Integer apply(Entry<Integer, Agenda> objNumero) {
                return objNumero.getValue().getNumero();
            }
        }));               
        agendaDeContatos3.addAll(agendaDeContatos1.entrySet());
        for(Map.Entry<Integer, Agenda> imprimiEntry : agendaDeContatos3) {
            System.out.println(imprimiEntry.getKey() + " - " + imprimiEntry.getValue().getNumero());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        // Lambda
        Set<Map.Entry<Integer, Agenda>> agendaDeContatos4 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));
        agendaDeContatos4.addAll(agendaDeContatos1.entrySet());
        for(Map.Entry<Integer, Agenda> imprimiEntry : agendaDeContatos4) {
            System.out.println(imprimiEntry.getKey() + " - " + imprimiEntry.getValue().getNumero());
        }                                   
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("2 - Ordem nome contato: ");

        // Classe Anônima
        Set<Map.Entry<Integer, Agenda>> agendaDeContatos5 = new TreeSet<>(new Comparator<Map.Entry<Integer, Agenda>>() {
            @Override
            public int compare(Entry<Integer, Agenda> objNome1, Entry<Integer, Agenda> objNome2) {
                return objNome1.getValue().getNome().compareTo(objNome2.getValue().getNome());
            }
        });
        agendaDeContatos5.addAll(agendaDeContatos1.entrySet());
        for(Map.Entry<Integer, Agenda> imprimiEntry : agendaDeContatos5) {
            System.out.println(imprimiEntry.getKey() + " - " + imprimiEntry.getValue().getNome());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        //Function Interface usando Classe Anônima
        Set<Map.Entry<Integer, Agenda>> agendaDeContatos6 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Agenda>, String>() {
            @Override
            public String apply(Entry<Integer, Agenda> objNome) {
                return objNome.getValue().getNome();
            }
        }));
        agendaDeContatos6.addAll(agendaDeContatos1.entrySet());
        for(Map.Entry<Integer, Agenda> imprimiEntry : agendaDeContatos6) {
            System.out.println(imprimiEntry.getKey() + " - " + imprimiEntry.getValue().getNome());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        // Lambda
        Set<Map.Entry<Integer, Agenda>> agendaDeContatos7 = new TreeSet<>(Comparator.comparing((objNome) -> objNome.getValue().getNome()));
        agendaDeContatos7.addAll(agendaDeContatos1.entrySet());
        for(Map.Entry<Integer, Agenda> imprimiEntry : agendaDeContatos7) {
            System.out.println(imprimiEntry.getKey() + " - " + imprimiEntry.getValue().getNome());
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

