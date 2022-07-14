package bootcamp.programação_orientada_a_objetos.herança_associação_e_interface.classes2;

public class Funcionario {
    private String nome;
    private int senhaDeAcesso;
    private String cargo;
    private String contato;

    /* 
    public Funcionario(String nome, int senhaDeAcesso, String cargo, String contato) {
        this.nome = nome;
        this.senhaDeAcesso = senhaDeAcesso;
        this.cargo = cargo;
        this.contato = contato;
    }*/

    // Só terá getters de nome e cargo pois só isso será exibido
    public String getNome() {
        return nome;
    }
    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nome: " + nome +
               "Cargo: " + cargo;
    }
}
