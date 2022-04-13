package com.gft.base;

public class Order {

    private String code;

    public Order(String code) { //Construtor
        this.code = code; //O atributo code irá receber o q for passado no método construtor(parâmetro) 
    }

    public String toString() { //Método responsável pela impressão
        return "A frase é "+ code;
    }
}