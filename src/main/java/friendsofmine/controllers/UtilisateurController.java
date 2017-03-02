package friendsofmine.controllers;

import friendsofmine.Bootstrap;
import friendsofmine.domain.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Moi on 01/03/2017.
 */
@Controller
public class UtilisateurController {
    Bootstrap bootstrap;

    @Autowired
    public UtilisateurController(Bootstrap bootstrap){
        this.bootstrap = bootstrap;
    }

    @RequestMapping("/utilisateurs")
    List<Utilisateur> list() {
        return bootstrap.getUtilisateurs();
    }
}
