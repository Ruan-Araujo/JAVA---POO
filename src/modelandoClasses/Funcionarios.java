package modelandoClasses;

public class Funcionarios {
    private String cargo;
    private double salario;

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

    Funcionarios(String cargo, double salario){
        this.cargo = cargo;
        this.salario = salario;
    }
}
