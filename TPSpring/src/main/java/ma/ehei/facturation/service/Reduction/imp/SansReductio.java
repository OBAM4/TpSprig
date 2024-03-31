package ma.ehei.facturation.service.Reduction.imp;

import ma.ehei.facturation.service.Reduction.ReduServ;

public class SansReductio implements ReduServ{

    @Override
    public double calcReduction(double montant) {
        return 0;
    }
    
}
