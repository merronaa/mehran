import java.util.Scanner;

class diomand {
    public static void main(String[] args) {
        int countersecond = 1;
        int input_prime = 0;

        Scanner enter = new Scanner(System.in);

        System.out.print("input the height of your diomands = ");

        int input = enter.nextInt();

        enter.close();

        System.out.println("");
        System.out.println("");

        if (input > 0) {
            System.out.println("");
            System.out.println("");

            System.out.println("FULL DIOMAND >>>>>");

            System.out.println("");
            System.out.println("");

            for (int i = 1; i <= input + 1; i++) {
                for (int i2 = i; i2 <= input; i2++) {
                    System.out.print(" ");
                }
                for (int i3 = 1; i3 <= i * 2 - 1; i3++) {
                    System.out.print("*");
                }
                System.out.println("");

            }
            for (int i = input; i >= 1; i--) {
                for (int i2 = i; i2 <= input; i2++) {
                    System.out.print(" ");
                }
                for (int i3 = 1; i3 <= i * 2 - 1; i3++) {
                    System.out.print("*");
                }
                System.out.println("");

            }

            System.out.println("");
            System.out.println("");

            System.out.println("--------------------------------------------");

            System.out.println("");
            System.out.println("");

            System.out.println("HOLLOW DIOMAND >>>>>");

            System.out.println("");
            System.out.println("");

            for (int i = 1; i <= input; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
            input_prime = input;
            for (int i = 1; i <= input; i++) {
                for (int i2 = 1; i2 <= input_prime - 1; i2++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                input_prime--;

                for (int i3 = 1; i3 <= countersecond * 2 - 1; i3++) {
                    System.out.print(" ");
                }
                System.out.println("*");
                countersecond++;

            }

            countersecond = input * 2 - 3;
            input_prime = 0;

            input_prime = input;

            for (int i = input; i > 1; i--) {
                for (int i2 = input_prime; i2 <= input; i2++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                input_prime--;

                for (int i3 = countersecond; i3 >= 1; i3--) {
                    System.out.print(" ");
                }
                System.out.println("*");
                countersecond = countersecond - 2;

            }

            for (int i = 1; i <= input; i++) {
                System.out.print(" ");
            }
            System.out.println("*");

        } else {
            System.out.print("****** error :) ******");
        }

        System.out.println("");
        System.out.println("");

    }

}