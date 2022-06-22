package models;
import java.util.Date;

public class Etudiant extends Personne {

    private String matricule;
    private String email;
    private String telephone;
    private Date dateNaissance;
    private String bourse;
    private String adresse;
    private Type[] types;
    private Chambre chambre;
    
    public String getMatricule() {
        return this.matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getDateNaissance() {
        return this.dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getBourse() {
        return this.bourse;
    }

    public void setBourse(String bourse) {
        this.bourse = bourse;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Type[] getTypes() {
        return this.types;
    }

    public void addType(Type type) {
        this.types[this.types.length] = type;
    }

    public void removeType(Type type) {

        Type[] array = new Type[this.types.length -1];
        int k = 0;
        for (Type element : this.types) {
            if (element != type) {
                array[k] = element;
                k++;
            }
        }

        this.types = array;
    }

    public Chambre getChambre() {
        return this.chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

}

   
