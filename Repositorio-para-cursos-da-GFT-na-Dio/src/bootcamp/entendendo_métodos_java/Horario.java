package bootcamp.entendendo_métodos_java;

public class Horario {

    public static void mensagem(int hora) {

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                bomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                boaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                boaNoite();
                break;
            default:
                System.out.println("Horário Inválido.");
                break;
        }
    }

    public static void bomDia() {
        System.out.println("Bom dia");
    }

    public static void boaTarde() {
        System.out.println("Boa Tarde");
    }

    public static void boaNoite() {
        System.out.println("Boa Noite");
    }
}
