package bootcamp.programação_orientada_a_objetos.herança_associação_e_interface.Interface;

public class Main {
    public static void main(String[] args) {
        
        Calculadora calculo = new Calculadora();
        calculo.soma(1, 2);
        calculo.subtracao(2, 1);
        calculo.multiplicacao(2, 2);
        calculo.divisao(25, 12);
    }
}
