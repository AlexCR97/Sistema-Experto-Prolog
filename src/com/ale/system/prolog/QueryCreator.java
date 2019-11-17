package com.ale.system.prolog;

import org.jpl7.Query;

public class QueryCreator
{
    public static Query fromFile(String filePath)
    {
        String query = String.format("consult('%s')", filePath);
        return new Query(query);
    }
    
    public static Query fromQuery(String query)
    {
        return new Query(query);
    }
}
