package aula12;

import java.util.ArrayList;

public class Empresa {

    private String nome;
    private String cnpj;
    private ArrayList <Funcionario> listaFuncionarios = new ArrayList<>();

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void cadastrar(Funcionario funcionario){
        this.listaFuncionarios.add(funcionario);
        System.out.println("Funcionario cadastrado com sucesso");
    }

    public void listar(){
        for(int i = 0; i <listaFuncionarios.size(); i++){
            System.out.println(listaFuncionarios.get(i));
        }
    }

    @Override
    public String toString() {
        return "Empresa - " +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
