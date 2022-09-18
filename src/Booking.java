//package src;

public class Booking {
    public static void main(String[] args) {
        //initialise 2 variables: empty seats and requested ticket numbers
        int seats = 3; //number of empty seats
        int req_ticket = 4; //request for tickets
        //if conditions to check whether requested ticket numbers are lower than or
        //equal to empty seats available and print appropriate messages
        if ( (req_ticket == seats) || (req_ticket < seats) ) {
           System.out.print("This booking can be accepted");
        }
        else {
            System.out.print("This booking is rejected");
        }
    }
}
