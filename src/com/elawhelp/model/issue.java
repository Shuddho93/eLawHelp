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
public class issue {
    @Id
    private int issue_id;
    private String issue_cat;
    private String issue_desc;

    public issue() {
    }

    public issue(int issue_id, String issue_cat, String issue_desc) {
        this.issue_id = issue_id;
        this.issue_cat = issue_cat;
        this.issue_desc = issue_desc;
    }

    public issue(int issue_id, String issue_cat) {
        this.issue_id = issue_id;
        this.issue_cat = issue_cat;
    }
    
    public int getIssue_id() {
        return issue_id;
    }

    public void setIssue_id(int issue_id) {
        this.issue_id = issue_id;
    }

    public String getIssue_cat() {
        return issue_cat;
    }

    public void setIssue_cat(String issue_cat) {
        this.issue_cat = issue_cat;
    }

    public String getIssue_desc() {
        return issue_desc;
    }

    public void setIssue_desc(String issue_desc) {
        this.issue_desc = issue_desc;
    }
    
    
}
