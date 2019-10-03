package com.khalid.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.khalid.bean.Carte;
import com.khalid.services.IServiceListeCartes;

@Controller
@RequestMapping(value="/afficherListeCartes")
public class AfficherListeCartesController {

    @Autowired
    private IServiceListeCartes service;

    @RequestMapping(method = RequestMethod.GET)
    public String afficher(ModelMap pModel) {
        final List<Carte> lListeCartes = service.rechercherCartes();
        //Mélanger la liste avant le retour de la requete
        Collections.shuffle(lListeCartes);
        pModel.addAttribute("listeCartes", lListeCartes);
        return "listeCartes";
    }
}