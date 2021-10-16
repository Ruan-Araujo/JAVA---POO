package checkpoint01;

public class PromotorVendas extends Funcionarios implements Mercadoria{

    private String estado;
    private int quantidadeSetores;
    private int qtdVendedoras;
    Gerente gerente;
    private int estoque = 0;

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public PromotorVendas(String nome, String sobrenome, String cpf, String estado,
                          int quantidadeSetores, int qtdVendedoras) {
        super(nome, sobrenome, cpf);
        this.estado = estado;
        this.quantidadeSetores = quantidadeSetores;
        this.qtdVendedoras = qtdVendedoras;
    }

    @Override
    public int estoqueMercadoria(int qtdMercadoria) {
        return this.estoque += qtdMercadoria;
    }

    public int dividirMercadoria(){
        return this.estoque / qtdVendedoras;
    }
}
