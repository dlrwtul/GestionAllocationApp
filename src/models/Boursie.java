package models;

public class Boursie extends Etudiant {
    
    private TypeBourse type;
    private Chambre chambre;

    public TypeBourse getType() {
        return type;
    }
    public void setType(TypeBourse type) {
        this.type = type;
    }
    public Chambre getChambre() {
        return chambre;
    }
    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

}
