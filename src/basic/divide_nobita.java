package basic;

import java.util.Scanner;

public class divide_nobita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int Q = sc.nextInt();

        try {
            int divide = D / Q;
            System.out.print(divide);
        } catch (Exception e) {
            System.out.print(-1);
        }
    }
}


