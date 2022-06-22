package models;

public class Chambre {

    private int id;
    private String numero;
    private String numeroEtage;
    private String type;
    private String etat;
    private Pavillon pavillon;
    private Etudiant[] etudiants;

    public int getId() {
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

    public String getNumeroEtage() {
        return this.numeroEtage;
    }

    public void setNumeroEtage(String numeroEtage) {
        this.numeroEtage = numeroEtage;
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
    }

    public Etudiant[] getEtudiants() {
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
    }
    
}
