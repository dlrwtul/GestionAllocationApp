package services;

import models.Chambre;
import models.Etudiant;
import models.Pavillon;

public class ServiceTableau implements IService {

    private final int NOMBRE = 10;
    private Pavillon[] tabPavillon = new Pavillon[NOMBRE];
    private Chambre[] tabChambre = new Chambre[NOMBRE];

    private int indexPavillon;
    private int indexChambre;

    @Override
    public void ajouterChambre(Chambre chambre) {
        if (indexChambre < NOMBRE) {
            chambre.setId(indexChambre + 1);
            chambre.setNumero(this.generateNumero("CH",chambre.getId()));
            tabChambre[indexChambre] = chambre;
            indexChambre++;
            System.out.println("Nouvelle chambre ajouté.");
        }else {
            System.out.println("Tableau de chambres plein.");
        }
    }

    @Override
    public void listerChambre() {
        for (Chambre chambre : tabChambre) {
            if (chambre != null && chambre.isEtat()) {
                System.out.println(chambre);
                System.out.println("");
            }
        }
    }

    @Override
    public void listerChambrePavillon(int id) {
       /*  Pavillon pavillon = tabPavillon[id-1];
        for (Chambre chambre : Pavillon.chambres) {
            System.out.println(chambre);
        } */  
    }

    @Override
    public int getPositionChambre(int id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void supprimerChambre(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ajouterPavillon(Pavillon pavillon) {
        if (indexPavillon < NOMBRE) {
            pavillon.setId(indexPavillon + 1);
            pavillon.setNumero(this.generateNumero("PA",pavillon.getId()));
            tabPavillon[indexPavillon] = pavillon;
            indexPavillon++;
            System.out.println("Nouveau pavillon ajouté.");
        }else {
            System.out.println("Tableau de pavillon plein.");
        }
    }

    @Override
    public void listerPavillon() {
        for (Pavillon pavillon : tabPavillon) {
            if (pavillon != null && pavillon.isEtat()) {
                System.out.println(pavillon);
                System.out.println("");
            }
        }
        
    }

    @Override
    public int getPositionPavillon(int id) {
        return 0;
    }

    @Override
    public void archiverPavillon(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void affecterChambrePavillon(int id, Chambre chambre) {
        Pavillon pavillon = tabPavillon[id-1];
        chambre.setPavillon(pavillon);
    }

    @Override
    public void ajouterEtudiant(Etudiant etudiant) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void affectChambreEtudiant(int id, Chambre chambre) {
        // TODO Auto-generated method stub
        
    }

    public String generateNumero(String first,int id){

        String numero = first;

        if (id >= 1000) {
            numero= numero + id;
        }
        if (id >= 100 && id<1000) {
            numero= numero + "0" + id;
        }
        if (id >= 10 && id<100) {
            numero = numero + "00" + id;
        }
        if (id > 0 && id<10 ) {
            numero = numero + "000" + id;
        }

        return numero;
    }
    
}
