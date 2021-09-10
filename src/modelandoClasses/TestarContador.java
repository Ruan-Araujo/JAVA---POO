package modelandoClasses;

public class TestarContador {

    public static void main(String[] args) {
        System.out.println("Contador: " + Contador.contador);
        Contador c1 = new Contador();
        System.out.println("Contador: " + c1.contador);
        Contador c2 = new Contador();
        System.out.println("Contador: " + c2.contador);

        System.out.println("Contador: " + Contador.contador);

        Contador.zerarContador();
    }
}
