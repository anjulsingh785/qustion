package basic;

public class nesting_of_loops {
    public static void main(String[] args) {
        /** ####
         ####
         ####
         ####
         print these # same way
         */
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {

                System.out.print("#");
            }
            System.out.println();
        }
    }
}


