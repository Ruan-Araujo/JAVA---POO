package modelandoClasses;

public class FuncionarioLoja {

    private String nome;
    private float valeRefeicao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValeRefeicao() {
        return valeRefeicao;
    }

    public void setValeRefeicao(float valeRefeicao) {
        this.valeRefeicao = valeRefeicao;
    }

    public FuncionarioLoja(String nome, float valeRefeicao) {
        this.nome = nome;
        this.valeRefeicao = valeRefeicao;
    }

    public void reajustarVale(float taxa){
        System.out.println(this.valeRefeicao *= taxa);
    }
}
