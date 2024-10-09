package StudentDB;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {

    public static void displayStudentManage() { //why does this need to be static?
        for (StudentInfo student : Main.studentInfoList){
            System.out.println(student);
        }
    }
}
