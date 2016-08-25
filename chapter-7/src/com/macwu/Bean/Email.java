package com.macwu.Bean;

import java.io.Serializable;
import java.util.regex.*;

public class Email implements Serializable {
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
        Pattern pattern = Pattern.compile("\\w+@\\w+.\\w{2,3}");
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

}