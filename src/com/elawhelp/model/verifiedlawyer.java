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
public class verifiedlawyer {
    @Id
    private int vl_user_id;
    private String vl_user_name;
    private String vl_name;
    private String pass;
    private String designation;
    private String foc;
    private String bar_id;

    public verifiedlawyer() {
    }

    public verifiedlawyer(int vl_user_id, String vl_user_name, String vl_name, String pass, String designation, String foc, String bar_id) {
        this.vl_user_id = vl_user_id;
        this.vl_user_name = vl_user_name;
        this.vl_name = vl_name;
        this.pass = pass;
        this.designation = designation;
        this.foc = foc;
        this.bar_id = bar_id;
    }

    public int getVl_user_id() {
        return vl_user_id;
    }

    public void setVl_user_id(int vl_user_id) {
        this.vl_user_id = vl_user_id;
    }

    public String getVl_user_name() {
        return vl_user_name;
    }

    public void setVl_user_name(String vl_user_name) {
        this.vl_user_name = vl_user_name;
    }

    public String getVl_name() {
        return vl_name;
    }

    public void setVl_name(String vl_name) {
        this.vl_name = vl_name;
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
