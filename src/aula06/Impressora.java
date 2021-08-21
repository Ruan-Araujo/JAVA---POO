package aula06;

import java.time.LocalDate;
import java.util.Date;

public class Impressora {

    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis;

    Impressora(String modelo, String tipoConexao, LocalDate dataFabricacao){
            this.modelo = modelo;
            this.tipoConexao = tipoConexao;
            this.dataFabricacao = dataFabricacao;
            this.folhasDisponiveis = 0;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    private boolean temPapel(){
        return folhasDisponiveis > 0;
    }

    public void imprimir(String texto){
        if (temPapel()){
            this.folhasDisponiveis--;
            System.out.println(texto);
        }else{
            System.out.println("Não tem papel");
        }
    }

}
