package checkpoint01;

import java.util.ArrayList;

public class Gerente extends Funcionarios implements Mercadoria{

    private String estado;
    private int estoque = 0;
    private ArrayList<PromotorVendas> listaPromotores = new ArrayList<>();


    public Gerente(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    @Override
    public int estoqueMercadoria(int qtdMercadoria) {
        return this.estoque += qtdMercadoria;
    }

    public void distribuirMercadoria(int qtdMercadoria){
        if (this.estoque > 0 && this.estoque >= qtdMercadoria){
            this.estoque -= qtdMercadoria;
            System.out.println("O gerente possui no estoque: " + this.estoque + " de mercadoria");
        }else {
            System.out.println("Estoque insuficiente");
        }
    }

    public void adicionarPromotor(PromotorVendas promotorVendas){
        this.listaPromotores.add(promotorVendas);
    }


}
