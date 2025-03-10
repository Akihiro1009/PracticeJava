import java.util.Random;
import java.util.Arrays;

public class selection {
    public void selectionSort(){
        //int[] numbers = new int[10];

    }

    public static void main(String[] args) {
        int[] num = new int[10];
        Random random = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(num));
    }
}
