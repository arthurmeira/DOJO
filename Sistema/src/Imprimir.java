import Membro.*;
public class Imprimir {
    public static void main(String[] args) {
        Professor professor = new Professor("Pedro", 42, 456, 3500);
        Aluno aluno = new Aluno("Thiago", 19, 731, 7.5);

        aluno.mostrarDetalhes();
        professor.mostrarDetalhes();
    }
}