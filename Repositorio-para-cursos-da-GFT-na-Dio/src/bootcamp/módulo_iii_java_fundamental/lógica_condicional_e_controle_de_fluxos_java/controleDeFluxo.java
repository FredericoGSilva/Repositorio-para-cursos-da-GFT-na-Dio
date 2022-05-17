package bootcamp.módulo_iii_java_fundamental.lógica_condicional_e_controle_de_fluxos_java;

public class controleDeFluxo {

    public static void ifElse() {

        int mes = 9;

        if (mes == 1) {
            System.out.println("Janeiro");

        } else if (mes == 2) {
            System.out.println("Fevereiro");

        } else if (mes == 3) {
            System.out.println("Março");

        } else if (mes == 4) {
            System.out.println("Abril");

        } else if (mes == 5) {
            System.out.println("Maio");

        } else if (mes == 6) {
            System.out.println("Junho");

        } else if (mes == 7) {
            System.out.println("Julho");

        } else if (mes == 8) {
            System.out.println("Agosto");

        } else if (mes == 9) {
            System.out.println("Setembro");

        } else if (mes == 10) {
            System.out.println("Outubro");

        } else if (mes == 11) {
            System.out.println("Novembro");

        } else if (mes == 12) {
            System.out.println("Dezembro");
        }
    }

    public static void iFerias() {
        //Como só a variável "mes" está sendo envolvida nesse if, o melhor seria usar um switch
        //Quais são os valores possíveis q a variável "mes" pode ter
        //Se o teste envolve apenas uma variável, usar o switch
        String mes = "Julho";

        if (mes == "Julho" || mes == "Desembro" || mes == "Janeiro") {
            System.out.println("Férias");
        }
    }

}