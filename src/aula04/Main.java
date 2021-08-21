package aula04;

public class Main {
    public static void main(String[] args) {
        Artigo artigo1 = new Artigo("Artigo 1", 100, 1200.50);
        System.out.println(artigo1.temEstoque());

        if (artigo1.temEstoque()){
            System.out.println("Tem produto disponível");
        }else{
            System.out.println("Não tem produto");
        }
        System.out.println("O preço de venda é " + artigo1.consultarPreco());
    }
}
