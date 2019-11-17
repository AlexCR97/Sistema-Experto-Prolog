package com.ale.system.model;

import java.awt.Component;

public class Model<T extends Component>
{
    protected final T component;
    
    public Model(T component)
    {
        this.component = component;
    }
}
