package Exceptions;

public class NoMoneyException extends RuntimeException{

    //Constructor
    public NoMoneyException(String message) {
        super(message);
    }
}
