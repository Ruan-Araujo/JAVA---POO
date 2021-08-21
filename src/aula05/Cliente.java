package aula05;

public class Cliente {
// Aqui defini os atributos
    private int numeroCliente;
    private String nome;
    private double divida;

// Aqui defini o Construtor
    Cliente(int numero, String nome){
        this.numeroCliente = numero;
        this.nome = nome;
        this.divida = 0;
        // Com o this eu armazeno os valores do objeto que estou criando nos atributos da classe.
    }
// Aqui defini os getters e setters
    public int getNumeroCliente(){
        return this.numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente){
        this.numeroCliente = numeroCliente;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getDivida(){
        return this.divida;
    }

    public void setDivida(double divida){
        this.divida = divida;
    }
// Aqui defino os métodos
    public String aumentarDivida(double valor){
        this.divida = divida + valor;
        return "Sua divida aumentou para " + this.divida;
    }

    public String pagarDivida(){
        this.divida = 0;
        return "Você pagou sua divida";
    }
}
