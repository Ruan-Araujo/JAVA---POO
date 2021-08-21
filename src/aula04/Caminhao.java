package aula04;

public class Caminhao {
    // Atributos
    private String marca;
    private String patente;
    // Definindo a variavel de classe - elemento comum a todos os objetos da classe.
    static private double precoCombustivel = 7.10;

    // Definindo o construtor
    public Caminhao(String marca, String patente){
        this.marca = marca;
        this.patente = patente;
    }

    //Definindo os metodos
    public boolean transportando(String simOuNao){
        return simOuNao.equals("Sim");
    }

    public double gastoCombustivel(int litros){
        return litros * Caminhao.precoCombustivel;
    }

    static public void mudarPrecoCombustivel(double preco){
        Caminhao.precoCombustivel = preco;
    }
}
