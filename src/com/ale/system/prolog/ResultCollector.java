package com.ale.system.prolog;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jpl7.Query;
import org.jpl7.Term;

public class ResultCollector
{
    public ResultCollector() { }
    
    public List<Map<String, Term>> collectQueryResults(Query query)
    {
        List<Map<String, Term>> results = new ArrayList<>();
        
        while (query.hasNext())
            results.add(query.next());
        
        return results;
    }
}
