package com.ale.system.data;

public enum NombreLenguajeProgramacion
{
    C("C"),
    Cpp("C++"),
    Cs("C#"),
    VisualBasic("VisualBasic"),
    Java("Java"),
    Kotlin("Kotlin"),
    Go("Go"),
    Python("Python"),
    Ruby("Ruby"),
    Swift("Swift"),
    HTML("HTML"),
    CSS("CSS"),
    JavaScript("JavaScript"),
    PHP("PHP"),
    Dart("Dart"),
    ;
    
    private final String toString;
    
    NombreLenguajeProgramacion(String toString)
    {
        this.toString = toString;
    }
    
    @Override
    public String toString() {
        return toString;
    }
}
