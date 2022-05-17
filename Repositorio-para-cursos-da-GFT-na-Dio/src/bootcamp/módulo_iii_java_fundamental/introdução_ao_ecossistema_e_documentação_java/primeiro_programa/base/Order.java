package bootcamp.módulo_iii_java_fundamental.introdução_ao_ecossistema_e_documentação_java.primeiro_programa.base;

public class Order {
    
    private final String code;

    public Order(String code) { //Construtor
        this.code = code; //O atributo code irá receber o q for passado no método construtor(parâmetro) 
    }

    public String toString() { //Método responsável pela impressão
        return "A frase é "+ code;
    }
}
