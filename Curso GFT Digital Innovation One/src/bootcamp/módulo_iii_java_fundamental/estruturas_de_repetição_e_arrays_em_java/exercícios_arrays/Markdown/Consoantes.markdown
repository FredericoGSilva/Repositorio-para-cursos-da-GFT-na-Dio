```java

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Consoantes {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        /* O tamanho q eu iniciar o Array, ele "morre" cm o mesmo tamanho, 
        mesmo q alguma posição não tenha nenhum elemento dentro.*/
        String[] consoantes = new String[6];

        int quantidadeConsoantes = 0;//indica quantas consoantes foram lidas 
        
        int i = 0;
        do {
            System.out.println("Digite uma letra: ");
            String letra = scan.next();//variável "letra" guarda uma letra

            //lógica para distinguir o q é consoante e o q é vocal
            if ( ! (letra.equalsIgnoreCase("a") || //equalsIgnoreCase = irá ignorar a diferença entre letra maiúscula ou minúscula
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")) ) {
            /* ! sinal de negativo: quando não for igual a: a, e, i, o, u, qr dizer q a letra digitada é uma consoante, então:
                Array de consoantes irá receber a letra digitada */
                
                consoantes[i] = letra;//
                quantidadeConsoantes++;//Se entrar nesse if qr dizer q foi digitado um consoante e será contabilizado
            }

            i++;

        } while (i < consoantes.length);//enquanto i for menor q o tamanho do vetor "consoantes"
        
        System.out.println("Consoantes: ");
            //String consoante é uma variável q recebe o Array consoantes
        for (String consoante : consoantes) {//"Para cada elemento dentro de consoantes eu quero q imprima esse elemento"
            if (consoante != null) {//essa condição é p/ q nao apareça null no lugar dos espaços q seria das letra vocais. 
                System.out.print(consoante + " ");//A cada loop será lido uma letra consoante
            }
            
        }
        System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);
    }
}

```