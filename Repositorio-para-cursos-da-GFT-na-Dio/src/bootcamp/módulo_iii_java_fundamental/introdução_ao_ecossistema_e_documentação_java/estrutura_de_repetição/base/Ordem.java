package bootcamp.módulo_iii_java_fundamental.introdução_ao_ecossistema_e_documentação_java.estrutura_de_repetição.base;

public class Ordem {

    private String[] itens;

    // Usando while
    public void imprimirItens() {
        int i = 0;
        while (i < itens.length) {
            System.out.println(itens[i]);
            i++;
        }
    }

    // Usando Do / while
    public void imprimirItens2() {
        int i = 0;
        do {
            System.out.println(itens[i]);
            i++;

        } while (i < itens.length);
    }

    // Usando o for
    public void imprimirItens3() {
        for (int i = 0; i < itens.length; i++) {
            System.out.println(itens[i]);
        }
    }

    // Usando enhanced for:
    public void imprimirItens4() {

        for (String i : itens) {
            System.out.println(i);
        }
    }
}
