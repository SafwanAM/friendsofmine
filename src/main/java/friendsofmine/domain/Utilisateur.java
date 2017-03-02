package friendsofmine.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by Moi on 01/03/2017.
 */
public class Utilisateur {
    @NotNull
    @Size(min = 1)
    private String nom;
    @NotNull
    @Size(min = 1)
    private String prenom;
    @NotNull
    @Pattern(regexp = "(.*)@(.*)")
    private String mail;
    @NotNull
    @Pattern(regexp = "M|F")
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
