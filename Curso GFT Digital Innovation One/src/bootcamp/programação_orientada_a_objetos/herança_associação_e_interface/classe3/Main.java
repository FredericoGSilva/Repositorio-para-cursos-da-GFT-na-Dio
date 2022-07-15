package bootcamp.programação_orientada_a_objetos.herança_associação_e_interface.classe3;

public class Main {
    public static void main(String[] args) {
        
        // Vetor do tipo "ClasseMae"
        //Tipos dos objetos dentro do vetor: ClasseFilha1, ClasseFilha2, ClasseMae 
        ClasseMae[] classes = new ClasseMae[] {
            new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()
        };

        //forEach percorre cada objeto e chama o método1 de cada objeto(nesse caso são classes) do vetor
        //método1 está originalmente presente na ClasseMae e está sobrescritos nas classes filhas 1 e 2
        
        /*Quando forEach passa pela ClasseFilha1 no vetor acontece o Polimorfismo pois ClasseFilha1 é 
        do tipo ClasseMae mas no momento do forEach o Java entende q o método1 q está sendo 
        chamado no momento é do ClasseFilha1 e isso é Polimorfismo. Repare na construção do forEach: 
        O tipo é ClasseMae mas o metodo1 se comportou de acordo com o instancia q é "new ClasseFilha1"
        Aí o forEach passa pela ClasseFilha2 e acontece o mesmo processo.
        Agora o forEach passa pela instancia "new ClasseMae" não acontece Polimorfismo porque 
        no forEach o tipo "ClasseMae" é igual ao objeto do vetore "ClasseMae"*/

        /* IMPORTANTE: Repare q o Polimorfismo só acontece quando se têm o tipo diferente das instancias - 
         * tipo ClasseMae[]
         * instancias ClassesFilhas 1 e 2
        */
        for (ClasseMae classe : classes) {
            classe.metodo1();
        }

        System.out.println("");

        /*Nesse casso o ClasseFilha1 não se comporta Polimorficamente pois essa classe não têm o metodo2, 
        então o forEach acaba chamanado o metodo2 da ClasseMae.
        No ClasseFilha2 se comporta Polimorficamente pois eu Sobrescrevi o metodo2 nele o mais óbvio, 
        q é a instancia new ClasseMae q não acontece o Polimorfismo pois é igual o tipo do forEach 
        ou seja está chamando metodo2 "dele mesmo". */
        for (ClasseMae classe : classes) {
            classe.metodo2();
        }

        System.out.println("");

        // apenas Sobrescrita: pois estou instanciando diretamente a ClasseFilha2.
        //Através da instanciação da ClasseFilha2 eu estou chamando o método diretamente da classe.
        /* Na parte d cima era Sobrescrita com Polimorfismo pois estava trabalhando com a ClasseMae, 
        a exceção é quando o forEach passa pela própria ClasseMae onde o metodo1 e metodo2 é originalmente dela.

         * Repare o tipo na contrução do forEach ou na construção do Vetor: tipo ClasseMae.
         * Já aqui o tipo é ClasseFilha2, apenas Sobrescrita do método2.
         * Trabalhar diretamente com o tipo, não acontece Polimorfismo 
         * e sim exatamente uma Sobrescrita. 
        */
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
