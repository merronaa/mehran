import java.util.Scanner;

public class soal1 {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        System.out.println("enter your email address >>>>> ");
        String email = enter.next();
        enter.close();

        System.out.println();
        System.out.println();

        if (checker(email) == 1) {
            System.out.println("****** valid :) ******");
        }

        else {
            System.out.println("****** invalid :( ******");
        }
        System.out.println();
        System.out.println();

    }

    public static int checker(String email) {
        int counter = 0;
        ;

        if ((email.charAt(0) >= 0 && email.charAt(0) <= 9) || (email.charAt(0) == '_')) {
            return 0;

        }

        if (email.lastIndexOf('.') < email.lastIndexOf('@')) {
            return 0;
        }

        // بعد نقطه اخر
        for (int i = email.lastIndexOf('.') + 1; i < email.length(); i++) {
            counter++;
            if (email.charAt(i) >= 'a' && email.charAt(i) <= 'z') {
                continue;
            } else {
                return 0;
            }

        }
        if (counter > 3 && counter == 0) {
            return 0;
        }

        // تعداد ادساین
        counter = 0;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                counter++;
            }
        }

        if (counter > 1) {
            return 0;
        }

        if (counter == 0) {
            return 0;
        }
        // تعداد نقطه
        int counterDOT = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '.') {
                counterDOT++;
            }
        }
        if (counterDOT == 0) {
            return 0;
        }
        // قیل ادساین

        int counterBIF = 0;

        for (int i = 0; i < email.indexOf('@'); i++) {

            counterBIF++;

        }
        if (counterBIF == 0) {
            return 0;
        }
        // بین ادساین تا نقطه

        int beet = 0;
        for (int i = email.lastIndexOf('@') + 1; i < email.lastIndexOf('.'); i++) {

            beet++;

        }
        if (beet == 0) {
            return 0;
        }

        return 1;
    }
}