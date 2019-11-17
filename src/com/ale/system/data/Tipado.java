package com.ale.system.data;

public enum Tipado
{
    Fuerte("Fuerte"),
    Debil("Débil"),
    Dinamico("Dinámico"),
    Estatico("Estático"),
    Pato("Pato"),
    ;
    
    private final String toString;
    
    Tipado(String toString)
    {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
