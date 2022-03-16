import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {
        int counterfirst = 1;
        int countersecond = 1;
        int input_prime = 0;
        int counter = 3;

        Scanner enter = new Scanner(System.in);

        System.out.print("input the height of your triangle = ");

        int input = enter.nextInt();

        enter.close();

        System.out.println("");
        System.out.println("--------------------------------------------");

        if (input >= 2) {
            System.out.println("A triangle >>>>>>");
            for (int i = 1; i <= input; i++) {
                for (int i2 = 1; i2 <= counterfirst; i2++) {
                    System.out.print("*");

                }
                counterfirst++;
                System.out.println();
            }

            System.out.println("--------------------------------------------");

            // --------------------------------------------
            System.out.println("B triangle >>>>>>");

            for (int i = 1; i <= input; i++) {

                for (int i2 = i; i2 <= input; i2++) {
                    System.out.print("*");
                }
                System.out.println();

            }

            System.out.println("--------------------------------------------");

            // --------------------------------------------
            System.out.println("C triangle >>>>>>");

            for(int i = 1;i<=input;i++)
            {
                System.out.print("*");
            }
            System.out.println("");

            for(int i = 1;i<=input-3;i++)
            {
                System.out.print("*");
                for(int i2 = input-counter;i2>=1;i2--)
                { 
                    System.out.print(" ");
                }
                System.out.println("*");
                counter++;

            }
            System.out.println("**");
            System.out.println("*");

            // --------------------------------------------
            System.out.println("D triangle >>>>>>");

            for (int i = 0; i < input; i++) {

                for (int i2 = input - i; i2 > 1; i2--) {
                    System.out.print(" ");
                }
                for (int i2 = 0; i2 <= i; i2++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }

            System.out.println("--------------------------------------------");
            // --------------------------------------------
            System.out.println("E triangle >>>>>>");

            for (int i = 0; i <= input - 1; i++) {
                for (int i2 = 0; i2 < i; i2++) {
                    System.out.print(" ");
                }
                for (int i3 = 0; i3 <= input - 1 - i; i3++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            System.out.println("--------------------------------------------");
            // --------------------------------------------
            System.out.println("F triangle >>>>>>");

            for (int i = 1; i <= input - 1; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
            input_prime = input;
            for (int i = 1; i <= input - 2; i++) {
                for (int i2 = 1; i2 <= input_prime - 2; i2++) {
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
            for (int i4 = 1; i4 <= input; i4++) {
                System.out.print("* ");
            }
            System.out.println();

            System.out.println("--------------------------------------------");

            // --------------------------------------------

        } else if (input <= 0) {
            System.out.print("*****  Error :(  *****");
        }

        else {
            System.out.print("***** we can not draw a triangel with length of 1 *****");
        }
    }
}
