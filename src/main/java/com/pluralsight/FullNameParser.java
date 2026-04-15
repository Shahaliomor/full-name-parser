package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String choice="";

        do {

            //
            System.out.print("Please enter your name: ");
            String fullName = input.nextLine().trim();

            String firstName = "";
            String middleName = "(none)";
            String lastName = "";
            String suffix = "(none)";

            String[] commaParts = fullName.split(",");
            String namePart = commaParts[0].trim();

            if (commaParts.length > 1) {
                suffix = commaParts[1].trim();
            }

            String[] parts = namePart.split(" ");

            if (parts.length == 2) {
                firstName = parts[0];
                lastName = parts[1];
            } else if (parts.length == 1) {
                firstName = parts[0];
            } else if (parts.length == 3) {
                firstName = parts[0];
                middleName = parts[1];
                lastName = parts[2];
            } else {
                System.out.println("Invalid name format!");
                continue;
            }

            //output
            System.out.println("First name: " + firstName);
            System.out.println("Middle name: " + middleName);
            System.out.println("Last name: " + lastName);
            System.out.println("Suffix: " + suffix);

            //  (repeat)
            System.out.print("\nDo you want to run again? (yes/no): ");
            choice = input.nextLine();

        } while (choice.equalsIgnoreCase("yes"));
    }
}