import java.util.Scanner;

class soal5 {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.println("input your sentence, please");
        String input = enter.nextLine();
        String space = " ";
        enter.close();
        //یک فاصله به اخر جمله اضافه میکنیم که بتوانیم در حلقه زیر شناسایی کنیم
        input = input.concat(space);

        letter(input);
        

    }

    static void letter (String input) {
        int pointer = 0;
        int counter = 0;
        int i = 0;
        int flag = 0;

        //اگر اول جلمه فاصله بود رد کند
        if (input.charAt(0) == ' '){i++;}

        for (; i < input.length(); i++) {

            if (input.charAt(i) == ' ') {
                //کلمه قبل فاصله را چک میکنیم
                for (int j = i - 1; j >= pointer; j--) {
                    if (input.charAt(j) == 'a' || input.charAt(j) == 'o' || input.charAt(j) == 'i'
                            || input.charAt(j) == 'e' || input.charAt(j) == 'u') {
                        counter++;
                        //اگر یکبار پیدا شد حلقه قطع شود
                        break;

                    }
                }
                
                pointer = i;

                //فلک شمارنده تعداد کلمه خوانده شده است
                flag++;
            }
        }

        //تقداد کلمه بدون صدا را بدست میاورد
        counter = flag - counter;

        System.out.println();
        System.out.println();
        System.out.println(counter);
        System.out.println();
        System.out.println();
    }
}