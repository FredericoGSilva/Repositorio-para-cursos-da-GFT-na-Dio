```Java

public static void main(String[] args) {

        //Criar 2 variáveis p/ cada tipo de dado

        //TIPOS INTEIROS: byte, short int long. Cada um cm sua capacidade d armazenamento de dados
        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; o tamnho ultrapassa o limite q shot suporta

        //int i1 = -10000000000; ultrapassou o limite negativo de inteiro
        int i2 = 28500;

        long l1 = 1000000000000000000L;//long é um inteiro cm uma capacidade muito mair
        long l2 = 2004005000500055000L;//Usar o L no final p/ o Java saber q é um inteiro

        //TIPOS REAIS: float e double. Cada um cm sua capacidade d armazenamento de dados
        
        //float f1 = 4.5;Usar o F no final p/ o Java saber q é uma variável real
        float f2 = 10.68F;
    
        double d1 = 82.69;
        double d2 = 99.84d;

        //TIPOS TEXTUAIS: char e String. Cada um cm sua capacidade d armazenamento de dados
        
        char c1 = 'W';//Apenas um caracter
        //char c2 = 'Tw';
        char c3 = '\u8857';//unicode W
        
        String st1 = "Fulano";//String n é primitivo, ele é um tipo d dado composto
        String st2 = "Ciclano";
        String st3 = "ag dgb se et t KNBJBJBB @& 123456";

        //String dt1 = "19/04/1999";Para datas, String n é a melhor opeção. Existe um tipo d dado específico p/ s/isso. PESQUISAR

        //TIPOS LÓGICO: só existêm 2 possibilidades: verdadeiro ou falso.
        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);
    } 


```