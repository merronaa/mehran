import java.util.Scanner;

public class soal6 {
     public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
          String s;
          // ----------- گرفتن ورودی ------------
          System.out.print("Enter a text : ");
          s = input.nextLine();
          int tol;
          tol = s.length();
          char[] arr = new char[tol];
          // --------- کپی کردن رشته در آرایه ---------
          for (int j = 0; j < tol; j++) {
               arr[j] = s.charAt(j);
          }
          // ----------- جا به جایی حروف ------------
          for (int i = 0; i < tol; i++) {
               int x = 0;
               x = (i + 7) % (s.length());
               arr[x] = s.charAt(i);
          }
          // ----------- چاپ رشته ی جدید -------
               System.out.print(arr[j2]);
          }
     }
}