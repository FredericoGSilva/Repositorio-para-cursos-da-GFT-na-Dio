package bootcamp.programação_orientada_a_objetos.estruturaBásicaDaPoo;

public class classeCarro {
    private String cor;
    private String modelo;
    private int capacidadeTanque;

//  A linguagem automaticamente cria um método construtor vazio.
    public classeCarro() {

    }

    // método construtor --- Sobrecarga do método construtor
    public classeCarro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    // método do total para encher o tanque
    public double valorTotal(double valorDoCombustivel) {
        return capacidadeTanque * valorDoCombustivel;
    }

}
