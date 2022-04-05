import java.util.Scanner;
class soal10 {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        System.out.print("input your base >> ");
        int number = enter . nextInt();
        System.out.print("input your power >> ");
        int power = enter . nextInt();
        enter.close();
        System.out.println(cal(number , power));

        
    }
    static int cal(int number , int power){
        if(number ==1 || power == 0){return 1;}
        else {
            return number * cal(number, power-1);
        }
    }
}