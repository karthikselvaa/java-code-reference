package com.javaprogram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java Learning Program Started.....");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose the topics by number");
        System.out.println("1. Getting Started");
        System.out.println("2. Learning the Java Language");
        System.out.println("3. Essential Java Classes");
        System.out.println("4. Collections");
        System.out.println("5. Date-Time APIs");
        System.out.println("6. Deployment");
        switch (scan.nextInt()) {
            case 1:
                System.out.println("Getting Started Topics");

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }
        scan.close();
    }
}
