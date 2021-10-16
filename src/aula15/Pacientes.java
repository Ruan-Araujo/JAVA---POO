package aula15;

import java.util.Date;

public class Pacientes {
    String nome;
    String sobrenome;
    String historiaClinica;
    Date dataInternacao;
    Date dataAlta;


    Pacientes(String nome, String sobrenome, String historiaClinica, Date dataInternacao) {
        Date hoje = new Date();
        this.nome = nome;
        this.sobrenome = sobrenome;
        dataAlta = null;
        if (dataInternacao.before(hoje))
            this.dataInternacao = dataInternacao;
    }

    public Date getDataInternacao() {
        return dataInternacao;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void darAlta(Date dataAlta) throws PacientesException {
        if (dataAlta.after(dataInternacao)){
            System.out.println("Alta concedida");
        } else {
            throw new PacientesException(" Data inválida");
        }
    }
}
