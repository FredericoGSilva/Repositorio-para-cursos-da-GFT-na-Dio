package bootcamp.módulo_iii_java_fundamental.entendendo_métodos_java;

public class QuadrilateroRetorno {

    public static double area(double lado) {
        return lado * lado;
    }

    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior * baseMenor) * altura) / 2;
    }
}
