package bootcamp.programação_orientada_a_objetos.herança_associação_e_interface.classes1;

public class Veiculo {
    private String modelo;
    private String placa;
    private int rodas;
    private int portas;

    String qualModelo(String modelo) {
        return this.modelo;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }

    
}
