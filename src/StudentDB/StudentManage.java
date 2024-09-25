package StudentDB;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<StudentInfo> studentList = new ArrayList<>();


        studentList.add(new StudentInfo(1234, "Tom", "Male", 18, 5));
        studentList.add(new StudentInfo(2345, "Jacob", "Male", 18, 5));
        studentList.add(new StudentInfo(3456, "James", "Male", 18, 5));
        studentList.add(new StudentInfo(4567, "John", "Male", 18, 5));

        for (StudentInfo student : studentList){
            System.out.println(student);
        }
        //System.out.println(studentList);
    }

    //id : 12345 | name : Tom | gender : Male | age : 18 | grade : 5.7
}
