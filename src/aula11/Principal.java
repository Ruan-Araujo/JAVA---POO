package aula11;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        Impressora impressora = new ImpressoraEpson("XX", "XY",
                LocalDate.of(2021, 9, 5), 2, 50 );
    }
}
