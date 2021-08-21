package DogAdocao;

import DogAdocao.DogAdocao;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DogAdocao cachorro = new DogAdocao("Catioro", "Caramelo", 3.0, LocalDate.of(2021, 8, 20));
        cachorro = new DogAdocao(true, true);
        System.out.println(cachorro.aptoAdocao());
        System.out.println(cachorro.temChip());
    }
}
