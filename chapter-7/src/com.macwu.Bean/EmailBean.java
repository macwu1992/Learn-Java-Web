package com.macwu.Bean;

import java.io.Serializable;
import java.util.regex.*;

class EmailBean implements Serializable {
    private String email;

    public EmailBean(){}

    public EmailBean(String email){
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
        Pattern pattern = Pattern.compile("[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }else{
            return false;
        }
    }

}