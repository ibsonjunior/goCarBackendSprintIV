package br.com.digitalhouse.services.exceptions;

public class DatabaseCarException extends RuntimeException{
    public static final long serialVersionUID = 1L;

    public DatabaseCarException(String msg){
        super(msg);
    }
}
