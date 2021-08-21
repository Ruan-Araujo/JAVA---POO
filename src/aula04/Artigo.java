package aula04;

public class Artigo {
    // Definindo os atributos da classe
    private String descricao;
    private double precoVenda;
    private int estoque;

    // Definindo os getters e setters
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String novaDescricao){
        this.descricao = novaDescricao;
    }

    public double getPrecoVenda(){
        return this.precoVenda;
    }
    public void setPrecoVenda(double nvPrecoVenda){
        this.precoVenda = nvPrecoVenda;
    }

    public int getEstoque(){
        return this.estoque;
    }
    public void setEstoque(int novoEstoque){
        this.estoque = novoEstoque;
    }

    // Definindo Construtor
    public Artigo(String descricao, int quantidade, double preco){
        this.descricao = descricao;
        this.estoque = quantidade;
        this.precoVenda = preco;
    }

    // Definindo os métodos
    public boolean temEstoque(){
        return estoque > 0;
    }

    public double consultarPreco(){
        return precoVenda;
    }
}

