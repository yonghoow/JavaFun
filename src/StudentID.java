//package src;

import java.util.Scanner;

public class StudentID {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //take student's name as a string
        System.out.print("Enter Student's name: ");
        String name = sc.nextLine();
        //take university as a string
        System.out.print("Enter Name of the University: ");
        String uni = sc.nextLine();
        //take student's age as an integer
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        //print out the student's details
        System.out.println("Here is your ID");
        System.out.println("**************************");
        System.out.println("Name: " + name);
        System.out.println("University: " + uni);
        System.out.println("Age: " + age);
        System.out.println("**************************");
    }
}
