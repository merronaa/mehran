import java.util.Scanner;

class soal7 {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        System.out.print("Enter first word >> ");
        String input1 = enter.nextLine();
        System.out.print("Enter second word >> ");
        String input2 = enter.nextLine();
        
        enter.close();

        if(finder(input1, input2)){System.out.println("they are same");}
        else {System.out.println("they are NOT same");}

    }

    static boolean finder(String input1, String input2) {
        char change;
        char change2;

        for (int i = 0; i < input1.length(); i++) {

            //با فاصله مشکلی نداشته باشد

            if(input1.charAt(i) ==' '){continue;}

            //حروف را در شرایط یکسان با هم مقایسه میکنیم
            change = Character.toLowerCase(input1.charAt(i));

            for (int j = 0; j < input2.length(); j++) {

                if(input2.charAt(j) ==' '){continue;}

                //حروف را در شرایط یکسان با هم مقایسه میکنیم
                change2 = Character.toLowerCase(input2.charAt(j));

                if (change == change2) {
                    break;
                } 
                else {
                    //اگر تا اخر امدیم و مشترک پیدا نشد فالس برگشت داده میشود
                    if (j == input2.length() - 1) {
                        return false;
                    }
                }
            }
        }
        //اگر موردی پیدا نشد ترو بازگشت میدهد
        return true;
    }
    //hello
    //lo ehl
}