package StudentDB;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How can I help you? \"StudentList \" >>> ");
        String studentList = scan.nextLine().toLowerCase();

        if (studentList.equals("studentlist") || studentList.equals("student list") || studentList.equals("list")) {
            StudentManage.displayStudentManage();
        }
        else{
            System.out.println("Error");
        }

    }

}
