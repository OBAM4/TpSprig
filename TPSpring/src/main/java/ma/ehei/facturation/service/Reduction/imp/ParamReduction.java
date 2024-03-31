package ma.ehei.facturation.service.Reduction.imp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import ma.ehei.facturation.service.Reduction.ReduServ;
@Service
public class ParamReduction implements ReduServ{
    
    @Value("et")
    private double taux;
    public double getTaux()
    {
        return taux;
    }
    public void setTaux(double taux) {
        this.taux = taux;
    }



    @Override
    public double calcReduction(double montant) {
        return taux * montant /100;
    }

    
}
