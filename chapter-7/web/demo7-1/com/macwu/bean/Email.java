package com.macwu.bean;

import java.util.regex.*;

class Email implements Serializable{
    private String email;

    public Email(){}

    public Email(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public boolean isEmail(){
        String email = this.getEmail();
        Pattern pattern = Pattern.complie("(//w.)+");
    }

}