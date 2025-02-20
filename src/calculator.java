import java.util.Scanner;

public class calculator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("input num >>> ");
        int num = sc.nextInt();

        int st = num / 64;
        int over = num % 64;

        System.out.print(st+","+ over);
    }
}
