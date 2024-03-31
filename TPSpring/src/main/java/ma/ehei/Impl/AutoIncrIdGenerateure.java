package ma.ehei.Impl;

import ma.ehei.Interfaces.IdGenerateure;

public class AutoIncrIdGenerateure implements IdGenerateure {

    private int cpt;
    @Override
    public String genId() {


        return Long.toString(cpt++);
    }
    
}
