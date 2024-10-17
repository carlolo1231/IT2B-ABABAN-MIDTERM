
package it.pkg2b.ababan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class IT2BABABAN {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ababan ab = new ababan();
            int choice;
            String response;
            do {
                System.out.println("1. ADD STUDENT");
                System.out.println("2. VIEW STUDENTS");
                System.out.println("3. UPDATE STUDENT");
                System.out.println("4. DELETE STUDENT");
                System.out.println("5. EXIT");
                
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine();
                
                switch (choice) {
                    case 1:
                         ab.addStudent(sc);
                        break;
                    case 2:
                       ab.viewStudents();
                        break;
                    case 3:
                        ab.viewStudents();
                        ab.updateStudent(sc);
                        break;
                    case 4:
                        ab.viewStudents();
                        ab.deleteStudent(sc);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
                System.out.println("Do you want to continue? (yes/no):");
                response = sc.next();
            } while (response.equalsIgnoreCase("yes"));
            System.out.println("Thank you, See you soon!");
        }
    }

    }
