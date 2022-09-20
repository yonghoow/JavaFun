//package src;

import java.util.Scanner;

public class TempSystem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //declare 2 strings: temp and weatherWarning
        String weatherWarning;
        System.out.print("Enter temp (Low, Humid or High): ");
        String temp = sc.nextLine();
        /*create a switch statement that checks different cases of temp, then initialize
        weatherWarning to appropriate messages for each case of temp: High, Low, Humid */
        switch (temp) {
            case "High":
                weatherWarning = "It's hot outside. Don't forget sunblock.";
                break;
            case "Low":
                weatherWarning = "It's cold outside. Don't forget your coat";
                break;
            case "Humid":
                weatherWarning = "The weather is humid. Open the windows.";
                break;
            default:
                weatherWarning = "The weather looks good. Take a walk outside.";
                break;
        }
        System.out.println(weatherWarning);
    }
}
