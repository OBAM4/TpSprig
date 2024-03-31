package ma.ehei.Impl;

import ma.ehei.Interfaces.EtudiantDAO;
import ma.ehei.model.Etudiant;

public class MysqlEtudiantDao implements EtudiantDAO {

    @Override
    public void persister(Etudiant etudiant) {
       System.out.println("persiser avec succes");
        
    }
    
}
