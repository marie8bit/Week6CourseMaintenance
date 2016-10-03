package com.MarieErickson;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// Add course data
        ArrayList<ITECCourse> courseMaster = new ArrayList<>();
        ITECCourse Java = new ITECCourse("Java", 2545, 24);
        Java.addStudent("Marie");
        Java.addStudent("Ben");
        Java.addStudent("Pat");
        Java.addStudent("Fred");
        Java.addStudent("Kara");
        Java.addStudent("Nnamdi");
        courseMaster.add(Java);

        ITECCourse CSharp = new ITECCourse("C#", 2401, 24, "T3010");
        CSharp.addStudent("Marie");
        CSharp.addStudent("Ben");
        CSharp.addStudent("Andrew");
        CSharp.addStudent("Kara");
        CSharp.addStudent("Nnamdi");
        courseMaster.add(CSharp);

        ITECCourse SQL = new ITECCourse("SQL Server", 1460, 4, "T3030");
        SQL.addStudent("Marie");
        SQL.addStudent("Karen");
        SQL.addStudent("Seng");
        SQL.addStudent("Boris");
        SQL.addStudent("Momo");
        SQL.addStudent("Sonja");
        courseMaster.add(SQL);

        ITECCourse ITConcepts = new ITECCourse("Info Tech Concepts", 1100, 30, "T3050");
        ITConcepts.addStudent("Max");
        ITConcepts.addStudent("Nancy");
        ITConcepts.addStudent("Orson");
        courseMaster.add(ITConcepts);
        //print out user friendly information
        for(ITECCourse ob:courseMaster)
        {
            System.out.println(ob.getName()+ " has "+ob.getFreeSeats()+ " free spaces");
        }
        Java.writeCourseInfo();
        CSharp.writeCourseInfo();
        SQL.writeCourseInfo();
        ITConcepts.writeCourseInfo();

    }
}
