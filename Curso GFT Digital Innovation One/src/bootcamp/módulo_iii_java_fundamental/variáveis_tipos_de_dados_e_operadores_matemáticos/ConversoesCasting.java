package bootcamp.módulo_iii_java_fundamental.variáveis_tipos_de_dados_e_operadores_matemáticos;

public class ConversoesCasting {
    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;
        System.out.println("short para byte: " + b1);

        long l1;
        int i1 = 10;
        l1 = i1;
        System.out.println("int para long: " + l1);

        int l2;
        long i2 = 1000000000000000000L;
        l2 = (int) i2;
        System.out.println("long para int: " + l2);

        int i3;
        long l3 = 10000L;
        i3 = (int) l3;
        System.out.println("long para int: " + i3);

        double d1;
        float f1 = 10.5f;
        d1 = f1;
        System.out.println("float para double: " + d1);

        float f2;
        float f3;
        double d2 = 10000.58D;
        f2 = (float) d2;
        System.out.println("double para float: " + f2);

        double d3 = 10000.588888888888888888888888888888888888888888888888888888D;
        f3 = (float) d3;
        System.out.println("double para float: " + f3);

        int i4;
        float f4 = 11.5697F;
        i4 = (int) f4;
        System.out.println("float para int: " + i4);

    }
}
