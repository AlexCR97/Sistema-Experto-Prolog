package com.ale.system.data;

public enum Plataforma
{
    Escritorio("Escritorio"),
    Movil("Movil"),
    Web("Web"),
    ;
    
    private final String toString;
    
    Plataforma(String toString)
    {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
