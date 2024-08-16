import java.io.*;
import java.util.*;
import java.iang.*;
 class InterestNptl{
    public static void main(String args[]){
        Float principalAmount = new Float(0);
        Float rateOfInterest = new Float(0);
        int numberOfYears = 0;
        DataInputStream in = new DataInputStream(System.in);
        String tempString;
        System.out.println("Enter principal Amount: ");
        System.out.flush();
        tempString = in.readLine();
        principalAmount = Float.valueOf(tempString);
        System.out.println("Enter the RateOfInterest: ");
        System.out.flush();
        tempString = in.readLine();
        rateOfInterest = Float.valueOf(tempString);
        System.out.println("Enter The Years: ");
        System.out.flush();
        tempString = in.nextLine();
        numberOfYears = Integer.parseInt(tempString);
        // input is over now calculating
        float interestTotal = principalAmount + rateOfInterest * numberOfYears;
        System.out.println("Toatal Interest: " + interestTotal);
    }
 }