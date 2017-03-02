package friendsofmine.service;

import friendsofmine.domain.Activite;
import friendsofmine.domain.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Moi on 01/03/2017.
 */
@Service
public class InitialisationService {
    List<Utilisateur> utilisateurs = new ArrayList<>();
    List<Activite> activites = new ArrayList<>();

    public void initDonnees(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 1988);
    }
}
