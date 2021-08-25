package logica;
        //Ler valores para as variáveis x e y, trocar os valores das variáveis e
        //apresentar o resultado dos valores invertidos.
public class TrocarValores {
                public static void main(String[] args) {
                        String nome = "Ruan";
                        String sobre = "Araújo";
                        String c;

                        c = nome;
                        nome = sobre;
                        sobre = c;

                        System.out.println(nome);
                        System.out.println(sobre);
                }
}
