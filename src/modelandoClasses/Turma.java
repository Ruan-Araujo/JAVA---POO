package modelandoClasses;

public class Turma {

    private String periodo;
    private String serie;
    private String sigla;
    private String tipoEnsino;

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTipoEnsino() {
        return tipoEnsino;
    }

    public void setTipoEnsino(String tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }

    Turma(String periodo, String serie, String sigla, String tipoEnsino){
        this.periodo = periodo;
        this.serie = serie;
        this.sigla = sigla;
        this.tipoEnsino = tipoEnsino;
    }
}
