package modelandoClasses;

public class TestarAluno {
    public static void main(String[] args) {

        Aluno alunoI = new Aluno("José", "456782", "27/08/2010");
        System.out.println(alunoI.getNome());
        System.out.println(alunoI.getRg());
        System.out.println(alunoI.getDataNascimento());

        Aluno alunoII = new Aluno("Ruan", "789065", "28/02/2003");
        System.out.println(alunoII.getNome());
        System.out.println(alunoII.getRg());
        System.out.println(alunoII.getDataNascimento());
    }
}
