package StudentDB;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentAdd {
    static Scanner scan = new Scanner(System.in);
    static BufferedWriter writer;
    static BufferedReader reader;
    public static void main(String[] args) {
        System.out.println("Student Add V1");
    }

    static void addStudent(){
        System.out.print("Name of Student >>> ");
        String name = scan.nextLine();

        System.out.print("id of Student >>> ");
        int id = scan.nextInt();
        scan.nextLine();


        System.out.print("Gender of Student >>> ");
        String gender = scan.nextLine();

        System.out.print("Age of Student >>> ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.print("Assessed grade of Student >>> ");
        int grade = scan.nextInt();
        scan.nextLine();

        StudentInfo studentInfo = new StudentInfo(id, name, gender, age, grade);
        Main.studentInfoList.add(studentInfo);
    }
}
