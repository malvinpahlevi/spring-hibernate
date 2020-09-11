/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yanmalvin.springhibernate.dao;

import com.yanmalvin.springhibernate.model.Lagu;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author FOLIO 1040 G3
 */
@Repository
public class LaguDaoImpl implements LaguDao{

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public List<Lagu> getLagus() {
        return sessionFactory.getCurrentSession().createQuery("select 1 from lagu 1").list();
    }

    @Override
    public Lagu getLagu(Integer id) {
        return (Lagu) sessionFactory.getCurrentSession().get(Lagu.class, id);
    }

    @Override
    public Lagu saveLagu(Lagu lagu) {
        sessionFactory.getCurrentSession().save(lagu);
        return lagu;
    }

    @Override
    public Lagu updateLagu(Lagu lagu) {
        sessionFactory.getCurrentSession().update(lagu);
        return lagu;
    }

    @Override
    public Lagu deleteLagu(Lagu lagu) {
        sessionFactory.getCurrentSession().delete(lagu);
        return lagu;
    }
    
}
