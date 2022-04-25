package bootcamp.entendendo_métodos_java;

public class Calculadora {
    private static double soma;
    private static double subtracao;
    private static double multiplicacao;
    private static double divisao;

    public static void calculaSoma(double valor1, double valor2) {
        Calculadora.soma = valor1 + valor2;
        System.out.println(valor1 + " + " + valor2 + " = " + Calculadora.soma);
    }

    public static void calculaSubtracao(double valor1, double valor2) {
        Calculadora.subtracao = valor1 - valor2;
        System.out.println(valor1 + " - " + valor2 + " = " + Calculadora.subtracao);
    }

    public static void calculaMultiplicacao(double valor1, double valor2) {
        Calculadora.multiplicacao = valor1 * valor2;
        System.out.println(valor1 + " x " + valor2 + " = " + Calculadora.multiplicacao);
    }

    public static void calculaDivisao(double valor1, double valor2) {
        Calculadora.divisao = valor1 / valor2;
        System.out.println(valor1 + " / " + valor2 + " = " + Calculadora.divisao);
    }
}
