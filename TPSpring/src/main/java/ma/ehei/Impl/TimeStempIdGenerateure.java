package ma.ehei.Impl;

import java.util.Date;


import ma.ehei.Interfaces.IdGenerateure;

public class TimeStempIdGenerateure implements IdGenerateure {
    

    @Override
    public String genId() {

        Date date = new Date();

        long S = date.getTime();


        return Long.toString(S);
    }
}
