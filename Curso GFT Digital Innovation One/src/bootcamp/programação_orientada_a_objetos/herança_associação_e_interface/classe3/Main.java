package bootcamp.programação_orientada_a_objetos.herança_associação_e_interface.classe3;

public class Main {
    public static void main(String[] args) {
        
        // Vetor do tipo "ClasseMae"
        //Tipos dos objetos dentro do vetor: ClasseFilha1, ClasseFilha2, ClasseMae 
        ClasseMae[] classes = new ClasseMae[] {
            new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()
        };

        //forEach percorre cada objeto e chama o método1 de cada objeto(nesse caso são classes) do vetor
        for (ClasseMae classe : classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe : classes) {
            classe.metodo2();
        }

        System.out.println("");

        // Sobrescrita: pois estou instanciando diretamente a ClasseFilha2.
        //Através da instanciação da ClasseFilha2 eu estou chamando o método diretamente da classe.
        /* Na parte d cima era Sobrescrita com Polimorfismo pois estava trabalhando com a ClasseMae:
         * Repare o tipo na contrução do forEach ou na construção do Vetor: tipo ClasseMae.
         * Já aqui o tipo é classeFilha2, apenas Sobrescrita do método2
        */
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
