package com.khalid.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.khalid.bean.Carte;
import com.khalid.dao.IListeCartesDAO;

@Service
public class ServiceListeCartes implements IServiceListeCartes {

    @Autowired
    private IListeCartesDAO dao;

    @Transactional(readOnly=true)
    public List<Carte> rechercherCartes() {
        return dao.rechercherCartes();
    }
}