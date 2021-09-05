package aula11;

public class AssociadoHabilitado extends Associado{

    private double custoPiscina;
    private boolean habilitado;

    public AssociadoHabilitado(String numAssociado, String nome, double valorMensal, String atividade,
                               double custoPiscina, boolean habilitado) {
        super(numAssociado, nome, valorMensal, atividade);
    }

    @Override
    public double custoMensal(double valor) {
        return super.custoMensal(valor);
    }
}
