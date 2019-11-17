package com.ale.system.data;

public enum Paradigma
{
    Imperativo("Imperativo"),
    Declarativo("Declarativo"),
    Estructurado("Estructurado"),
    OrientadoObjetos("Orientado a Objetos"),
    Funcional("Funcional"),
    Logico("Lógico"),
    ;
    
    private final String toString;
    
    Paradigma(String toString)
    {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
