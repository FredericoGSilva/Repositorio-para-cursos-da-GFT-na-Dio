package bootcamp.módulo_iii_java_fundamental.introdução_ao_ecossistema_e_documentação_java.javadoc;

import java.math.BigDecimal;

/**
 * @author Frederico Guilherme
 * @version 1.0.0
 * @see BigDecimal
 * @since Release 1.0.0
 */

public class CodigoDocumentado {

    private final BigDecimal valorTotal;

    /**
     * Construtor da classe
     * 
     * @param code       Código do pedido
     * @param valorTotal Valor total do pedido
     */
    public CodigoDocumentado(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * Calcula o valor total de acordo com o valor do pedido. Se o valor for maio
     * que R$100,00 uma taxa será cobrada
     * 
     * @return Valor total do pedido com as taxas
     * @throws RuntimeException Se o valor do pedido for negativo
     */
    public BigDecimal calcularTaxa() throws RuntimeException {
        if (this.valorTotal.signum() < 0) {
            throw new RuntimeException("O pedido não pode ser negativo.");
        }

        if (this.valorTotal.compareTo(new BigDecimal(100.00)) > 100) {
            return this.valorTotal.multiply(new BigDecimal(0.99));
        } else {
            return this.valorTotal;
        }
    }
}
