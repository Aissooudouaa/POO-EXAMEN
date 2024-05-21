package models;

public class user {
    private int user_id;
    private String user_login;
    private String user_nom;
    private String user_prenom;
    private String user_password;
    private String user_type;
    
    public user(user initial) {
        this.user_id = initial.user_id;
        this.user_login = initial.user_login;
        this.user_nom = initial.user_nom;
        this.user_prenom = initial.user_prenom;
        this.user_password = initial.user_password;
        this.user_type = initial.user_type;
    }
    
    public user(int user_id, String user_login, String user_nom, String user_prenom, String user_password, String user_type) {
        this.user_id = user_id;
        this.user_login = user_login;
        this.user_nom = user_nom;
        this.user_prenom = user_prenom;
        this.user_password = user_password;
        this.user_type = user_type;
    }
    
    public user() {
        
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_login() {
        return user_login;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    public String getUser_nom() {
        return user_nom;
    }

    public void setUser_nom(String user_nom) {
        this.user_nom = user_nom;
    }

    public String getUser_prenom() {
        return user_prenom;
    }

    public void setUser_prenom(String user_prenom) {
        this.user_prenom = user_prenom;
    }

    public String getUserFullName() {
        return user_nom;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }
}
