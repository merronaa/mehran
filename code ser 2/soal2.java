import java.util.Scanner;

public class S2 {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          String str1;
          String str2;
          System.out.print("Enter the first text : ");
          str1 = input.nextLine();
          System.out.print("Enter the second text : ");
          str2 = input.nextLine();
          int tr = 0;
          // --------- چک کردن برابر بودن رشته --------
          if (str1.compareTo(str2) != 0) {
               tr++;
          }
          // ------------- چک کردن عدد --------------
          int c = 0;
          for (int i = 0; i < str1.length(); i++) {
               if (Character.isDigit(str1.charAt(i)) != false) {
                    c++;
               }
          }
          if (c == 0) {
               tr++;
          }
          // --------- چک کردن طول رشته ---------
          if (str1.length() <= 8) {
               tr++;
          }
          // --------------- چک کردن کراکتر --------------
          int c2 = 0;
          for (int j = 0; j < str1.length(); j++) {
               int x = 0;
               if (Character.isDigit(str1.charAt(j)) == true) {
                    x = 1;
               }
               if (x != 1) {
                    if (str1.charAt(j) >= 'a' && str1.charAt(j) <= 'z') {
                         x = 2;
                    }
               }
               if (x != 1 && x != 2) {
                    if (str1.charAt(j) >= 'A' && str1.charAt(j) <= 'Z') {
                         x = 3;
                    }
               }
               if (x != 1 && x != 2 && x != 3) {
                    c2++;
               }
          }
          if (c2 == 0) {
               tr++;
          }
          // ------------- درست یا غلط ------------
          if (tr == 0) {
               System.out.print("true");
          } else {
               System.out.print("false");
          }
     }
}