package bootcamp.entendendo_métodos_java;

public class RodandoExercicios {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.calculaSoma(3, 6);
        Calculadora.calculaSubtracao(9, 1.8);
        Calculadora.calculaMultiplicacao(7, 8);
        Calculadora.calculaDivisao(5, 2.5);

        // Mensagem
        System.out.println("\nExercício Mensagem");
        Horario.mensagem(5);
        Horario.mensagem(14);
        Horario.mensagem(1);

        // Empréstimo
        System.out.println("\nExercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());/*
                                                                 * Na chamada d um método, é comum passar um outro
                                                                 * método com parâmetro.
                                                                 * O retorno do método getDuasParcelas é passado como
                                                                 * parâmetro para o método calcular
                                                                 */
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5); // Ao invés d chamar o método, posso apenas passar o valor para ele.

        // Quadrilateros
        System.out.println("\nExercício Quadrilateros");
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5, 5);

        // Quadrilateros com Retorno
        System.out.println("\nQuadrilateros com Retorno");
        double areaQuadrado = QuadrilateroComReturn.area(3);/* A chamadas d método seguem do mesmo jeito, mas agora elas
                                                            são guardadas em variáveis*/ 
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilateroComReturn.area(5, 5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = QuadrilateroComReturn.area(7, 8, 9);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
}
