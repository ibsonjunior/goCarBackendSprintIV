package br.com.digitalhouse.services.exceptions;

public class ProductNotFoundException extends RuntimeException{
    public static final long serialVersionUID = 1L;

    public ProductNotFoundException(String msg){
        super(msg);
    }
}
