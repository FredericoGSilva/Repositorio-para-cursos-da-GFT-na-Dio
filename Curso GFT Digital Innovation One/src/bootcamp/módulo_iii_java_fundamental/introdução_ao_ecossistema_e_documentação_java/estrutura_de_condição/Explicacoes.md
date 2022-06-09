
```java
package com.gft.estrutura_de_condicao.base;

public class EstruturaDeCondicao {

    private final int valorTotal;

    public EstruturaDeCondicao(String code, int valorTotal) {
        this.valorTotal = valorTotal;
    }

    //Estrutura de condição com if / else
    public double calcularTaxa() {
        if(this.valorTotal > 100) {
            return valorTotal * 0.99;
        } else {
            return valorTotal;
        }
    }

    //Estrutura de condição com Switch case
    public double calcularTaxaComSwitchCase() {
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

package com.gft.estrutura_de_condicao;

import com.gft.estrutura_de_condicao.base.EstruturaDeCondicao;

public class Executando {
    public static void main(String[] args) {

        EstruturaDeCondicao teste = new EstruturaDeCondicao("Code: ", 1234);
        System.out.println(teste);
    }
}
```
