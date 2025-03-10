package Main;

import ScannerPractice.ScannerPracticeOne;

public class Main {
    public static void main(String[] args) {
        int number = 18;
        String numberString = "21";
        System.out.println(Integer.parseInt(numberString));

        number = Integer.parseInt(numberString) + number;
        System.out.println(number);

        ifStatement();
    }

    public static void ifStatement(){
        int a = 10;

        /*if(a == 10){
            System.out.println("a is 10 : 1st exe");
        }
        if(a == 10){
            System.out.println("a is 10 : 2nd exe");
        }
        if(a == 10){
            System.out.println("a is 10 : 3rd exe");
        }
        if(a == 10){
            System.out.println("a is 10 : 4th exe");
        }*/

        if(a == 10){
            System.out.println("a is 10 : 1st exe");
        } else if(a == 10){
            System.out.println("a is 10 : 2nd exe");
        } else if(a == 10){
            System.out.println("a is 10 : 3rd exe");
        } if(a == 10){
            System.out.println("a is 10 : 4th exe");
        } else if(a != 10){
            System.out.println("a is 10 : 5th exe"); //won't be executed
        }
    }
}
