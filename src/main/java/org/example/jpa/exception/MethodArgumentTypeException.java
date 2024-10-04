package org.example.jpa.exception;

public class MethodArgumentTypeException  extends RuntimeException{
    // issue: name not valid
    // or phone not valid
    // or email not valid
    public MethodArgumentTypeException(String message){
        super(message);
    }
}
