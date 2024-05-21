package models;

public class chambre {
    private int chambre_id;
    private String chambre_nom;
    private String chambre_nbr_personne;
    
    public chambre(chambre initial) {
        this.chambre_id = initial.chambre_id;
        this.chambre_nom = initial.chambre_nom;
        this.chambre_nbr_personne = initial.chambre_nbr_personne;
    }
    
    public chambre(int chambre_id, String chambre_nom, String chambre_nbr_personne) {
        this.chambre_id = chambre_id;
        this.chambre_nom = chambre_nom;
        this.chambre_nbr_personne = chambre_nbr_personne;
    }
    
    public chambre() {
        
    }

    public int getChambre_id() {
        return chambre_id;
    }

    public void setChambre_id(int chambre_id) {
        this.chambre_id = chambre_id;
    }

    public String getChambre_nom() {
        return chambre_nom;
    }

    public void setChambre_nom(String chambre_nom) {
        this.chambre_nom = chambre_nom;
    }

    public String getChambre_nbr_personne() {
        return chambre_nbr_personne;
    }

    public void setChambre_nbr_personne(String chambre_nbr_personne) {
        this.chambre_nbr_personne = chambre_nbr_personne;
    }
}
