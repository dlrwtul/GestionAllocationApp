package models;

public class Chambre {

    private int id;
    private String numero;
    private boolean etat = true;
    private TypeChambre type;
    private TypeEtage etage;
    private Pavillon pavillon;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public TypeChambre getType() {
        return type;
    }
    public void setType(TypeChambre type) {
        this.type = type;
    }
    public TypeEtage getEtage() {
        return etage;
    }
    public void setEtage(TypeEtage etage) {
        this.etage = etage;
    }
    public Pavillon getPavillon() {
        return pavillon;
    }
    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }
    public boolean isEtat() {
        return etat;
    }
    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    //private Etudiant[] etudiants;

    /* public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEtat() {
        return this.etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Pavillon getPavillon() {
        return this.pavillon;
    }

    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    } */

    /* public Etudiant[] getEtudiants() {
        return this.etudiants;
    }

    public void addEtudiant(Etudiant etudiant) {
        this.etudiants[this.etudiants.length] = etudiant;
    }

    public void removeEtudiant(Etudiant etudiant) {

        Etudiant[] array = new Etudiant[this.etudiants.length -1];
        int k = 0;
        for (Etudiant element : this.etudiants) {
            if (element != etudiant) {
                array[k] = element;
                k++;
            }
        }

        this.etudiants = array;
    } */
    
}
