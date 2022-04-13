package com.gft.Javadoc;

import java.math.BigDecimal;

public class PesquisarOqEstáAcontecendoNessaClasse {
    private final String code; //O que é "final"?
    private final BigDecimal valorTotal;//O que é BigDecimal?

    public PesquisarOqEstáAcontecendoNessaClasse(String code, BigDecimal valorTotal) {
        this.code = code;
        this.valorTotal = valorTotal;
    }

    public BigDecimal calcularTaxa() throws RuntimeException {//Pesquisar o q é: "thrwos" e "RuntimeException"
        if (this.valorTotal.signum() < 0) {//Pesquisar o q é "signum"
            throw new RuntimeException("O pedido não pode ser negativo");//O q "throw new RuntimeException" está fazendo? 
        }

        if (this.valorTotal.compareTo(new BigDecimal(100.00)) > 0) {//Pesquisar: compareTo
            return this.valorTotal.multiply(new BigDecimal(0.99));//O que está linha está fazendo
        } else {
            return this.valorTotal;
        }
    }
}