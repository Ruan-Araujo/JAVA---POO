package modelandoClasses;

public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionarios funcionarioI = new Funcionarios("Diretor", 5000);
        System.out.println(funcionarioI.getCargo());
        System.out.println(funcionarioI.getSalario());

        Funcionarios funcionarioII = new Funcionarios("Professor", 3000.80);
        System.out.println(funcionarioII.getCargo());
        System.out.println(funcionarioII.getSalario());
    }
}
