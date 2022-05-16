package bootcamp.entendendo_métodos_java;

public class Quadrilatero {

    public static void area(double lado) {
        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Áred do retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    /*
     * Esse método será float pois se for double terá um "conflito" com o método q
     * cálcula o retângulo pois teram a mesma quantidade d parâmetros
     */
    public static void area(float diagonal1F, float diagonal2F) {
        System.out.println("Área do losango: " + (diagonal1F * diagonal2F) / 2);
    }
}
