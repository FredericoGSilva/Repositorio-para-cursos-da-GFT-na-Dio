package bootcamp.programação_orientada_a_objetos.herança_associação_e_interface.classe3;

public class ClasseFilha1 extends ClasseMae{
    
    @Override //Override: sobrescrever - sobrescrevendo o método da Classe Mãe
    void metodo1() {
        System.out.println("Método 1 da Classe Filha 1"); //Polimorfismo: mesmo método da Classe Mãe mas se comportando de maneira diferente
    }
}