package models;

public class Pavillon {
    
    private int id;
    private int numero;
    private int nombreEtage;
    private int etat;
    private Chambre[] chambres;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNombreEtage() {
        return this.nombreEtage;
    }

    public void setNombreEtage(int nombreEtage) {
        this.nombreEtage = nombreEtage;
    }

    public int getEtat() {
        return this.etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
    public void setChambres(Chambre[] chambres) {
        this.chambres = chambres;
    }
    
    public Chambre[] getChambres() {
        return this.chambres;
    }

    public void addChambre(Chambre chambre) {
        this.chambres[this.chambres.length] = chambre;
    }

    public void removeChambre(Chambre chambre) {

        Chambre[] array = new Chambre[this.chambres.length -1];
        int k = 0;
        for (Chambre element : this.chambres) {
            if (element != chambre) {
                array[k] = element;
                k++;
            }
        }

        this.chambres = array;
    }

}
