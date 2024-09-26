package StudentDB;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static StudentDB.StudentAdd.writer;

public class StudentRemove {
    static Scanner scanner = new Scanner(System.in);


    public static void removeStudent(){
        System.out.print("Enter student ID or Name to remove >>> ");
        int removeID = scanner.nextInt();
        //String input = scanner.nextLine();

        String filePass = "./src/StudentDB/StudentManage.java";
        List<String> lines = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePass));
            String line;

            while((line = reader.readLine()) != null){
                //if(input.matches("\\d+")){
                    if(!line.contains("new StudentInfo("+ removeID + ",")) {
                        lines.add(line);
                    }/*else{
                        if(!line.contains(".\"" + input.substring(0,1).toUpperCase()+ input.substring(1).toLowerCase() + "\"")) {
                            lines.add(line);
                        }
                    }*/
                //}
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(filePass));
            for(String l : lines){
                    writer.write(l);
                    writer.newLine();
            }
            writer.close();

            System.out.println("Student removed successfully");
            }catch (FileNotFoundException e) {
            System.out.println("Error1");
        }catch (IOException e) {
            System.out.println("Error2");
        }
    }
}
