//package basic;
//import java.util.Scanner;
//
//public class functions {
//    /** Print a given number in a function */
//    public static void printMyName(String name){
//        System.out.println(name);
//        return;  // in case of void not there in function we write here after return
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//
//        printMyName(name); // call the function
//
//    }
//
//}
//
//package basic;
// import java.util.Scanner;
//
// public class functions{
//     /** print the sum of two integer in function */
//     public static int calculateSum(int a, int b){
//         int sum = a+b;
//         return sum;
//     }
//
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//
//         int sum = calculateSum(a, b);
//         System.out.println(sum);
//     }
//        }

//
//package basic;
//import java.util.Scanner;
//
//public class functions{
//    /** print the product of two integer in function */
//    public static int calculateProduct(int a, int b){
//
//        return a*b;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println(calculateProduct(a, b)); // product is directly return into print statement
//    }
//}
package basic;
import java.util.Scanner;

public class functions {
    /** Find the factorial of a number by tje help of function */
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;
        for(int i = n; i>=1; i-- ){
            factorial = factorial*i;
        }
        System.out.println(factorial);
      //  return;  // in case of void in function you not need to write return bcuz by default in
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);

    }



}


