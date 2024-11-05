import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String file = "csvPractice/Practice1/src/data.csv";
        BufferedReader reader = null;  //why is this null?
        String line = "";

        try{
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null){
                String[] row = line.split(",");

                for(String index : row){
                    System.out.printf("%-15s", index); //what is this index for?
                }
                System.out.println();
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
