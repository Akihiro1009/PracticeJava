package AI;

import java.util.ArrayList;

public class StudentManage {
    static ArrayList<StudentInfo> studentList = new ArrayList<>();

    // Static block to initialize studentList
    static {
        studentList.add(new StudentInfo(1234, "Tom", "Male", 18, 5));
        studentList.add(new StudentInfo(2345, "Jacob", "Male", 18, 5));
        studentList.add(new StudentInfo(3456, "James", "Male", 18, 5));
        studentList.add(new StudentInfo(4567, "John", "Male", 18, 5));
    }

    // Static method to display students
    public static void displayStudentManage() {
        for (StudentInfo student : studentList) {
            System.out.println(student);
        }
    }
}