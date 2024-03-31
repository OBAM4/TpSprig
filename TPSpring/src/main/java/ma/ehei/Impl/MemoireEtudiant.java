package ma.ehei.Impl;

import java.util.ArrayList;

import ma.ehei.Interfaces.EtudiantDAO;
import ma.ehei.model.Etudiant;

public class MemoireEtudiant implements EtudiantDAO {

    public ArrayList<Etudiant> etudiants =new ArrayList<Etudiant>();





    @Override
    public void persister(Etudiant etudiant) {
        etudiants.add(etudiant);
    }
    
}
