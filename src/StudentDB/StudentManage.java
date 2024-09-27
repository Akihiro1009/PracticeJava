package StudentDB;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {

    static ArrayList<StudentInfo> studentList = new ArrayList<>();

    static {
            studentList.add(new StudentInfo(1234, "Tom", "Male", 18, 5));
            studentList.add(new StudentInfo(2345, "Jacob", "Male", 18, 5));
            studentList.add(new StudentInfo(3456, "James", "Male", 18, 5));
            studentList.add(new StudentInfo(4567, "John", "Male", 18, 5));

            studentList.add(new StudentInfo(1014,"Fumi", "Female", 17, 7));

    }

    public static void displayStudentManage() { //why does this need to be static?
        for (StudentInfo student : studentList){
            System.out.println(student);
        }
    }
}
