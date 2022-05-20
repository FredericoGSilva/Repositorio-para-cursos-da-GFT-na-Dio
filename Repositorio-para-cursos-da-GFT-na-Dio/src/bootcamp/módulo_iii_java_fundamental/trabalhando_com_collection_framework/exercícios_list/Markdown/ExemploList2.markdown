```java

//PARTE 2 DOS EXERCÍCIOS

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2)); //get = eu passo a posição e get retorna o elemento
                                                                                       //Lembrando: a terceira nota adicionada está na posição 2 pois pq os índices começam no 0      
        
        /*N existe um método nativo na interface List para retornar o menor ou maior valor, mas posso utilizar da classe Collections, 
        o método min() ou max() e passar uma Collection e a List é uma Collection*/
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        /*------------------------------------------------------------------------------------------------------------------------------------------------------ */
        
        //ATENÇÃO COM ESSE EXERCÍCIO:

        /*N existe um método para retornar a soma, mas posso utilizar o método iterator() 
        p/ iterar dentro da List e a partir dessa iteração, ir pegando os elementos e somando*/
        System.out.println("Exiba a soma dos valores: ");
        
        //variável "iterator" é do padão Iterator, do tipo Double
        Iterator<Double> iterator = notas.iterator();//está percorrendo a lista "notas"
        //para fazer a soma dos elementos da lista, preciso chamar o método iterator() e ir iteranto dentro da lista
        
        Double soma = 0.0;

        while(iterator.hasNext()) {//iterator.hasNext() = a partir d um elemento, hasNext() verifica se têm um próximo elemento, se tiver é retornado true
            Double next = iterator.next();//esse próximo elemento é colocado dentro da variável "next".  método next() = "vai para o próximo"
            soma += next; //a cada laço, vai somando elemento com o próximo elemento
        }                 //quando chegar no final, hasNext() irá "perguntar" se têm próximo terá false como resposta e irá encerrar o laço. 
    
        //exibindo a soma dos elementos
        System.out.println("Soma dos valores: " + soma);

        /*-----------------------------------------------------------------------------------------------------------------------------------------------------------*/
                  
        //ATENÇÃO COM ESSE EXERCÍCIO:

                                                //soma dos elemetos dividido pela quantidade de elementos da List
        System.out.println("Exiba a média das notas: " + soma / notas.size());//size() = retorna a quantidade de elementos da lista

        //Também posso fazer igual ao exercício a cima só q dessa vez pegando a quantidade de elementos da lista.        
        Iterator<Double> iterator2 = notas.iterator();
        
        Double somaDasNotas = 0.0;
        Double media = 0.0;

        while (iterator2.hasNext()) {
            Double next = iterator2.next(); 
            somaDasNotas += next;
        }
        
        media = somaDasNotas / notas.size();

        //exebindo a média das notas
        System.out.println("Média das notas: " + media);

        /*-----------------------------------------------------------------------------------------------------------------------------------------------------------*/

        System.out.println("Remova a nota 0: ");
        notas.remove(0.0); //posso passar o objeto ou a posição do objeto
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);//passar a posição 0 ou passar o valor da posição 0
        System.out.println(notas);

        /*-----------------------------------------------------------------------------------------------------------------------------------------------------------*/

        //ATENÇÃO COM ESSE EXERCÍCIO:

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");

        Iterator<Double> iterator3 = notas.iterator();

        while(iterator3.hasNext()) {//iterator3 têm próximo? se tiver, será retornado true
            Double next = iterator3.next();//elemento é adicionado na variável next
            if (next < 7) { //verifixa se o elemento recebido por "next" é menor q 7.
                iterator3.remove();// se for menor q 7, é removido
            }            
        }
        //Mostrando q os números menores q 7 foram removidos
        System.out.println(notas);

        /*-----------------------------------------------------------------------------------------------------------------------------------------------------------*/
        
        System.out.println("Apague toda a lista notas: ");
        notas.clear();//clear = apaga toda a lista
        System.out.println("Lista vazia: " + notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());//isEmpty = verifica se a lista está vazia: vazia retorna true ou com elementos dentro, retorna false     
```