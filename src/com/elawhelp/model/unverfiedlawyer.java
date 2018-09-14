/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elawhelp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Shuddho
 */
@Entity
public class unverfiedlawyer {
    @Id
    private int ul_user_id;
    private String ul_user_name;
    private String ul_name;
    private String pass;
    private String designation;
    private String foc;
    private String bar_id;

    public unverfiedlawyer() {
    }

    public unverfiedlawyer(int ul_user_id, String ul_user_name, String ul_name, String pass, String designation, String foc, String bar_id) {
        this.ul_user_id = ul_user_id;
        this.ul_user_name = ul_user_name;
        this.ul_name = ul_name;
        this.pass = pass;
        this.designation = designation;
        this.foc = foc;
        this.bar_id = bar_id;
    }

    public int getUl_user_id() {
        return ul_user_id;
    }

    public void setUl_user_id(int ul_user_id) {
        this.ul_user_id = ul_user_id;
    }

    public String getUl_user_name() {
        return ul_user_name;
    }

    public void setUl_user_name(String ul_user_name) {
        this.ul_user_name = ul_user_name;
    }

    public String getUl_name() {
        return ul_name;
    }

    public void setUl_name(String ul_name) {
        this.ul_name = ul_name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getFoc() {
        return foc;
    }

    public void setFoc(String foc) {
        this.foc = foc;
    }

    public String getBar_id() {
        return bar_id;
    }

    public void setBar_id(String bar_id) {
        this.bar_id = bar_id;
    }
    
    
}
