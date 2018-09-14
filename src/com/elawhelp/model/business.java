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
public class business {
    @Id
    private int b_user_id;
    private String b_name;
    private String pass;
    private String product_type;
    private String issue_id;
    private int contact;
    private String email;

    public business() {
    }

    public business(int b_user_id, String b_name, String pass, String product_type, int contact, String email) {
        this.b_user_id = b_user_id;
        this.b_name = b_name;
        this.pass = pass;
        this.product_type = product_type;
        this.contact = contact;
        this.email = email;
    }

    public int getB_user_id() {
        return b_user_id;
    }

    public void setB_user_id(int b_user_id) {
        this.b_user_id = b_user_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getIssue_id() {
        return issue_id;
    }

    public void setIssue_id(String issue_id) {
        this.issue_id = issue_id;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
