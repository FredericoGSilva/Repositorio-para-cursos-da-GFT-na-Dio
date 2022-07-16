package bootcamp.programação_orientada_a_objetos.estrutura_básica_da_poo;

public class objetoCarro {
    public static void main(String[] args) {
        
        classeCarro carro1 = new classeCarro("preto", "chevrolet", 59); // construtor com atributos

        System.out.println("Cor do carro 1: " + carro1.getCor());
        System.out.println("Modelo do carro 1: " + carro1.getModelo());
        System.out.println("Capacidade do tanque do carro 1: " + carro1.getCapacidadeTanque());
        System.out.printf("Valor do combustível %.2f: ", carro1.valorTotal(6.39));

        System.out.println("\n--------------------------------------");

        classeCarro carro2 = new classeCarro(); // construtor sem atributos

        carro2.setCor("vermelho");
        carro2.setModelo("Ford");
        carro2.setCapacidadeTanque(66);
        
        System.out.println("Cor do carro 2: " + carro2.getCor());
        System.out.println("Modelo do carro 2: " + carro2.getModelo());
        System.out.println("Capacidade do tanque do carro 2: " + carro2.getCapacidadeTanque());
        System.out.printf("Valor do combustível %.2f: ", carro2.valorTotal(6.46));
    }
}
