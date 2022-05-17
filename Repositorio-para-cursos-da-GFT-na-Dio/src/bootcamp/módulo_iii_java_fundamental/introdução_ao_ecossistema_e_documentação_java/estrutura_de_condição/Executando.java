package bootcamp.módulo_iii_java_fundamental.introdução_ao_ecossistema_e_documentação_java.estrutura_de_condição;

import bootcamp.módulo_iii_java_fundamental.introdução_ao_ecossistema_e_documentação_java.estrutura_de_condição.base.EstruturaDeCondicao;

public class Executando {
    public static void main(String[] args) {

        EstruturaDeCondicao teste = new EstruturaDeCondicao(1000); 
        System.out.println(teste.calcularTaxa());
    }
}
