package bootcamp.introdução_ao_ecossistema_e_documentação_java.estrutura_de_condição.base;

public class EstruturaDeCondicao {

    private final int valorTotal;

    public EstruturaDeCondicao(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    // Estrutura de condição com if / else
    public double calcularTaxa() {
        if (this.valorTotal > 100) {
            return valorTotal * 0.99;
        } else {
            return valorTotal;
        }
    }

    // Estrutura de condição com Switch case
    /*public double calcularTaxaComSwitchCase() {
        switch (this.valorTotal) {
            case 100:
                return this.valorTotal * 0.99;
            case 200:
                return this.valorTotal * 1.99;
            default:
                return this.valorTotal;

        }
    }*/
}