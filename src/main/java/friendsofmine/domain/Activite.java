package friendsofmine.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Moi on 01/03/2017.
 */

public class Activite {
    @NotNull
    @Size(min = 1)
    private String titre;
    private String descriptif;

    public Activite(String titre, String descriptif) {
        this.titre = titre;
        this.descriptif = descriptif;
    }
}