package Q5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lecturer name:- ");
        String lecturerName = input.next();
        System.out.print("Enter the teaching course:- ");
        String courseTeaching = input.next();

        Lecturer lecturer = new Lecturer(lecturerName , courseTeaching);

        System.out.print("Enter the course name:- ");
        String courseName = input.next();
        System.out.print("Enter the course code:- ");
        String courseCode= input.next();

        Course course = new Course(courseName,courseCode, lecturer);

        System.out.print("Enter the student name:- ");
        String studentName = input.next();
        System.out.print("Enter the degree name:- ");
        String degreeName= input.next();

        Student student = new Student(studentName , degreeName , course.getCourseName());


        System.out.println("=== Course Registration System ===");
        System.out.println("\nCourse Information:");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Lecturer: " + course.getLecturer().getLecturerName());

        System.out.println("\nStudent Information:");
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Degree Program: " + student.getDegreeName());
        System.out.println("Registered Course: " + student.getCourseFollowing());

        System.out.println("\nLecturer Information:");
        System.out.println("Lecturer Name: " + lecturer.getLecturerName());
        System.out.println("Teaching Course: " + lecturer.getCourseTeaching());
    }
}

