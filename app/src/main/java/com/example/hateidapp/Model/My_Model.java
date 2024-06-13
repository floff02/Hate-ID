package com.example.hateidapp.Model;

public class My_Model {
    String email,retypepassword,password;

    public My_Model(String email, String retypepassword, String password) {
        this.email = email;
        this.retypepassword = retypepassword;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return retypepassword;
    }

    public void setName(String name) {
        this.retypepassword = retypepassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
