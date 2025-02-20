import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    private static String file = "csvPractice/Practice1/src/data.csv";
    static Scanner sc = new Scanner(System.in);

    public static void reader() {
        String line = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");

                for (String index : row) {
                    System.out.printf("%-15s", index); //what is this index for?
                }
                System.out.println();
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writer() {
        List<String> lines = new ArrayList<>();

        System.out.print("Enter Name >>> ");
        String name = sc.nextLine();
        if (name.equals("-1")) {
            System.exit(0);
        }

        System.out.print("Enter Age >>> ");
        int age = sc.nextInt();
        sc.nextLine();
        if (age == -1) {
            System.exit(0);
        }

        System.out.print("Enter Grade >>> ");
        int grade = sc.nextInt();
        sc.nextLine();
        if (grade == -1) {
            System.exit(0);
        }

        //lines.add(name + "," + age + "," + grade);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true)); //why true?

            bw.write(name + "," + age + "," + grade);
            bw.newLine();
            /*for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
             */
            bw.close();
            System.out.println("Successful");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        //System.out.print("How can I help you? (read or write) >>> ");
        while (true) {
            System.out.print("How can I help you? (read or write) >>> ");
            String ans = sc.nextLine().toLowerCase();
            if (ans.equals("read")) {
                reader();
            } else if (ans.equals("write")) {
                writer();
            } else if (ans.equals("end")) {
                break;
            } else {
                System.out.println("Error: unknown input.");
            }
            System.out.print("Do you want to continue? (y/n) >>> ");
            String cont = sc.nextLine();
            if (cont.equals("n")) {
                break;
            }
        }
        System.out.println("Execution done.");

    }
}
