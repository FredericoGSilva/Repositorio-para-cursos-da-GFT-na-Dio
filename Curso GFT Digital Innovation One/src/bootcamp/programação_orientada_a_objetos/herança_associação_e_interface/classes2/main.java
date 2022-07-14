package bootcamp.programação_orientada_a_objetos.herança_associação_e_interface.classes2;

public class main {
    public static void main(String[] args) {
        
        // Upcast com as Classes Gerente, Vendedor e Faxineiro
        // Agora as 3 classes subiram na hierarquia de classes
        Funcionario gerenteEfuncionario = new Gerente();

        Funcionario vendedorEfuncionario = new Vendedor();

        Funcionario faxineiroEfuncionario = new Faxineiro();
    
// ------------------------------------------------------------------------------------------------

        // Downcast com as Classes Gerente, Vendedor e Faxineiro
        // Agora as 3 classes desceram na hierarquia de classes

        Gerente gerenteNaoEfuncionario = (Gerente) new Funcionario();

        Vendedor vendedorNaoEfuncionario = (Vendedor) new Funcionario();

        Faxineiro faxineiroNaoEfuncionario = (Faxineiro) new Funcionario();
    
    
    
    }
}