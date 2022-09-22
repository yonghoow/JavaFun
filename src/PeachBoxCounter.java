//package src;

import java.util.Scanner;

public class PeachBoxCounter {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number of peaches he picks:");
        int numberOfPeaches = sc.nextInt();
        for (int numberShipped = 0; numberShipped <= numberOfPeaches; numberShipped += 20) {
            System.out.printf("shipped %d peaches so far\n", numberShipped);
        }
    }
}
