package bootcamp.entendendo_métodos_java;

public class Main {
    public static void main(String[] args) {
        
        //Calculadora
        Calculadora.soma();
        Calculadora.subtracao();
        Calculadora.multiplicacao();
        Calculadora.divisao();


        //Empréstimo
        Emprestimo.calcular(1500, Emprestimo.getTresParcelas());
        Emprestimo.calcular(2500, 2);


        //Horario
        Hora.horas();


        //Quadrilateros
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5, 5);


        //Quadrilatero com retorno
        System.out.println("\nQuadrilateros com Retorno");
        double areaQuadrado = QuadrilateroRetorno.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilateroRetorno.area(5, 5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = QuadrilateroRetorno.area(7, 8, 9);
        System.out.println("Área do trapézio: " + areaTrapezio);
        
    }
}
