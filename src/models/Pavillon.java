package models;

public class Pavillon {
    
    private int id;
    private String numero;
    private int nombreEtage;
    private boolean etat = true ;
    //private Chambre[] chambres;

    public int getId() {
        return this.id;
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

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public int getNombreEtage() {
        return this.nombreEtage;
    }

    public void setNombreEtage(int nombreEtage) {
        this.nombreEtage = nombreEtage;
    }

    /* public void setChambres(Chambre[] chambres) {
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
    } */

    @Override
    public String toString() {
        String newLine = System.getProperty("line.separator");
        return "Pavillon" + id + newLine +"id          :" + id + newLine +"numero      :" + numero + newLine + "nombreEtage :" + nombreEtage;
    }

}
