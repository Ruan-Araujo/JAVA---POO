package modelandoClasses;

public class Gerente {

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalarioTxFixa(){
        System.out.println(this.salario *= 1.1);
    }

    public void aumentarSalarioTxVar(double valor){
        System.out.println(this.salario += this.salario * valor);
    }
}
