package com.example.myapplication.CourseFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public static String[][] courseData = readFile("java/com/example/myapplication/assets/courses_update.txt");

    public static String[][] readFile(String path){
        List<String[]> tempResult = new ArrayList<>();
        String[][] result = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String lineData;
            while ((lineData = br.readLine()) != null) {
                String[] stArray = lineData.split("\t");
                tempResult.add(stArray);
            }

            result = tempResult.toArray(new String[tempResult.size()][tempResult.get(0).length]);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
