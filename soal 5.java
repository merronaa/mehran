import java.util.Scanner;

class remain {
    public static void main(String[] args) {

        long remain = 0 , result = 0, sum = 0 , remainder , fake_input , fake_remain ;
        int  flag = 0 ; 

        Scanner enter = new Scanner(System.in);
        System.out.print("INPUT THE BASE NUMBER >>>>>> ");
        long base = enter.nextInt();


        System.out.println("");
        System.out.println("");
        System.out.println("*******************************");
        System.out.println("");
        System.out.println("");

        

        System.out.print("INPUT YOUR NUMBER >>>>>> ");
        long input = enter.nextInt();

        fake_input = input;
        

        if (base <= 10 && base >= 0) {
            while (fake_input > 0) 
            {
                fake_remain = fake_input % 10;
                if (fake_remain < base) 
                {
                }
                else{flag=1;}

                fake_input = fake_input / 10;
            }
            if (flag == 0) 
            {
                while(input >0)
                {
                    sum += input % 10;
                    input=input/10;

                }


                while (sum > 0) {
                    remain = remain + sum % base;
                    sum = sum / base;
                    remain = remain * 10;
                }

                while (remain > 0) {

                    remainder = remain % 10;

                    result = result * 10 + remainder;

                    remain = remain / 10;

                }

                System.out.println("");
                System.out.println("");
                System.out.println("*******************************");
                System.out.println("");
                System.out.println("");

                System.out.print("****** OUT PUT  >>>>>> ");

                System.out.println(result + " ******" );

            }
            else
            {
                System.out.println("");
                System.out.println("");
                System.out.println("*******************************");
                System.out.println("");
                System.out.println("");

                System.out.println("error :)");

            }
        }

    }
}