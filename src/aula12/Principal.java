package aula12;

public class Principal {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Mercado Livre", "423423432432");

        Funcionario funcionario = new Gerente("Ronaldo", "Fenomeno",
                "3242423", 4000);

        empresa.cadastrar(funcionario);

        Funcionario funcionario1 = new Vendedor("Ronaldinho", "Gaucho",
                "3242423", 4000, 50);

        empresa.cadastrar(funcionario1);

        empresa.listar();

        System.out.println(empresa);
    }
}
