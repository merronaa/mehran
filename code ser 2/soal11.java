import java.util.Scanner;

class soal11 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("input your word >>");
        String input = enter.next();
        enter.close();

        int j = input.length() - 1;
        int i = 0;

        if (two_side(input, j, i) == 1) {
            System.out.println("its mirror string");
        } else {
            System.out.println("its NOT mirror string");
        }

    }
    static int two_side(String input, int j, int i) {
        if (j >= i) {
            if (input.charAt(i) == input.charAt(j)) {
                return two_side(input, j - 1,i + 1 );
            }
            else{return 0;}
        }
        return 1;
    }

}