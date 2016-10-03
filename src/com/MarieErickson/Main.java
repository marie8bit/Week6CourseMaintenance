package com.MarieErickson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITECCourse Java = new ITECCourse("Java", 2545, 24, "T3050");
        Java.addStudent("Marie");
        Java.addStudent("Ben");
        Java.addStudent("Pat");
        Java.addStudent("Fred");
        Java.addStudent("Kara");
        Java.addStudent("Nnamdi");

        ITECCourse CSharp = new ITECCourse("C#", 2401, 24, "T3010");
        CSharp.addStudent("Marie");
        CSharp.addStudent("Ben");
        CSharp.addStudent("Andrew");
        CSharp.addStudent("Kara");
        CSharp.addStudent("Nnamdi");

        ITECCourse SQL = new ITECCourse("SQL Server", 1460, 4, "T3030");
        SQL.addStudent("Marie");
        SQL.addStudent("Karen");
        SQL.addStudent("Seng");
        SQL.addStudent("Boris");
        SQL.addStudent("Momo");
        SQL.addStudent("Sonja");
        SQL.writeCourseInfo();
        ITECCourse ITConcepts = new ITECCourse("Info Tech Concepts", 1100, 30, "T3050");
        ITConcepts.addStudent("Max");
        ITConcepts.addStudent("Nancy");
        ITConcepts.addStudent("Orson");
        Java.writeCourseInfo();CSharp.writeCourseInfo();ITConcepts.writeCourseInfo();
    }
}
