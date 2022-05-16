package bootcamp.entendendo_métodos_java;
import javax.swing.JOptionPane;

public class Calculadora {

    private static double num1;
    private static double num2;

    public static void mensagem() {
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número"));
    }

    public static void soma() {
        mensagem();
        System.out.println("\nCalculadora");
        double resultado = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + resultado);
    }

    public static void subtracao() {
        mensagem();
        double resultado = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + resultado);
    }

    public static void multiplicacao() {
        mensagem();
        double resultado = num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + resultado);
    }

    public static void divisao() {
        mensagem();
        double resultado = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + resultado + "\n");
    }
}