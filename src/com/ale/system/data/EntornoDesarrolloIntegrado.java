package com.ale.system.data;

public enum EntornoDesarrolloIntegrado
{
    Netbeans("Netbeans"),
    IntelliJ("IntelliJ IDEA"),
    AndroidStudio("Android Studio"),
    XCode("X-Code"),
    VisualStudio("Visual Studio"),
    VisualStudioCode("Visual Studio Code"),
    ;
    
    private final String toString;
    
    EntornoDesarrolloIntegrado(String toString)
    {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
