/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yanmalvin.springhibernate.service;

import java.util.List;
import com.yanmalvin.springhibernate.model.Lagu;


/**
 *
 * @author FOLIO 1040 G3
 */
public interface LaguService {
    public List<Lagu> getLagus();
    public Lagu getLagu(Integer id);
    public Lagu saveLagu(Lagu lagu);
    public Lagu update(Lagu lagu);
    public Lagu deleteLagu(Lagu lagu);
}
