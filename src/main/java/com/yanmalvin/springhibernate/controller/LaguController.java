/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yanmalvin.springhibernate.controller;

import com.yanmalvin.springhibernate.model.Lagu;
import com.yanmalvin.springhibernate.service.LaguService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import com.agung.springhibernatemaven.exception.NotFoundException;

/**
 *
 * @author FOLIO 1040 G3
 */
@Controller
public class LaguController {
    
    @Autowired
    LaguService laguService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("lagus", laguService.getLagus());
        
        return "index";        
    }
    
    @RequestMapping(value = "tambah", method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("lagu", new Lagu());
        return "tambah";
    }
    
    @RequestMapping(value = "tambah", method = RequestMethod.POST)
    public String adding(@ModelAttribute("lagu") Lagu lagu){
        laguService.saveLagu(lagu);
        return "redirect:/";
    }
    
    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    public String edit(Model model,@PathVariable("id") Integer id){
        Lagu lagu = laguService.getLagu(id);
        if(lagu==null){
            throw new NotFoundException();
        }
        model.addAttribute("lagu", lagu);
        return "edit";
    }
    
    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public String editing(@ModelAttribute("lagu") Lagu lagu){
        laguService.update(lagu);
        return "redirect:/";
    }
    
    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public String deleting(@PathVariable("id") Integer id){
        Lagu lagu = laguService.getLagu(id);
        if(lagu==null){
            throw new NotFoundException();
        }
        laguService.deleteLagu(lagu);
        return "redirect:/";
    }
    
}
