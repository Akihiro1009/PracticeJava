package StudentDB;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static StudentDB.StudentAdd.writer;

public class StudentRemove {
    static Scanner scanner = new Scanner(System.in);


    public static void removeStudent(){
        System.out.print("Enter student ID to remove >>> ");
        //int removeID = scanner.nextInt();
        int input = scanner.nextInt();

        int i = 0;
        for(StudentInfo student : Main.studentInfoList){
            if(student.id == input){
                Main.studentInfoList.remove(i);
                break;
            }
            i++;
        }
    }
}
