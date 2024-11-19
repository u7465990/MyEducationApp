package com.example.myapplication.Users;

public class Users {
    String name;
    String password;

    public Users(String name, String password){
        this.name= name;
        this.password = password;
    }

    public Users(String[] users){
        this.name= users[0];
        this.password = users[1];
    }
    
    public boolean check(String mName, String mPassword){
        return (mName.equals(mName)&&mPassword.equals(mPassword));
    }
    public boolean check(String mName){
        return (mName.equals(mName));
    }

    public String toString(){
        return this.name+","+this.password;
    }

    
}
