import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ma.ehei.model.Etudiant;
import ma.ehei.service.EtudiantService;

public class Main {
    public static void main() {
        configurerGestionEtudiant();
    }

    private static void configurerGestionEtudiant() {
        ApplicationContext app = new AnnotationConfigApplicationContext(
                ma.ehei.facturation.Conf.AppConf.class);
        EtudiantService etudiantService  = app.getBean("etudiantService", EtudiantService.class);
        Etudiant etudiant = new Etudiant("walid","hamouich")
            etudiantService.add(etudiant);
    }
}
