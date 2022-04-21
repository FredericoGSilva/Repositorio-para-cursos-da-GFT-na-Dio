package bootcamp.introdução_ao_ecossistema_e_documentação_java.primeiro_programa;

import bootcamp.introdução_ao_ecossistema_e_documentação_java.primeiro_programa.base.Order;

public class MyFirstProgram {
    public static void main(String[] args) {
        
        Order ordem = new Order("Olá mundo");
        System.out.println(ordem);
    }   
}
