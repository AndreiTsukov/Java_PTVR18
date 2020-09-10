/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author pupil
 */
public class User implements Serializable{
    private String Fname; 
    private String Lname; 
    private String Email; 
    private String Login; 
    private String Password; 
    
    public User(){
        
    }
    
    public User(String Firstname, String Surname, String Email, String Login, String Password) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.Email = Email;
        this.Login = Login;
        this.Password = Password;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.Fname);
        hash = 37 * hash + Objects.hashCode(this.Lname);
        hash = 37 * hash + Objects.hashCode(this.Email);
        hash = 37 * hash + Objects.hashCode(this.Login);
        hash = 37 * hash + Objects.hashCode(this.Password);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.Fname, other.Fname)) {
            return false;
        }
        if (!Objects.equals(this.Lname, other.Lname)) {
            return false;
        }
        if (!Objects.equals(this.Email, other.Email)) {
            return false;
        }
        if (!Objects.equals(this.Login, other.Login)) {
            return false;
        }
        if (!Objects.equals(this.Password, other.Password)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return "User{" + "Fname=" + Fname + ", Lname=" + Lname + ", Email=" + Email + ", Login=" + Login + ", Password=" + Password + '}';
    }
}
