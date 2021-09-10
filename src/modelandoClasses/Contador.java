package modelandoClasses;

public class Contador {

    static int contador;
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Contador(){
        Contador.contador++;
        this.numero = Contador.contador;
    }

    static void zerarContador(){
        System.out.println("Contador: " + Contador.contador);
        System.out.println("Zerando contador");
        Contador.contador = 0;
        System.out.println("Contador: " + Contador.contador);
    }
}
