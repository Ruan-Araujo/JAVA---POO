package aula14;

import java.util.ArrayList;

public class Equipe {

    public String nome;
    private ArrayList <Jogador> listaJogador = new ArrayList<>();

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void addJogadores(Jogador jogador){
        this.listaJogador.add(jogador);
    }

    public void mostrarTitulares(){

    }
}
