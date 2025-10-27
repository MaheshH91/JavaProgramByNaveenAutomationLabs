// Package name: all lowercase, hierarchical
package com.mahesh.namingconventions;

// Interface name: PascalCase, describes capability
interface Printable {
    void printDetails();
}

// Class name: PascalCase, noun
public class Student implements Printable {

    // Constants: ALL_CAPS with underscores
    private static final int MAX_MARKS = 100;

    // Variables: camelCase
    private String studentName;
    private int rollNumber;
    private int marks;

    // Constructor: same name as class
    public Student(String studentName, int rollNumber, int marks) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method name: camelCase, verb phrase
    public boolean isPassed() {
        return marks >= 35;
    }

    // Interface method implementation
    @Override
    public void printDetails() {
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Passed: " + isPassed());
    }

    // Main method: entry point
    public static void main(String[] args) {
        Student student = new Student("Mahesh", 101, 90);
        student.printDetails();
    }
}
