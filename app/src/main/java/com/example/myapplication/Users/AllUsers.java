package com.example.myapplication.Users;

import com.example.myapplication.ReadUsers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AllUsers implements Serializable {
    List<Users> myUsers = new ArrayList<>();

    public AllUsers(List<String[]> list){
        for (int i=0;i<list.size();i++){
            myUsers.add(new Users(list.get(i)));
        }
    }
    public AllUsers(String[][] list){
        for (int i=0;i<list.length;i++){
            myUsers.add(new Users(list[i]));
        }
    }

    public List<Users> getMyUsers() {
        return myUsers;
    }

    public boolean check(String name,String password){
        for(int i =0;i<myUsers.size();i++){
            if(myUsers.get(i).check(name,password)){
                return true;
            }
        }
        return false;
    }
    public boolean check(String name){
        for(int i =0;i<myUsers.size();i++){
            if(myUsers.get(i).check(name)){
                return false;
            }
        }
        return true;
    }
    public void add(String name,String password,String file){
        myUsers.add(new Users(name,password));
        ReadUsers.addStrings(file,new Users(name,password).toString());
    }


}
