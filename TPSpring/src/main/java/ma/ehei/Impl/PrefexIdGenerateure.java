package ma.ehei.Impl;

import ma.ehei.Interfaces.IdGenerateure;

public class PrefexIdGenerateure implements IdGenerateure {
    
    private String prefix;
    private int cpt;

    
    @Override
    public String genId() {


        return prefix + cpt++ ;
    }
    
}
