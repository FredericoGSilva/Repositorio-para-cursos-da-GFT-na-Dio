````java  

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare inserindo o valor 0 no campo nome)
*/

public class NomeEidade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);// Fluxo de entrada atrvés do teclado

        String nome;
        int idade;

        while (true) {// Irá ficar pedindo nome e idade e só será parado se for inserido 0
            System.out.println("Nome: ");
            // Atribuindo o nome na variável "nome"
            nome = scan.next(); // Método next retorna String
            if (nome.equals("0")) {// se for inserido 0 na variável nome, o prog. para
                break;
            }

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui....");

        scan.close();// Se não usar mais o Scanner, fechar

    }

}
````