package modelandoClasses;

public class AlunoTurma {

    public static void main(String[] args) {
        Turma turma = new Turma("Tarde", "Primeira", "TP", "Presencial");
        Aluno aluno = new Aluno("Ruan", "87329483", "30/02/1000");

        aluno.turma = turma;

        System.out.println(aluno.turma.getPeriodo());
        System.out.println(aluno.turma.getSerie());
        System.out.println(aluno.turma.getSigla());
        System.out.println(aluno.turma.getTipoEnsino());
    }
}
