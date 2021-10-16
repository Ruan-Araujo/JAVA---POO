package aula15;

public class ClienteException extends Exception{

    public ClienteException(){};

    public ClienteException(String mensagem){
        super(mensagem);
    }

    @Override
    public String toString() {
        return "A seguinte exceção ocorreu: " + getClass().getName() + "mensagem" + getMessage();
    }
}
