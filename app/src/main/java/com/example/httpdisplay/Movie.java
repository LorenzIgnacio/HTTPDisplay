package com.example.httpdisplay;

public class Movie {
    public String status;
    public String username;
    public String subject;

    public int docu_id;
    public int reference_number;
    public int final_action_date;

    public Movie() {

    }

    public Movie(String status, String username, String subject,
                 int docu_id, int reference_number, int final_action_date) {

        this.status = status;
        this.username = username;
        this.subject = subject;

        this.docu_id = docu_id;
        this.reference_number = reference_number;
        this.final_action_date = final_action_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getDocu_id() {
        return docu_id;
    }

    public void setDocu_id(int docu_id) {
        this.docu_id = docu_id;
    }

    public int getReference_number() {
        return reference_number;
    }

    public void setReference_number(int reference_number) {
        this.reference_number = reference_number;
    }

    public int getFinal_action_date() {
        return final_action_date;
    }

    public void setFinal_action_date(int final_action_date) {
        this.final_action_date = final_action_date;
    }
}

