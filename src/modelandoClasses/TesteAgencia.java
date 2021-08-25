package modelandoClasses;

public class TesteAgencia {
    public static void main(String[] args) {
        Agencia agenciaI = new Agencia(23424324);
        System.out.println(agenciaI.getNumero());
        agenciaI.setNumero(435435);
        System.out.println(agenciaI.getNumero());

        Agencia agenciaII = new Agencia(999797);
        System.out.println(agenciaII.getNumero());
        agenciaII.setNumero(23455);
        System.out.println(agenciaII.getNumero());
    }
}
