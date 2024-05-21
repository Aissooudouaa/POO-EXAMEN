package models;

public class reservation {
    private int reservation_id;
    private user user_id;
    private chambre chambre_id;
    private String reservation_date;
    private String reservation_etat;
    
    public reservation(reservation initial) {
        this.reservation_id = initial.reservation_id;
        this.user_id = initial.user_id;
        this.chambre_id = initial.chambre_id;
        this.reservation_date = initial.reservation_date;
        this.reservation_etat = initial.reservation_etat;
    }
    
    public reservation(int reservation_id, user user_id, chambre chambre_id, String reservation_date, String reservation_etat) {
        this.reservation_id = reservation_id;
        this.user_id = user_id;
        this.chambre_id = chambre_id;
        this.reservation_date = reservation_date;
        this.reservation_etat = reservation_etat;
    }
    
    public reservation() {
        
    }

    public int getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    public user getUser_id() {
        return user_id;
    }

    public void setUser_id(user user_id) {
        this.user_id = user_id;
    }

    public chambre getChambre_id() {
        return chambre_id;
    }

    public void setChambre_id(chambre chambre_id) {
        this.chambre_id = chambre_id;
    }

    public String getReservation_date() {
        return reservation_date;
    }

    public void setReservation_date(String reservation_date) {
        this.reservation_date = reservation_date;
    }

    public String getReservation_etat() {
        return reservation_etat;
    }

    public void setReservation_etat(String reservation_etat) {
        this.reservation_etat = reservation_etat;
    }
}
