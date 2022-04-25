package bootcamp.entendendo_métodos_java;

public class Emprestimo {
    
    //Calcular empréstimo a partir d um valor, de uma taxa e de uma quantidade d parcelas
    
    //Métodos q chamam as parcelas e suas respectivas taxas de cobrança
    //Esses métdos relacionados ao número de parcelas será usado em um método calcular

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.3;
    } 

    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    //Método de calculo
    public static void calcular(double valor, int parcelas) {

        if (parcelas == 2) {
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final do empréstimo para 2 parcelas: R$ "+ valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$ "+ valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }
    }
}
