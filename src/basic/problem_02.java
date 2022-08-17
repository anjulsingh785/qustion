package basic;

import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
/*            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your subject a  mark: ");
            float a = sc.nextFloat();

            System.out.println("Enter your subject b mark: ");
            float b = sc.nextFloat();

            System.out.println("Enter your subject c mark: ");
            float c = sc.nextFloat();

            System.out.println("Enter your subject d mark: ");
            float d = sc.nextFloat();
    //    for percentage we first find overall marks
            float total = a + b + c + d;
            float percentage = (total/400)*100;
            //print result
            System.out.println("percentage: "+percentage);*/

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        double total = a+b+c+d ;
        double percent= (total /400)*100;

        System.out.println(percent);


    }
}
