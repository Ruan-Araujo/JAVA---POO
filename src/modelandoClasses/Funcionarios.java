package modelandoClasses;

// Classe
public class Funcionarios {
    private String cargo;
    private double salario;

// Getters && Setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

// Construtor
    Funcionarios(String cargo, double salario){
        this.cargo = cargo;
        this.salario = salario;
    }

// Métodos

    // Aumentar valor
    void aumentarSalario(double valor){
        this.salario += valor;
    }

    void consultarDados(){
        System.out.println("O cargo desse funcionário é " + this.getCargo()
                            + ", o salário é: " + this.salario);
    }

}
