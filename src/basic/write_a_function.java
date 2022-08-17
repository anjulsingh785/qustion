package basic;



import java.util.Scanner;

public class write_a_function {
//    static int productOfTwoNumbers(int a, int b) {
//        int product = a * b;
//        return product;
//    }
    // write a function to multiply two doubles and one integer

    /**
     * input: double, double,int
     * output: double
     */
    static double multiplyfn(double d1, double d2, int i1) {
        double result = d1 * d2 * i1;
        return result;
    }

    /**
     * if you don't want to return anything
     * the return type is void
     */
    static void printHelloWorld() {
        System.out.println("Hello world");
    }


    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b =sc.nextInt();
//        int product1 = productOfTwoNumbers(a,b);
//        System.out.println(product1);

        printHelloWorld();


    }
}


