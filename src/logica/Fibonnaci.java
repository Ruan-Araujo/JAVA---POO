package logica;

public class Fibonnaci {
    static long Fibo(int n){
        return (n < 2 ) ? n: Fibo(n -1) + Fibo(n - 2);
    }

    public static void main(String[] args) {

        // teste do programa, imprime os 30 primeiros
        for(int i = 0; i <= 30; i++){
            System.out.println("(" + i + ") : " + Fibonnaci.Fibo(i) + "\t");
        }
    }
}
