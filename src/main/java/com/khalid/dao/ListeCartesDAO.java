package com.khalid.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.khalid.bean.Carte;

@Repository
public class ListeCartesDAO implements IListeCartesDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Carte> rechercherCartes() {
        final CriteriaBuilder lCriteriaBuilder = entityManager.getCriteriaBuilder();

        final CriteriaQuery<Carte> lCriteriaQuery = lCriteriaBuilder.createQuery(Carte.class);
        final Root<Carte> lRoot = lCriteriaQuery.from(Carte.class);
        lCriteriaQuery.select(lRoot);
        final TypedQuery<Carte> lTypedQuery = entityManager.createQuery(lCriteriaQuery);

        return lTypedQuery.getResultList();
    }
}