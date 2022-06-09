```Java

    public class ConversoesCasting {
    public static void main(String[] args) {

        //convertendo short para byte
        //short têm uma capacidade maior
        //Vou fazer Downcast, reduzindo a capacidade d representação d short p/ byte recebe-lo
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;//byte têm um armazenamento mt pequeno o q resulta em perda d informação - 1000 vira -24
        System.out.println("short para byte: "+ b1);

        //Upcast, um tipo menor sendo recebido por um tipo maior --- int para long
        //Nesse case sobrará espaço no armazenamento do long, mesmo recebendo um int
        long l1;
        int i1 = 10;
        l1 = i1;
        System.out.println("int para long: "+ l1);

        //Downcast
        //long para int --- do maior para o menor, ou seja, haverá perda de informação
        int l2;
        long i2 = 1000000000000000000L;
        l2 = (int) i2;
        System.out.println("long para int: "+ l2);

        //Nesse caso é um Downcast q não ocorre nenhuma perda d informação, pois o valor q long recebe, o armazenamento d int tb suporta.
        //long para int
        //Sem perda d informação.
        int i3;
        long l3 = 10000L;
        i3 = (int) l3;
        System.out.println("long para int: "+ i3);

        //Upcast: um tipo maior recebendo um tipo menor, assim irá sobra espaço d armazenamento p/ double
        //float para double
        double d1;
        float f1 = 10.5f;
        d1 = f1;
        System.out.println("float para double: "+ d1);

        //Downcast q não ocorre perda d informações pois o valor q double recebe, cabe no armazenamento d float.
        //double para float
        //sem perda d informação 
        float f2;
        float f3;
        double d2 = 10000.58D;
        f2 = (float) d2;
        System.out.println("double para float: "+ f2);

        //Downcast com perda d informação, pois o valor d double é muito além do q o armazenamento d float suporta
        //double para float --- maior para o menor
        double d3 = 10000.588888888888888888888888888888888888888888888888888888D;
        f3 = (float) d3;
        System.out.println("double para float: "+ f3);

        //Downcast cm perda de informação
        //float para int --- maior para o menor     
        //Truncado: ignorar a parte decimal d um número e só usar a parte inteira 
        int i4;
        float f4 = 11.5697F;
        i4 = (int) f4;
        System.out.println("float para int: "+ i4);

    }
}

```
