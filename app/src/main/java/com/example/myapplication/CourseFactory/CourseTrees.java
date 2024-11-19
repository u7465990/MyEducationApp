package com.example.myapplication.CourseFactory;

import com.example.myapplication.Tree.BST;

import java.util.ArrayList;
import java.util.List;

public class CourseTrees {
    public static List<BST<Course>> courseTrees = new ArrayList<>();

    public static void createCourseTrees() {
        for (CourseType type : CourseType.values()) {
            String typeString = type.name();
            BST<Course> tree = new BST<Course>();
            tree.courseType = type;
            for (int i = 0; i < Reader.courseData.length; i++) {
                if (Reader.courseData[i][0].substring(0,4).equals(typeString)) {
                    Course course = CourseCreater.createCourse(
                            type,
                            Reader.courseData[i][0],
                            Reader.courseData[i][1],
                            Reader.courseData[i][2],
                            Reader.courseData[i][3],
                            Reader.courseData[i][4],
                            Reader.courseData[i][5],
                            Reader.courseData[i][6]);
                    tree.insert(course);
                }
            }
            courseTrees.add(tree);
        }
    }
}
