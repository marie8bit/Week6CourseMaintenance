package com.MarieErickson;

import java.util.ArrayList;

/**
 * Created by yd7581ku on 9/27/2016.
 */
public class ITECCourse
{



    private int code;
    private ArrayList<String> students;
    private int maxStudents;
    private String classroom;
    public int getMaxStudents(){
        return maxStudents;
    }
    public  void setMaxStudents(int maxStudents){
        this.maxStudents = maxStudents;
    }
    public String getName()
    {
        return name;
    }
    public void setClassroom(String classroom) {this.classroom = classroom;}
    public String getClassroom() {return classroom;}

    public void setName(String name)
    {
        this.name = name;
    }

    private String name;

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }
    //constructor
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents, String classroom){
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
        this.classroom = classroom;

    }
    public void addStudent(String studentName){
        if(students.size()<maxStudents)
        {
            students.add(studentName);
        }
        else{
            System.out.println(this.name+" is full");
            System.out.println(studentName+ " not enrolled in "+this.name);
        }
    }
    public void writeCourseInfo(){
        System.out.println("Course Name: "+ this.name);
        System.out.println("Course Code: "+ this.code);
        System.out.println("Course Classroom: "+ this.classroom);
        System.out.println("Students enrolled:");
        for (String student: this.students){
            System.out.println(student);
        }
        System.out.println("There are "+getNumberOfStudents()+
                " students enrolled");
        System.out.println("The max number of student for this course is "
                +this.maxStudents);

    }
    int getNumberOfStudents(){
        return this.students.size();
    }

}
