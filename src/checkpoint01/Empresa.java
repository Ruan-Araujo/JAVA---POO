package checkpoint01;

import java.util.ArrayList;

public class Empresa {

    private String nome;
    private String cnpj;
    private ArrayList <Funcionarios> listaFuncionarios = new ArrayList<>();

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void produzirMercadorias(){
        System.out.println("Produzindo mercadorias");
    }

    public void addFuncionarios(Funcionarios funcionarios){
        this.listaFuncionarios.add(funcionarios);
    }

    public void qtdFuncionario(){
        listaFuncionarios.size();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
