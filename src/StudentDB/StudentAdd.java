package StudentDB;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentAdd {
    static Scanner scan = new Scanner(System.in);
    static BufferedWriter writer;
    static BufferedReader reader; //do I need to read?
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

        System.out.print("Assessed grade of Student >>> ");
        int grade = scan.nextInt();

        String filePath = "./src/StudentDB/StudentManage.java";

        String dataJava = String.format("studentList.add(new StudentInfo(%s,\"%s\", \"%s\", %s, %s));",
                id,
                name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase(),
                gender.substring(0,1).toUpperCase() + gender.substring(1).toLowerCase(),
                age, grade);

        {
            try {
                reader = new BufferedReader(new FileReader(filePath));

                String line;
                List<String> lines = new ArrayList<>();
                //int currentLine = 0;

                while ((line = reader.readLine()) != null) {
                    lines.add(line);
                }
                reader.close();

                int insertLine = lines.size() - 9; //9th line from the bottom

                if (insertLine >= 0) {
                    lines.add(insertLine, "            " + dataJava);
                }

                try {
                    writer = new BufferedWriter(new FileWriter(filePath));
                    for (String l : lines) {
                        writer.write(l);
                        writer.newLine();
                    }
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //content.insert(content.indexOf(lines[insertPosition]), "            " + dataJava + "\n");
    }



}
