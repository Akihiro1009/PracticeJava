package StudentDB;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How can I help you? \"StudentList\" \"Add new student\">>> ");
        String answer = scan.nextLine().toLowerCase();

        if (answer.equals("studentlist") || answer.equals("student list") || answer.equals("list")) {
            StudentManage.displayStudentManage();
        }
        if (answer.equals("add") || answer.equals("add new student") || answer.equals("new student")){
            //run studentadd.py
        }

        else{
            System.out.println("Error");
        }

    }

}
