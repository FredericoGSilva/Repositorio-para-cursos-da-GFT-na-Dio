package bootcamp.variáveis_tipos_de_dados_e_operadores_matemáticos;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        
        //Como nesse exercício, são muitos exemplo, terei q criar alguns métodos auxiliares.
        preEproFixados();
        operadoresAritmeticos();
        atribuicaoComposta();
        precedencia();

    }

    //Métodos devem ficar forá do método main

    private static void preEproFixados() {

        int k = 10;//Inicializei a variável
        
        int i = ++k;//pré fixado: primeiro ele soma 1 unidade no k p/ depois atribuir k ao i. Ou seja i recebe k valendo 11 
        int j = k--;//pósfixado: primeiro j recebe k, só depois k é subtraido. Ou seja j recebe k ainda valendo 11.
        int x = k;//Aqui o x recebe k já valendo 10.

        System.out.println("Préfixado e Posfixado\nk = "+ k +"\ni = "+i +"\nj = "+j +"\nx = "+ x);
        System.out.println("\n------------------------------\n");
    }

    public static void operadoresAritmeticos() {
        
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a + b;
        int r2 = c - a;
        int r3 = d * b;
        int r4 = e / a;
        int r5 = c % b;

        System.out.println("Operadores Aritméticos\na + b = "+r1);
        System.out.println("c - a = "+r2);
        System.out.println("d * b = "+r3);
        System.out.println("e / a = "+r4);
        System.out.println("c % b = "+r5);
        System.out.println("\n------------------------------\n");
    }

    public static void atribuicaoComposta() {

        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5F;
        double d = f;  

        i += 5;
        j -= 3;
        d /= 2.7;
        l *= 3;
        k %= 2;

        System.out.println("Atribuição Composta\ni = "+ i);
        System.out.println("j = "+ j);
        System.out.println("d = "+ d);
        System.out.println("l = "+ l);
        System.out.println("k = "+ k);
        System.out.println("\n------------------------------\n");
    }

    public static void precedencia() {

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k;//10 + 20 * 30 / 10 + 19 * 30 / 10 + 570 / 580 
        //como i é posfixado sua soma só será executada "após" o fim dessa operação: veja o exemplo abaixo...

        System.out.println("Ordem de precedência\nExemplo 1:\n\ni++ + --j * k = "+ a);
        //i++ é pós fixado e --j é prefixado

        //int l = i;//11
        System.out.println("\nProvando que i++ só vale na próxima operação\ni = "+ i);
        System.out.println("\n------------------------------------------\n");

        //anteriormente i virou 11, agora i volta a valer 10.
        int b = k / --i % 3 + 1;// 30 / 10 --- 3 % 3 --- 0 + 1
        
        System.out.println("Exemplo 2:\nk / --i % 3 + 1 = "+ b);
        
        System.out.println("\nMostrando que l voltou a valer 10.\nl = "+ i);//10
        System.out.println("\n------------------------------------------\n");

        int c = 2;

        //Para atribuições compostas, atribuição com soma prevalece sobre atribuição com multiplicação 
        c *= i += 5;//i + 5 --- 15 * c = 30
        System.out.println("Exemplo 3:\nc *= i += 5 = "+ c);
    }

}
