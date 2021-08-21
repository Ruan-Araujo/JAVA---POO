package aula05;

public class Jogo {
    // Atributos
    private String nome;
    private String nickname;
    private int pontuacao = 0;
    private int nivel = 0;

    //getters e setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    // Construtor
    Jogo(String nome, String nickname){
        this.nome = nome;
        this.nickname = nickname;
    }

    // Métodos
    public String aumentarPontuacao(int quantosPontos){
        this.pontuacao += quantosPontos;
        return "Sua pontuação é " + this.pontuacao;
    }

    public String subirNivel(int quantosNiveis){
        this.nivel += quantosNiveis;
        return "subiu para o nivel " + this.nivel;
    }

    public String bonus(int quantoDeBonus){
        this.pontuacao = pontuacao + quantoDeBonus;
        return "Sua nova pontuacão com bonus é " + this.pontuacao;
    }
}
