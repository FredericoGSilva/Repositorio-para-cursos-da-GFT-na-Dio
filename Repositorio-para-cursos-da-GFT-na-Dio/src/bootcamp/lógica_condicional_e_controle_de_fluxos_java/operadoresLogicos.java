package bootcamp.lógica_condicional_e_controle_de_fluxos_java;

public class operadoresLogicos {
    public static void main(String[] args) {
        
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));

        System.out.println("b2 || b3" + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));

        // quando eles são diferente o resultado é true
        System.out.println("b1 ^ b3 " + (b1 ^ b4));
        System.out.println("b4 ^ b1 " + (b4 ^ b1));

        // Negação: o que é true vira false
        // o q é false vira true
        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20F;
        float f2 = 50F;

        //Operadores aritméticos, relacionais e lógicos, criando uma expressão
        System.out.println("((i1 + i2) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1)));

        /*--------------------------------------------------------------------------------------------------*/
        double salarioMensal = 11893.58D;
        double mediaSalario = 10500D;

        int qualidadeDependentes = 4;
        int mediaDependentes = 2;
        
        System.out.println((salarioMensal < mediaSalario && (qualidadeDependentes >= mediaDependentes)));
        //criando valores intermediários
        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = qualidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));
        
        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebeAuxilio " + recebeAuxilio);
    }

}
