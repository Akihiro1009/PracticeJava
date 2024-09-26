package AI;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How can I help you? \"StudentList \" >>> ");
        String input = scan.nextLine().toLowerCase(); // Changed variable name to avoid confusion

        if (input.equals("studentlist")) {
            // Call the static method directly from the class
            StudentManage.displayStudentManage();
        } else {
            System.out.println("Invalid command. Please type 'StudentList' to see the list of students.");
        }

        scan.close(); // Close the scanner to avoid resource leaks
    }
}