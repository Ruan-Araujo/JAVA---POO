package aula14;

import java.util.ArrayList;

public class Porto {

    private String nome;
    private ArrayList<Container> listaContainer = new ArrayList<>();

    public Porto(String nome) {
        this.nome = nome;
    }

    public void addContainer(Container container){
        this.listaContainer.add(container);
    }

    public void mostrarOrdenarContainer(){
        listaContainer.sort((container1, container2) -> container1.compareTo(container2));
        for (Container container: listaContainer){
            System.out.println(container.getNumID());
        }
    }

    public int getQuantidadeContainerPerigosos(){
        int contador = 0;
        for (Container container: listaContainer){
            if (container.isMaterialPerigoso() && container.getPaisOrigem().equals("Desconhecido")){
                contador++;

            }
        }
        return contador;
    }
}
