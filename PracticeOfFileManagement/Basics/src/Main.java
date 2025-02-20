import java.io.*;

public class Main {
    public static void main(String[] args) {
        String path = "PracticeOfFileManagement/Basics/src/data.csv";

        File file = new File(path);

        //File[] csvFiles = folder.listFiles((dir, name) -> name.endsWith(".csv"));

        if (!file.exists()) {
            System.out.println("File does not exist");
            return;
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-------------");
    }
}
