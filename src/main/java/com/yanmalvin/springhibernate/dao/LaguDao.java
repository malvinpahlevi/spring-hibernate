/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yanmalvin.springhibernate.dao;

import com.yanmalvin.springhibernate.model.Lagu;
import java.util.List;

/**
 *
 * @author FOLIO 1040 G3
 */
public interface LaguDao {
    
    public List<Lagu> getLagus();
    public Lagu getLagu(Integer id);
    public Lagu saveLagu(Lagu lagu);
    public Lagu updateLagu(Lagu lagu);
    public Lagu deleteLagu(Lagu lagu);
}
