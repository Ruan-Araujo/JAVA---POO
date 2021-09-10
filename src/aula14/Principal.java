package aula14;

public class Principal {

    public static void main(String[] args) {

        Porto portoDeSantos = new Porto("Porto de Santos");

        Container containerI = new Container(1, "China", true);

        Container containerII = new Container(3, "EUA", true);

        Container containerIII = new Container(0, "Brasil", false);

        Container containerIV = new Container(2, "Russia", true);

        Container containerV = new Container(6, "Canada", false);

        Container containerVI = new Container(5, "Desconhecido", true);

        Container containerVII = new Container(4, "Desconhecido", true);

        portoDeSantos.addContainer(containerI);
        portoDeSantos.addContainer(containerII);
        portoDeSantos.addContainer(containerIII);
        portoDeSantos.addContainer(containerIV);
        portoDeSantos.addContainer(containerV);
        portoDeSantos.addContainer(containerVI);
        portoDeSantos.addContainer(containerVII);

        portoDeSantos.mostrarOrdenarContainer();

        System.out.println("Encontramos " + portoDeSantos.getQuantidadeContainerPerigosos() + " com materiais perigosos");

    }
}
