package bootcamp.programação_orientada_a_objetos.herança_associação_e_interface.Interface;

public class Calculadora implements OperacaoMatematica{
    
    // Sobrescrevendo os métodos da interface OperacaoMatematica

    @Override
    public void soma(double operando1, double operando2) {
        System.out.println("Soma: " + (operando1 + operando2));
    }

    @Override
    public void subtracao(double operando1, double operando2) {
        System.out.println("Subtração: " + (operando1 - operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {
        System.out.println("Multiplicação: " + (operando1 * operando2));
    }

    @Override
    public void divisao(double operando1, double operando2) {
        System.out.printf("Divisão: %.2f", (operando1 / operando2));
    }
}
