package Exercise3;

import java.util.Scanner;

class Student{
    int studentID;
    String studentName;
    boolean maleGender;
    Subject subjects;
    
    Student(){
        studentID = 0;
        studentName = null;
        maleGender = true;
        subjects = new Subject();
    }
    public void setStudents(){
        System.out.print("Enter student ID and name");
        Scanner scanner = new Scanner(System.in);
        this.studentID = scanner.nextInt();
        this.studentName = scanner.next();
        System.out.println("Is he male? ");
        this.maleGender = scanner.nextBoolean();
        subjects.setSubject();
    }
    public String getName(){
        return studentName;
    }
    public int getID(){
        return studentID;
    }
    public float getTotalMarks(){
        return (subjects.marks1+subjects.marks2+subjects.marks3);
    }
}

class Subject{
    String subject1, subject2, subject3;
    float marks1, marks2, marks3;
    
    Subject(){
        subject1 = subject2 = subject3 = null;
        marks1 = marks2 = marks3 =0;
    }
    public void setSubject(){
        System.out.print("enter three subject name and marks : ");
        Scanner scanner = new Scanner(System.in);
        subject1 = scanner.next();
        marks1 = scanner.nextFloat();
        subject2 = scanner.next();
        marks2 = scanner.nextFloat();
        subject3 = scanner.next();
        marks3 = scanner.nextFloat();
    }
    
    public float getSubject1Marks(){
        return marks1;
    }
    public float getSubject2Marks(){
        return marks2;
    }
    public float getSubject3Marks(){
        return marks3;
    }
}

class ResultGenerator{
    public static void generateResult(Student student){
        String output = String.format("Student name is %s and ID is %d",student.getName(), student.getID());
        System.out.println(output);
        float totalMarks = student.getTotalMarks();
        System.out.println("total marks : "+totalMarks);
        float avgMarks = totalMarks/3;
        System.out.println("avg marks : "+avgMarks);
    }
}

public class StaticDemo{
    public static void main(String[] args){
        Student student = new Student();
        StaticDemo staticDemo = new StaticDemo();
        staticDemo.storeStudentData(student);
        ResultGenerator.generateResult(student);
    }
    void storeStudentData(Student student){
        student.setStudents();
    }
}