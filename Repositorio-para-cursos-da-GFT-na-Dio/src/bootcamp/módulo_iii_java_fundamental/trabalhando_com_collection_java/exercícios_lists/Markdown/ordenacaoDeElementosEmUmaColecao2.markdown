```java

        //PARTE 2 DOS EXERCÍCIOS

        public class ordenacaoDeElementosEmUmaColecao2 {
    public static void main(String[] args) {

        // List do tipo <Gato>Object --- <Gato> é a classe criada
        List<Gato> meusGatos = new ArrayList<>() {{//Lista onde será "colocado" os gatos da classe Gato
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        // repetindo o mesmo exercício do ordenacaoDeElementosEmUmaColecao1: "Ordem natural" - agora tenho q ordenar por idade
        System.out.println("Ordem idade");
        //Collections têm o método sort() q faz essa comparação --- p/ essa List ser organizada precissa ter o método a Interface Comparator q está lá na classe  
        Collections.sort(meusGatos, new ComparatorIdade());//como irei usar o comparator(), passando como parâmetro "lista" e o comparator(classe contém o método para realizar a comparação)
        //meusGatos.sort(new ComparatorIdade());
        //meusGatos.sort() --- A List "meusGatos" tb têm o método sort() 
        System.out.println(meusGatos);

        /*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
 
        System.out.println("Ordem cor");//será como o exercício acima: usarei de novo a interface Comparator
        //Collections.sort(meusGatos, new ComparaCor());
        meusGatos.sort(new ComparaCor());
        System.out.println(meusGatos);

        System.out.println("Ordem Nome, Cor, Idade");
        //Método comparar: se os nomes forem iguais, verifique as cores, se as cores dos gatos forem iguai, verifique pela idade, se a idade tb for igual
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
        
    }
}

// CRIANDO A CLASSE

class Gato implements Comparable<Gato> {    //como já sobrescrevi a interface Comparable, agora para fazer novas comparações tenho outra interface: Interface Comparator<>

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

    // para imprimir tenho q sobrescrever a classe Gato
    @Override
    public String toString() { // método de impressão
        // TODO Auto-generated method stub
        return "{" + 
                "nome ='" + nome + '\'' +
                ", idade =" + idade +
                ", cor ='" + cor + '\'' +
                '}';
    }
    //MÉTODOS DE COMPARAÇÃO

    @Override//Comparação por nome
    public int compareTo(Gato gato) {//estou referênciando a classe Gato --- variavel gato referência a classe Gato
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(getNome());// comparando um gato com o próximo gato da lista

    }

}

//CRIANDO OUTRA CLASSE

//implementando a interface Comparator
//interface Comparator - irei implementar a interface Comparator na classe Gato p/ java comparar os elementos d acordo cm a idade dos gatos
class ComparatorIdade implements Comparator<Gato> { //estou fora da classe gato por isso n uso o this.

    @Override
    public int compare(Gato gato1, Gato gato2) {
        //assim como o objeto String, Integer também têm um método de comparação
        //ele irá receber dois inteiros e irá retornar 0 ou 1 ou -1
        //Integer(inteiro) . compare(comparar) --- idade do gato1 cm a idade do gato2 
        return Integer.compare(gato1.getIdade(), gato2.getIdade());//estou comparando idade q são Integer, e o próprio Integer têm um método chamado compare():
                                                                  //compara() = retorna um int. Então se esse return retornar 0, qr dizer q o "gato" q estou comparando cm o próximo "gato" da lista é pq os 2 gatos têm a mesma idade.   
                                                                 //se retornar 1 qr dizer q o gato q estou comparando têm têm q ficar depois ou seja, é maior do gato q está sendo comparado
                                                                //se retornar -1 qr dizer q o gato q estou comparando têm q ficar antes ou seja, é menor do cada q o gato está sendo comparado 

    } 
}     

class ComparaCor implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        //gato1.pegaSuaCor e comparaIgnoraFormaDaEscrita com gato2.pegaSuaCor
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());//compareToIgnoreCase = retorna um int. Então se esse return retornar 0, qr dizer q o "gato" q estou comparando cm o próximo "gato" da lista é pq os 2 gatos têm cores iguais.    
                                                                 //se retornar 1 qr dizer q o gato q estou comparando têm têm q ficar depois ou seja, é maior do gato q está sendo comparado
                                                                //se retornar -1 qr dizer q o gato q estou comparando têm q ficar antes ou seja, é menor do cada q o gato está sendo comparado 
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if (nome != 0) { //se o retorno for diferente de 0 ou seja, 1 ou -1 vou querer q ordene por nome pq os nomes serão diferentes podendo assim, fazer a comparação por nome
            return nome;
        }
        
        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor()); //se os nomes forem iguais então vou ordenar por cor
        if (cor != 0) {
            return cor;
        } else {
            return Integer.compare(gato1.getIdade(), gato2.getIdade());//se os nomes e as cores forem iguais, vou ordenar por idade
        }
    }

}
```