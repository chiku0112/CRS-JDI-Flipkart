//package com.flipkart.client;

import java.util.Scanner;


public class FlipkartClient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlipkartClient flipkartclient = new FlipkartClient();
        int userInput;
        createMainMenu();
        userInput = sc.nextInt();

        switch (userInput) {
            case 1:
                //login
                flipkartclient.loginUser();
                break;
            case 2:
                //student registration
                flipkartclient.registerStudent();
                break;
            case 3:
                flipkartclient.updatePassword();
                break;
            default:

                System.out.println("Invalid Input");
        }
        createMainMenu();
        userInput = sc.nextInt();
    }



        public static void createMainMenu()
        {

            System.out.println("----------Welcome to Course Management System---------");
            System.out.println("1. Login");
            System.out.println("2. Student Registration");
            System.out.println("3. Update password");
            System.out.println("4. Exit");
            System.out.println("Enter user input");
        }
        public void loginUser()
        {
            System.out.println("User Login will be done here -----");
            System.out.println(" ");
        }

        public void registerStudent()
        {
            System.out.println("Student Registration is done here -----");
            System.out.println(" ");
        }

        public void updatePassword()
        {
            System.out.println("Password update ------ ");
            System.out.println(" ");
        }
    }

