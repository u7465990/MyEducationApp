package com.example.myapplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadUsers {

    public static List<String[]> read(String file) {
        
        InputStream input = null;
        String inString ="";
        List<String[]> result = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((inString = reader.readLine()) != null) {
                result.add(inString.split(","));
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }


    public static void addStrings(String file,String newLine){
        String inString ="";
        List<String> toCopy = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((inString = reader.readLine()) != null){
                toCopy.add(inString);
            }
            reader.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (int v=0;v<toCopy.size();v++){
                writer.append(toCopy.get(v));
                writer.newLine();
            }
            writer.write(newLine);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
