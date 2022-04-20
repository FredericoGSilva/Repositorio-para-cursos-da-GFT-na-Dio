```Java

package com.gft.javadoc;

import java.math.BigDecimal;
//
public class ExplicandoOcodigo {
    private final String code;
    private final BigDecimal valorTotal;

    public ExplicandoOcodigo(String code, BigDecimal valorTotal) {
        this.code = code;
        this.valorTotal = valorTotal;
    }

    public BigDecimal calcularTaxa() throws RuntimeException {
        if (this.valorTotal.signum() < 0) {//Caso o valorTotal for negativo....
            throw new RuntimeException("O pedido não pode ter valor negativo.");//Irá ser lançado uma "exceção"                    
        }//caso ao contrário:
        //se o valor for maio q 100, será aplicado uma taxa: valorTotal * 0.99
        if (this.valorTotal.compareTo(new BigDecimal(100.00)) > 100) {
            return this.valorTotal.multiply(new BigDecimal(0.99));//Aplicando a taxa
        } else {
            return this.valorTotal;//Caso ao contrário, o valor não derá nenhuma taxa
        }
    }
}

```