package StudentDB;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static List<StudentInfo> studentInfoList = new ArrayList<>();

    public static List<StudentInfo> reader(){
        List<StudentInfo> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/StudentDB/data.csv"));
            String line;

            while ((line = br.readLine()) != null) { //what is this null doing?
                String[] data = line.split(",");
                if(data.length == 5){
                    list.add(new StudentInfo(Integer.parseInt(data[0]), data[1], data[2],Integer.parseInt(data[3]),Integer.parseInt(data[4])));
                }
            }
            br.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static void write(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/StudentDB/data.csv"));
            List<String> lines = new ArrayList<>();
            for (StudentInfo studentInfo : studentInfoList) {
                lines.add(String.format("%d,%s,%s,%d,%d", studentInfo.id, studentInfo.name, studentInfo.gender, studentInfo.age, studentInfo.grade));
            }
            bw.write(String.join("\n", lines));
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        studentInfoList = reader();

        while (true) {
            System.out.print("How can I help you? \n" +
                    "Type \"List\" to check student list. \n" +
                    "Type \"Add\" to add new student in the list. \n" +
                    "Type \"Remove\" to remove student from list. \n" +
                    "Type \"End\" to end. \n" +
                    ">>> ");

            String answer = scan.nextLine().toLowerCase();
            boolean flag = true;

            if (answer.equals("list")) {
                StudentManage.displayStudentManage();
                flag = false;
            } else if (answer.equals("add")) {
                StudentAdd.addStudent();
            } else if (answer.equals("remove")) {
                StudentRemove.removeStudent();
            } else if (answer.equals("end")) {
                break;
            }
            else {
                System.out.println("Error");
                continue; //what is this continue?
            }
            write();
            if (flag) {
                System.out.println("Do you want to continue? [Y/N]");
                String again = scan.nextLine().toLowerCase();
                if (!again.equals("y")) {
                    break;
                }
            }
        }
        write();
        scan.close();
        System.out.println("Thank you for using the program!!");
    }
}

//ToDo: if id number is same, give an error and loop.
//ToDo: if !int, loop and question again, not giving an error.
