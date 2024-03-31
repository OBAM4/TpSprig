package ma.ehei.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.IdGenerator;

import ma.ehei.Interfaces.EtudiantDAO;
import ma.ehei.model.Etudiant;

@Service
public class EtudiantService {

    @Autowired
    @Qualifier("memoireEtudiantDAO")
    private EtudiantDAO etudiantDAO;

    @Autowired
    @Qualifier("autoIncrIdGenerateur")
  
    private IdGenerator idGenerateur;

    public void add(Etudiant etudiant) {
        if (etudiant.getNom() == null || etudiant.getNom().isEmpty()) {
            System.out.println("remplir le nom");
            return;
        }
        if (etudiant.getPrenom() == null || etudiant.getPrenom().isEmpty()) {
            System.out.println("remplir le prenom!");
            return;
        }
        etudiantDAO.persister(etudiant);
    }
}
