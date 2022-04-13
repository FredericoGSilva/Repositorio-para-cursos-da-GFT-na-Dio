package com.gft.EstruturaDeCondicao.base;

public class EstruturaDeCondicao {
    private final String code;
    private final int valorTotal;

    public EstruturaDeCondicao(String code, int valorTotal) {
        this.code = code;
        this.valorTotal = valorTotal;
    }
    //Estrutura de condição com if / else
    /*public double calcularTaxa() {
        if(this.valorTotal > 100) {
            return valorTotal * 0.99;
        } else {
            return valorTotal;
        }
    }*/

    //Estrutura de condição com Switch case
    public double calcularTaxa() {
        switch(this.valorTotal) {
            case 100:
                return this.valorTotal * 0.99;
            case 200:
                return this.valorTotal * 1.99;
            default:
                return this.valorTotal;
        }
    }
}
