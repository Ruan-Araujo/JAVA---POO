package aula11;

import java.time.LocalDate;

public class ImpressoraCannon extends Impressora {
    public ImpressoraCannon(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis,
                            double porcTinta){
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcTinta);
    }

    @Override
    public String imprimir() {
        return null;
    }

    @Override
    public boolean precisaTinta() {
        return super.precisaTinta();
    }
}
