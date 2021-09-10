package aula14;

import java.util.Date;

public class Teste {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("2324324324324");

        Empregado empregado = new Empregado("Ruan", new Date(27/07/1998));
        Empregado empregado1 = new Empregado("Josue", new Date(27/07/1998));

        empresa.addEmpregado(empregado);
        empresa.addEmpregado(empregado1);

        System.out.println(empresa.quantEmpregados());
    }
}
