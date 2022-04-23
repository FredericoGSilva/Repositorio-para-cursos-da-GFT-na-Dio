package bootcamp.variáveis_tipos_de_dados_e_operadores_matemáticos;

public class Variaveis {
    public static void main(String[] args) {
        
        int i;
        //int i;Variáveis não podem ser reperidas, apenas se estiverem em métodos diferentes.
        int I; //válido mas não usual.
        //int 1a; não podem começar por números
        int _1a; //não é uma boa prática
        int $aq; //não é uma boa prática

        //Sempre inicializar as variáveis
        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;
        
        final int j = 10;//variável final = é constante, nunca muda
        //j = 15;irá dar erro pois j é uma constante

        int quantidadeProduto = 50;

        final int NUMERO_TENTATIVAS = 5;;//variáveis final devem seguir essa regra de nomenclatura

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
    }
}
