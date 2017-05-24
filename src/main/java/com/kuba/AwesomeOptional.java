package com.kuba;


public class AwesomeOptional {

    Object object;

    public AwesomeOptional(Object object) {
        this.object = object;
    }

    public boolean isPresent(){

        return object != null;
    }

    public Object getObject() {
        return object;
    }
}
