package basic;

import java.util.Scanner;

public class take_input_print_integer {
    public static void main(String[] args) {
        int N;
        System.out.println("Enter the integer N: ");
        Scanner sc = new Scanner(System.in);
         N = sc.nextInt();
        System.out.println("Print the integer N: " + N);
    }
}
