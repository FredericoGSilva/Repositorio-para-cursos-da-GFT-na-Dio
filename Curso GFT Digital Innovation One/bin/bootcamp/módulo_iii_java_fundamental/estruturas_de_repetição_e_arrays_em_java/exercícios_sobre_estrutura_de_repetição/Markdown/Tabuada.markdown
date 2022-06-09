````java

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.println("Escolha uma tabuada de 1 a 10");
        tabuada = scan.nextInt();

        for (int tentativas = 0; tentativas < 5; tentativas++) {//Esse loop serve para as tentativas q usúario tem p/ escolher en 1 e 10
            if (tabuada < 1 || tabuada > 10) {//Aqui determina q se a tabuada ecolhida n se encaixar na regra, através do loop será pergunta + uma vez, ql a tabuada o usuário quer
                System.out.println("Voce só pode escolher tabuadas do 1 ao 10.");
                tabuada = scan.nextInt();
            } else {
                for (int i = 0; i <= 10; i++) {//Esse loop serve para realizar a conta
                    System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
                }
                break;//Se a regra de tabuada entre 1 e 10 estiver correta, o break será acionado pois n será precisa perguntar novamente ql tabuada o usuário quer.
            }

        }
        
        scan.close();
    }
}

````