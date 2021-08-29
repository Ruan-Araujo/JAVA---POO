package modelandoClasses;

public class TestarTurma {
    public static void main(String[] args) {

        Turma turmaI = new Turma("Tarde", "Segunda", "T2", "Remoto");
        System.out.println(turmaI.getPeriodo());
        System.out.println(turmaI.getSerie());
        System.out.println(turmaI.getSigla());
        System.out.println(turmaI.getTipoEnsino());
    }
}
