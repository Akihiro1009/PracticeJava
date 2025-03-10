import java.util.Random;
import java.util.Arrays;

public class selection {
    public static void selectionSort(int[] num){
        for(int i = 0; i < num.length - 1 ; i++){
            int min = i;
            for(int j = i + 1; j < num.length; j++){
                if(num[j] < num[min]){
                    min = j;
                }
            }
            int temp = num[i];
            num[i] = num[min];
            num[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] num = new int[10];
        Random random = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(num));

        selectionSort(num);
        System.out.println(Arrays.toString(num));
    }
}
