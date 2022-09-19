//package src;

public class Salary {
    public static void main(String[] args) {
        //initialise 2 variables: work_hours and salary
        int work_hours = 10;
        double salary = 0;
        //if conditions
        if (work_hours <= 8) {
            salary = work_hours * 10;
        }
        else if ((work_hours > 8) && (work_hours < 12)) {
            salary = 8 * 10 + (work_hours - 8) * 12;
        }
        else {
            salary = 160;
        }
        System.out.println("The worker's salary is: " + salary);
    }
}
