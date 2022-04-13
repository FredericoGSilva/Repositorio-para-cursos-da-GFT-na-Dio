package com.gft.EstruturaDeRepeticao.base;

public class Ordem {
    private final String code;
    private final int valorTotal;

    private String[] itens;

    public Ordem(String code, int valorTotal) {
        this.code = code;
        this.valorTotal = valorTotal;
    }

    //Usando while
    public void imprimirItens() {//percorres por todos os itens da lista e imprimi-los
        int i = 0;
        while (i < itens.length) {//length irá verificar o tamanho da lista.
            System.out.println(itens[i]);//i será um item específico. No momento q laço passar por um item(i), ele será printado. 
            i++;//aqui ele conta
        }
    }

    //Usando Do / while
    public void imprimirItens2() {
        int i = 0;
        do {
            System.out.println(itens[i]);
            i++;

        } while (i < itens.length);
    }

    //Usando o for
    public void imprimirItens3() {
        for (int i = 0; i < itens.length; i++) {
            System.out.println(itens[i]);
        }
    }

    //Usando enhanced for:
    public void imprimirItens4() {

        for (String i : itens) { //Atribui os itens da lista para uma variavel
            System.out.println(i);//Aqui irá imprimir a variavel q recebe cada item da lista.
        }
    }
}
