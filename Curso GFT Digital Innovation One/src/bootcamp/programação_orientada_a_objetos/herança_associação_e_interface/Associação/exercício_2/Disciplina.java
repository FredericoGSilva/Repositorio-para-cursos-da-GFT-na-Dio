package bootcamp.programação_orientada_a_objetos.herança_associação_e_interface.Associação.exercício_2;

public class Disciplina {
    
    // Associação Estrutural de Agregação

    /* Disciplina têm como um de seu atributos com a classe Aluno.
     * Se a classe Disciplina deixar de existir não significa q 
     * classe Aluno também deixará de existir e vise e versa.
     * Essa disciplina pode deixar de existir mas o aluno pode 
     * ter outras disciplinas.
     */
    Aluno aluno;
}
