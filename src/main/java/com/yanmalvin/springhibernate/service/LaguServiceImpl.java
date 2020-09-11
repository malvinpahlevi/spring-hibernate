/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yanmalvin.springhibernate.service;

import com.yanmalvin.springhibernate.dao.LaguDao;
import com.yanmalvin.springhibernate.model.Lagu;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author FOLIO 1040 G3
 */
@Service
@Transactional
public class LaguServiceImpl implements LaguService {

    @Autowired
    LaguDao laguDao;
    
    @Override
    public List<Lagu> getLagus() {
        return laguDao.getLagus();
    }

    @Override
    public Lagu getLagu(Integer id) {
        return laguDao.getLagu(id);
    }

    @Override
    public Lagu saveLagu(Lagu lagu) {
        return laguDao.saveLagu(lagu);
    }

    @Override
    public Lagu update(Lagu lagu) {
        return laguDao.updateLagu(lagu);
    }

    @Override
    public Lagu deleteLagu(Lagu lagu) {
        return laguDao.deleteLagu(lagu);
    }
    
}
