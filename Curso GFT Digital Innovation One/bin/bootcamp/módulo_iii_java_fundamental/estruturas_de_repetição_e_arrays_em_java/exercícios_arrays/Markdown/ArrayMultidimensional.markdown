```java

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o menor número da matriz e a sua posição(linha, coluna).
*/

public class ArrayMultidimensional {
    public static void main(String[] args) {
        
        Random random = new Random();//classe q gera números aleatórios

        //Matriz --- cada linha representa um Array
        int[][] matriz = new int[4][4]; // [linha] [coluna]
        
        //Primeiro for irá navegar dentro da matriz geral ou seja será pego cada linha. 
        //i < matriz.length --- loop só para quando i for maior q o tamanho da matriz
        for (int i = 0; i < matriz.length; i++) {//i representa cada linha da matriz e cada linha vai ter 4 elementos representado a baixo por j 
            
            //Percorre todos os elementos de cada linha i
            // j representa cada posição do elemento na coluna dentro da linha i 
            //j < matriz[j].length --- loop só para quando j for menor do q o tamanho(.length) da matriz
            for (int j = 0; j < matriz[i].length; j++) {// j é cada coluna dentro da linha i. esse loop é percorrido até j ser menor do q o tamanho da linha i
                matriz[i][j] = random.nextInt(9);//Na matriz [linha i] [coluna j] será inserido um número aleatório a cada loop.
            }
        }

        //Irá navegar e pegar cada elemento da primeira linha.
        //Mostrar os números aleatórios colocados na matriz
        //Usar o for each
        System.out.println("\nMatriz\n"); 
        for (int[] linha : matriz) {//Como lá no primeiro for, será pego a matriz geral ou seja será pego cada linha. 
            for (int elementoDaColuna : linha) {//Pegando cada elemento(coluna) de dentro da cada linha
                System.out.print(elementoDaColuna + " ");
            }
            System.out.println(); 
        }
    }
}

```