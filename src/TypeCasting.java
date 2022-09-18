//package src;

import java.util.Scanner;

public class TypeCasting {
    //import scanner and crate public class
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //input a number as a integer
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Entered value is: " + num1);
        //convert integer to floating point
        float f1 = num1;
        System.out.println("Entered value as a floating point variable is: " + f1);
    }
}
