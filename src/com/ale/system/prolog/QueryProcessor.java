package com.ale.system.prolog;

import java.util.List;
import java.util.Map;
import org.jpl7.Query;
import org.jpl7.Term;

public class QueryProcessor
{
    private QueryProcessor() { }
    
    public static boolean processForBoolean(String query)
    {
        Query q = QueryCreator.fromQuery(query);
        return q.hasSolution();
    }
    
    public static List<Map<String, Term>> processForResults(String query)
    {
        Query q = QueryCreator.fromQuery(query);
        ResultCollector collector = new ResultCollector();
        
        return collector.collectQueryResults(q);
    }
}
