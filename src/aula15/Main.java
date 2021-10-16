package aula15;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Pacientes paciente = new Pacientes("Ruan", "Araujo",
                "Generico", new Date(2021/12/27));

        try {
            paciente.darAlta(new Date(2021/12/26));
        } catch (PacientesException e){
            e.printStackTrace();
        }
    }
}
