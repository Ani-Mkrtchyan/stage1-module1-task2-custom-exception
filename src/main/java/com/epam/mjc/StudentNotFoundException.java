package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException{
    public StudentNotFoundException(String cause){
        super(cause);
    }
    public StudentNotFoundException(String cause, Throwable clause){
        super(cause,clause);

    }
}
