package com.rogers;

import java.util.Scanner;

public class Main {

public static void main (String[] args) { 

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.println("insert firstname : ");
            scanner.nextLine();
            System.out.println("insert lastName : ");
            scanner.nextLine();
            System.out.println("insert phone : ");
            scanner.nextLine();
            System.out.println("insert street number: ");
            scanner.nextInt();
            System.out.println("insert street: ");
            scanner.nextLine();
            System.out.println("insert city: ");
            scanner.nextLine();
            System.out.println("insert state: ");
            scanner.nextLine();
            System.out.println("insert Zip Code: ");
            scanner.nextInt();
 
            }   
        }       

    }