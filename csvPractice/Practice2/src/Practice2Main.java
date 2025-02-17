import OOP1.B;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;


public class Practice2Main {
    static Scanner scanner = new Scanner(System.in);
    static String filePath = "csvPractice/Practice2/src/data.csv";
    public static void p2Reader() {
        String line = "";//what is this "line" for?
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null) { //I don’t understand in the ()
                String[] row = line.split(",");

                for (String index : row) {
                    System.out.printf("%-15s", index);
                }
                System.out.println("done");
            }
            br.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        p2Reader();
    }
}
