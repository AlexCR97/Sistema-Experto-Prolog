package com.ale.system.prolog;

import org.jpl7.Query;

public class PrologEngine
{
    public static boolean initializeFromFile(String filePath)
    {
        Query query = QueryCreator.fromFile(filePath);
        return query.hasSolution();
    }
}
