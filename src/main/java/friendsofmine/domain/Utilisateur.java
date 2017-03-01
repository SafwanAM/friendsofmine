package friendsofmine.domain;

import java.util.Date;

/**
 * Created by Moi on 01/03/2017.
 */
public class Utilisateur {
    private String nom;
    private String prenom;
    private String mail;
    private String sexe;
    private Date date;

    public Utilisateur(String nom, String prenom, String mail, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.sexe = sexe;
    }

    public Utilisateur(String nom, String prenom, String mail, String sexe, Date date) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.sexe = sexe;
        this.date = date;
    }
}
