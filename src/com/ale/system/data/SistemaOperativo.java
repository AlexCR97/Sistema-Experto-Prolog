package com.ale.system.data;

public enum SistemaOperativo
{
    Windows("Windows"),
    MacOS("MacOS"),
    Linux("Linux"),
    Android("Android"),
    iOS("iOS"),
    ;
    
    private final String toString;
    
    SistemaOperativo(String toString)
    {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
