package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Prompt user to provide first name
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine().trim();

        //Prompt user to provide middle name
        System.out.println("Enter your middle name:");
        String middleName = scanner.nextLine().trim();

        //Prompt user to provide last name
        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine().trim();

        //Prompt user to provide suffix
        System.out.println("Enter your suffix:");
        String suffix = scanner.nextLine().trim();

        String fullName = firstName;

        //Include middle name if it was provided
        if (!middleName.equals("")) {
            fullName += " " + middleName;
        }
        fullName += " " + lastName;

        //Include suffix if it was provided
        if (!suffix.equals("")) {
            fullName += ", " + suffix;
        }
        //Print out full name
        System.out.println("Full name: " + fullName);
    }

}
