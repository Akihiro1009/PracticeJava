package Main;

public class Main2 {
    public static void main(String[] args) {
        int n = 1216;
        int x = 0;

        while (0 < n) {
            x = x + n % 10;
            n = n / 10;
            System.out.println(x);
        }
        System.out.println(x);
    }
}
