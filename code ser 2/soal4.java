import java.util.Scanner;

class soal4 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("input your sentence , please >>>>>");
        String input = enter.next();
        enter.close();
        binary_detect(input);

    }
    static void binary_detect(String input) {
        String binary = "";
        int count = 0;
        int array[] = new int[99];
        boolean flag = false;
        

        for (int i = 0; i < input.length(); i++) {
            binary = "";

            //چک میکنیم 0 یا 1 پیدا کنیم
            if (input.charAt(i) == '0' || input.charAt(i) == '1') {

                flag = true;
                for (int j = i; j < input.length(); j++) {

                    // چک میکنیم تا وقتی عدد 0 یا 1 است به رشته اصاقه کند
                    if (input.charAt(j) == '0' || input.charAt(j) == '1') {
                        if (input.charAt(j) == '0') {
                            binary += '0';

                        } else {
                            binary += '1';
                        }
                    } else {
                        break;
                    }
                    //اگر 0 یا 1 پیدا نشد بریک میخورد و از اخرین عدد پیدا شده شروع میکنیم

                    i = j;
                }

                //عدد بدست امده را به تبدیل میکنیم و به ارایه ضافه میکنیم

                array[count++] = Integer.parseInt(binary, 2);

            }
        }
        //اگر عددی پیدا نشود فلگ منفی میماند 

        if (flag == false) { 
            System.out.println("there is no binary number in it :( ");
            System.exit(0);
        }
        //در ارایه به دنبال بزرگ ترین عدد میگردیم
        
        int max = array[0];
        for(int i = 0; i < count; i++) {
            if (array[i]>max){max = array[i];}
        }
        System.out.println("the biggest number is : " + max);

    }

}