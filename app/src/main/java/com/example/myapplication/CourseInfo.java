package com.example.myapplication;

/**
 * course information
 */
public class CourseInfo {
    private String mCourseName;
    private String Skill;
    private String Specialization;
    private String CourseLink;

    public String getCourseName() {
        return mCourseName;
    }

    public void setCourseName(String name) {
        this.mCourseName = name;
    }


    public String getSkill() {
        return Skill;
    }

    public void setSkill(String skill) {
        Skill = skill;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public String getCourseLink() {
        return CourseLink;
    }

    public void setCourseLink(String courseLink) {
        CourseLink = courseLink;
    }
}

