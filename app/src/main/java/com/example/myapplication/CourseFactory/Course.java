package com.example.myapplication.CourseFactory;

public abstract class Course implements Comparable<Course>{
    public int courseCode; // 2100
    public String suffix;
    public String name; //Code,Name,Term,Career,Unit,Mode,Link
    public String term;
    public String career;
    public int unit;
    public String mode;
    public String link;

    public abstract String toFullCourseCode();
    public int compareTo(Course course){
        return Integer.compare(this.courseCode, course.courseCode);
    }
}