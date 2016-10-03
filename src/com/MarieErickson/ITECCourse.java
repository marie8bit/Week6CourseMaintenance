package com.MarieErickson;

import java.util.ArrayList;
import java.util.Objects;

/**
 Modify ITECCourseManager so that it adds all of the ITECCourse objects are stored in an
 ArrayList<ITECCourse>.
 Add a method to ITECCourse that returns the number of free spaces in the class.
 Back in ITECCourseManager, loop over all of the ITECCourse objects and print the name of
 course and the number of free spaces in each.
 */
public class ITECCourse
{
    private int maxStudents;
    private String name;
    private String classroom;
    private int code;
    private ArrayList<String> students;
    //get set methods for class properties
    public int getMaxStudents(){return maxStudents;}
    public  void setMaxStudents(int maxStudents){this.maxStudents = maxStudents;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public String getClassroom() {return classroom;}
    public void setClassroom(String classroom) {this.classroom = classroom;}
    public int getCode(){return code;}
    public void setCode(int code){this.code = code;}

    //constuctor without classroom
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents) {
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
        this.classroom = "Not Identified";
    }
        //constructor with all properties
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents, String classroom){
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
        this.classroom = classroom;
    }
    //add student method that checks max number of students before enrolling a student into a course
    public void addStudent(String studentName){
        if(this.students.size()<maxStudents)
        {
            this.students.add(studentName);
        }
        else{
            System.out.println(this.name+" is full");
            System.out.println(studentName+ " not enrolled in "+this.name);
        }
    }
    //method to print out information about sender object
    public void writeCourseInfo(){
            System.out.println("Course Name: " + this.name);
            System.out.println("Course Code: " + this.code);
            System.out.println("Course Classroom: " + this.classroom);
            System.out.println("Students enrolled:");
            for (String student : this.students) {
                System.out.println(student);
            }
            System.out.println("There are " + getNumberOfStudents() +
                    " students enrolled");
            System.out.println("The max number of students for this course is "
                    + this.maxStudents);
    }
    //returns value for sender course's number of enrolled students
    int getNumberOfStudents(){
        return this.students.size();
    }
    //calculate available seating for course that called the method
    public int getFreeSeats(){
        int freeSeats = this.getMaxStudents()-this.getNumberOfStudents();
        return freeSeats;
    }
}
