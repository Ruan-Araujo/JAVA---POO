package logica;
// Faça um programa que percorra todos os número de 1 até 100. Para os números ímpares,
        //deve ser impresso um “*”, e para os números pares, deve ser impresso dois “**”
public class Asterisco {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println("**");
            }else {
                System.out.println("*");
            }
        }
    }
}
