package services;

import models.Chambre;
import models.Etudiant;
import models.Pavillon;

public interface IService {

    public void ajouterChambre(Chambre chambre);
    public void listerChambre();
    public void listerChambrePavillon(int id);
    public int getPositionChambre(int id);
    public void supprimerChambre(int id);

    public void ajouterPavillon(Pavillon pavillon);
    public void listerPavillon();
    public int getPositionPavillon(int id);
    public void archiverPavillon(int id);
    public void affecterChambrePavillon(int id,Chambre chambre);

    public void ajouterEtudiant(Etudiant etudiant);
    public void affectChambreEtudiant(int id,Chambre chambre);

}
