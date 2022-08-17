package basic;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                default:
                    System.out.println("Greater than 5");
            }
        }

}
