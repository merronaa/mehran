import java.util.Scanner;

class soal8 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String s = enter.nextLine();
        enter.close();
        encode(s);

    }

    static void encode(String s) {
        String new_s = "";
        int convetor = 0;
        for (int i = 0; i < s.length(); i++) {
            convetor = 0;
            convetor = s.charAt(i);
            //اگر عضو سه حروف اخر باشد بدون تغییر بماند
            if (convetor == 122 || convetor == 90 || convetor == 89 || convetor == 121 || convetor == 88 || convetor == 120) {
                new_s += (char) convetor;

            } else {

                convetor += 3;
                new_s += (char) convetor;
            }

        }
        System.out.println("after + 3 >> " + new_s);

        dicode(new_s);

    }

    static void dicode(String new_s) {
        String new_string = "";
        String new_string2 = "";
        int convetor = 0;

        //به دو حالت برگشت بدهد سه حرف اخر را برگرداند یا برنگرداند

        for (int i = 0; i < new_s.length(); i++) {
            convetor = 0;
            convetor = new_s.charAt(i);
            convetor -= 3;
            new_string += (char)convetor;
        }

        //بدون تعییر در سه حرف اخر بر نگرداند
        for (int i = 0; i < new_s.length(); i++) {
            convetor = 0;
            convetor = new_s.charAt(i);
            if (convetor == 122 || convetor == 90 || convetor == 89 || convetor == 121 || convetor == 88 || convetor == 120) {
                new_string2 += (char) convetor;

            } else {

                convetor -= 3;
                new_string2 += (char) convetor;
            }
        }

        System.out.println("after - 3 >> " + new_string + " or >> "+ new_string2);

    }

}
