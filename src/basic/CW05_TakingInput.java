package basic;

import java.sql.SQLOutput;
import java.util.Scanner;  //import scanner class

public class CW05_TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
            int a = sc.nextInt();
            System.out.println("Enter number 2: ");
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("The sum of these number is");
           System.out.println(sum);

        }
}
