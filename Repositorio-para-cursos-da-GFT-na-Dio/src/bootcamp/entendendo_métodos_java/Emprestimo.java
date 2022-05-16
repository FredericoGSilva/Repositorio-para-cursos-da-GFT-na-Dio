package bootcamp.entendendo_métodos_java;

//Calcular empréstimo a partir d um valor de uma taxa e de uma quantidade d parcelas

//Métodos q chamam as parcelas e suas respectivas taxas de cobrança
//Esses métodos relacionados ao número de parcelas será usado em um método calcular

public class Emprestimo {

    public static int getDuasParcelas() { // Os métodos podem trabalhar em conjunto
        return 2; 
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double taxaDuasParcelas() {
        return 0.3;
    }

    public static double taxaTresParcelas() {
        return 0.45;
    }

    // Método de calculo
    public static void calcular(double valor, int parcelas) {
        if (parcelas == 2) {
            double valorFinal = valor + (valor * getDuasParcelas());
            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        }

        if (parcelas == 3) {
            double valorFinal = valor + (valor * getTresParcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        }
    }
}