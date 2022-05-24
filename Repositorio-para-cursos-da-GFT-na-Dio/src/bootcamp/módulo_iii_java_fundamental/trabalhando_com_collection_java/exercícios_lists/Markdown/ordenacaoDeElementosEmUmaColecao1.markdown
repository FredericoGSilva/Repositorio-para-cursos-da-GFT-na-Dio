```java

package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);
Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/
 
public class ordenacaoDeElementosEmUmaColecao1 {
    public static void main(String[] args) {

        // List do tipo <Gato>Object --- <Gato> é a classe criada
        List<Gato> meusGatos = new ArrayList<>() {{//Lista onde será "colocado" os gatos da classe Gato
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarela"));
        }};
        //imprimindo a lista de gatos
        System.out.println(meusGatos);

        System.out.println("Odem de inserção: "); 
        System.out.println(meusGatos);//Já é normal o List mostrar os elementos na sua ordem de inserção a não que eu faça um algoritmo para mudar a ordem

        System.out.println("Ordem aleatória: ");
        Collections.shuffle(meusGatos);//A classe Collections e o método shuffle = irá "bagunçar" a lista
        System.out.println(meusGatos);

        /*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */

        //ATENÇÃO COM ESSE EXERCÍCIO:

        //A classe Double têm um método para organizar, saber qm vêm primeiro e qm vêm depois em uma lista q esteja desorganizada.
        //interface Compateble - irei implementar a interface Comparable na classe Gato p/ java comparar os elementos d acordo cm os nomes
        System.out.println("Ordem natural");
        //como estou querendo comparar d acordo cm a ordem natural e um List armazena d acordo cm a ordem de inserção tenho q usar um método q faça essa organização
        //Collections têm classes e interfaces e o método sort() está presente no tanto no próprio Collections quando na Interface List
        Collections.sort(meusGatos);//Collections têm o método sort() q faz essa comparação --- p/ essa List ser organizada precissa ter o método comparable() q está lá na classe Gato 
        //meusGatos.sort() --- List tb têm o método sort()
        System.out.println(meusGatos);//os elementos dentro dessa lista é do tipo <Gato> q é organizada d acordo com o Comparable
        
    }
}

// CRIANDO A CLASSE

//implementando a interface Comparable
//interface Compateble - irei implementar a interface Comparable na classe Gato p/ java comparar os elementos d acordo cm os nomes
class Gato implements Comparable<Gato> {

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    //para imprimir tenho q sobrescrever a classe Gato
    @Override
    public String toString() { //método de impressão
        // TODO Auto-generated method stub
        return "{" +
                "nome ='" + nome + '\'' +                                              
                ", idade =" + idade +
                ", cor ='" + cor + '\'' + 
                '}';
    }

    @Override
    public int compareTo(Gato gato) {//sobrecrevendo o método compareTo() da interface Compareble 
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(getNome());//comparando o nome do gato com o próximo gato da lista
                                                             //estou comparando nomes q são String, a própria String têm um método chamado compareToIgnoreCase:
    }                                                        //compareToIgnoreCase = retorna um int. Então se esse return retornar 0, qr dizer q o "gato" q estou comparando cm o próximo "gato" da lista é pq os 2 gatos têm nomes iguais.    
                                                            //se retornar 1 qr dizer q o gato q estou comparando têm têm q ficar depois ou seja, é maior do gato q está sendo comparado
}                                                           //se retornar -1 qr dizer q o gato q estou comparando têm q ficar antes ou seja, é menor do cada q o gato está sendo comparado 

 /*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */




```