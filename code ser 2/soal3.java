import java.util.Scanner;

class soal3 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        //دریافت جمله
        System.out.println("");
        System.out.println("");

        System.out.print("input your sentence , please >>>>>> ");
        String repeat = enter.nextLine();
        enter.close();

        compress(repeat);
    }

    public static void compress(String repeat) {
        String compressed = "";
        boolean flag = false;

        for (int i = 0; i < repeat.length(); i++) {
            flag = false;

            //اگر حروف پیدا شد فلگ ترو میشود

            for (int j = 0; j < compressed.length(); j++) {
                if (compressed.charAt(j) == repeat.charAt(i)) {
                    flag = true;
                }
            }
            if (flag == false) {
                compressed += repeat.charAt(i);
            }
        }

        System.out.println("");
        System.out.println("");

        System.out.print("****** your word with compress is : ");
        System.out.print(compressed);
        System.out.print(" ******");

    }

}