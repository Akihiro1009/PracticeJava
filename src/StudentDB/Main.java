package StudentDB;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("How can I help you? \n" +
                    "Type \"List\" to check student list. \n" +
                    "Type \"Add\" to add new student in the list. \n" +
                    "Type \"Remove\" to remove student from list. \n" +
                    ">>> ");

            String answer = scan.nextLine().toLowerCase();

            if (answer.equals("list")) {
                StudentManage.displayStudentManage();
            } else if (answer.equals("add")) {
                StudentAdd.addStudent();
            } else if (answer.equals("remove")) {
                StudentRemove.removeStudent();
            } else {
                System.out.println("Error");
                continue; //what is this continue?
            }
            System.out.println("Do you want to continue? [Y/N]");
            String again = scan.nextLine().toLowerCase();

            if (!again.equals("y")) {
                break;
            }
        }
        scan.close();
        System.out.println("Thank you for using the program!!");
    }
}
