import java.util.Scanner;


class soal9{
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print(" input your number >> ");
        int number = enter.nextInt();
        enter.close();
        System.out.println(pluse(number));

    }
    static int pluse(int number){
        if (number > 1){
            return number + pluse(number-1); 
        }
        return 1;
        
    }
}