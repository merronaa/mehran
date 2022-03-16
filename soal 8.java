import java.util.Scanner;

class k_m_m {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.print(" INPUT YOUR NUMBER : ");

        int input = enter.nextInt();

        System.out.println();
        System.out.println();
        
        kmm(input);
        

    }
    static void kmm(int input)
    {
        int max;

        for (int i = 2; i < input; i++) {
            for (int j = i + 1; j < input; j++) {
                    max = j;
                while ((max % j != 0) || (max % i != 0)) {
                    max++;
                }
                if (max != j * i) {
                    System.out.print("( " + i + " " + j + " )  ");
                }

            }

        }

    }
}