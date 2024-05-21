package controllers;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import models.chambre;
import models.reservation;
import models.user;

public class Control {
    private Map<Integer, user> user_array = null;
    private Map<Integer, chambre> chambre_array = null;
    private Map<Integer, reservation> reservation_array = null;
    
    public Control() {
        user_array = new HashMap<Integer, user>();
        chambre_array = new HashMap<Integer, chambre>();
        reservation_array = new HashMap<Integer, reservation>();
        
        user u1 = new user(1, "admin", "admin", "admin", "admin", "admin");
        
        chambre c1 = new chambre(1, "chambre 01", "1");
        chambre c2 = new chambre(1, "chambre 02", "1");
        
        this.ajouter_user(u1);
        this.ajouter_chambre(c1);
    }
    
    public Map<Integer, user> list_users() {
        return user_array;
    }
    
    public user getUserByLoginName(String user_login) {
        for (int i = 0; i < user_array.size(); i++) {
            if ( user_array.get(i).getUser_login().equals(user_login) ) {
                return user_array.get(i);
            }
        }
        
        return null;
    }
    
    public user getUserByUserId(int user_id) {
        for (int i = 0; i < user_array.size(); i++) {
            if ( user_array.get(i).getUser_id() == user_id ) {
                return user_array.get(i);
            }
        }
        
        return null;
    }
    
    public void ajouter_user(user new_user) {
        user_array.put(user_array.size(), new_user);
    }
    
    public void edit_user(user new_user) {
        int user_index = this.user_index(new_user.getUser_id());
        
        user_array.replace(user_index, new_user);
    }
    
    public void delete_user(user new_user) {
        int user_index = this.user_index(new_user.getUser_id());
        
        if( user_index != -1 )
            user_array.remove(user_index);
    }
    
    public void delete_user(int user_id) {
        int user_index = this.user_index(user_id);
        
        if( user_index != -1 )
            user_array.remove(user_index);
    }
    
    public boolean user_exists(int user_id) {
        return (this.user_index(user_id) != -1);
    }
    
    public boolean user_exists_by_login(String user_login, String user_password) {
        for (int i = 0; i < user_array.size(); i++) {
            if ( user_array.get(i).getUser_login().equals(user_login) && user_array.get(i).getUser_password().equals(user_password) ) {
                return true;
            }
        }
        
        return false;
    }
    
    public int user_index(int user_id) {
        
        for (int i = 0; i < user_array.size(); i++) {
            if (user_array.get(i).getUser_id() == user_id) {
                return i;
            }
        }
        
        return -1;
    }
    
    
    
    
    
    
    
    
    public Map<Integer, chambre> list_chambre() {
        return chambre_array;
    }
    
    public chambre getchambreBychambreId(int chambre_id) {
        for (int i = 0; i < chambre_array.size(); i++) {
            if ( chambre_array.get(i).getChambre_id() == chambre_id ) {
                return chambre_array.get(i);
            }
        }
        
        return null;
    }
    
    public void ajouter_chambre(chambre new_chambre) {
        chambre_array.put(chambre_array.size(), new_chambre);
    }
    
    public void edit_chambre(chambre new_chambre) {
        int chambre_index = this.chambre_index(new_chambre.getChambre_id());
        
        chambre_array.replace(chambre_index, new_chambre);
    }
    
    public void delete_chambre(chambre new_chambre) {
        int chambre_index = this.chambre_index(new_chambre.getChambre_id());
        
        if( chambre_index != -1 )
            chambre_array.remove(chambre_index);
    }
    
    public void delete_chambre(int chambre_id) {
        int chambre_index = this.chambre_index(chambre_id);
        
        if( chambre_index != -1 )
            chambre_array.remove(chambre_index);
    }
    
    public boolean chambre_exists(int chambre_id) {
        return (this.chambre_index(chambre_id) != -1);
    }
    
    public int chambre_index(int chambre_id) {
        
        for (int i = 0; i < chambre_array.size(); i++) {
            if (chambre_array.get(i).getChambre_id() == chambre_id) {
                return i;
            }
        }
        
        return -1;
    }
    
    
    
    
    
    
    
    public Map<Integer, reservation> list_reservation() {
        return reservation_array;
    }
    
    public reservation getreservationByreservationId(int reservation_id) {
        for (int i = 0; i < reservation_array.size(); i++) {
            if ( reservation_array.get(i).getReservation_id() == reservation_id ) {
                return reservation_array.get(i);
            }
        }
        
        return null;
    }
    
    public void ajouter_reservation(reservation new_reservation) {
        reservation_array.put(reservation_array.size(), new_reservation);
    }
    
    public boolean check_available_date(chambre ele, String date) {
        for (int i = 0; i < reservation_array.size(); i++) {
            if (reservation_array.get(i).getReservation_date().equals(date) && 
                    ele.getChambre_id() == reservation_array.get(i).getChambre_id().getChambre_id()) {
                return false;
            }
        }
        
        return true;
    }
    
    public void edit_reservation(reservation new_reservation) {
        int reservation_index = this.reservation_index(new_reservation.getReservation_id());
        
        reservation_array.replace(reservation_index, new_reservation);
    }
    
    public void delete_reservation(reservation new_reservation) {
        int reservation_index = this.reservation_index(new_reservation.getReservation_id());
        
        if( reservation_index != -1 )
            reservation_array.remove(reservation_index);
    }
    
    public void delete_reservation(int reservation_id) {
        int reservation_index = this.reservation_index(reservation_id);
        
        if( reservation_index != -1 )
            reservation_array.remove(reservation_index);
    }
    
    public boolean reservation_exists(int reservation_id) {
        return (this.reservation_index(reservation_id) != -1);
    }
    
    public int reservation_index(int reservation_id) {
        
        for (int i = 0; i < reservation_array.size(); i++) {
            if (reservation_array.get(i).getReservation_id() == reservation_id) {
                return i;
            }
        }
        
        return -1;
    }
}
