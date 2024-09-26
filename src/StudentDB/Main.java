package StudentDB;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Hi, How can I help you? \n" +
                "Type \"List\" to check student list. \n" +
                "Type \"Add\" to add new student in the list. \n" +
                "Type \"Remove\" to remove student from list. \n" +
                ">>> ");
        String answer = scan.nextLine().toLowerCase();

        if (answer.equals("list")) {
            StudentManage.displayStudentManage();
        }else if (answer.equals("add")){
            StudentAdd.addStudent();
        }else if (answer.equals("remove")){

        }else {
            System.out.println("Error");
        }

    }

}
