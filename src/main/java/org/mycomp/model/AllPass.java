/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mycomp.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mmkamm
 */
public class AllPass {
    private List<Entity> allPasswordsList;

    public AllPass() {
        this.allPasswordsList = new ArrayList();
    }

    public List<Entity> getAllPasswordsList() {
        return allPasswordsList;
    }

    public void setAllPasswordsList(List<Entity> allPasswordsList) {
        this.allPasswordsList = allPasswordsList;
    }
    
    
}
