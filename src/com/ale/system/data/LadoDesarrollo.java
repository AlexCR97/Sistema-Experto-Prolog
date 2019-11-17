package com.ale.system.data;

public enum LadoDesarrollo
{
    Backend("Backend"),
    Frontend("Frontend"),
    ;
    
    private final String toString;
    
    LadoDesarrollo(String toString)
    {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
