package bootcamp.entendendo_métodos_java;

import javax.swing.JOptionPane;

public class Hora {

    private static int horas;

    public static void mensagem() {
        horas = Integer.parseInt(JOptionPane.showInputDialog("Que horas é agora? "));
    }

    public static void horas() {
        mensagem();
        if (horas >= 5 && horas < 12) {
            System.out.println("Bom dia !!!!");
        } else if (horas >= 12 && horas < 18) {
            System.out.println("Boa tarde!!!!");
        } else if (horas >= 18 && horas <= 24) {
            System.out.println("Boa noite!!!!");
        } else {
            System.out.println("Não sei, não tenho relógio");
        }
    }
}