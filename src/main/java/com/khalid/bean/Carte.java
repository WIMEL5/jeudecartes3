package com.khalid.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carte")
public class Carte {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="CARTE_ID")
    private Integer id;
    
    @Column(name="CARTE_NAME")
    private String libelle;


    public Integer getId() {
        return id;
    }

    public void setId(final Integer pId) {
        id = pId;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(final String pLibelle) {
        libelle = pLibelle;
    }

}