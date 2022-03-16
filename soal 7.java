import java.util.Scanner;

public class biggest {
    public static void main(String[] args) 
    {

        Scanner enter = new Scanner(System.in);

        System.out.print("input size >>>>>");

        int size = enter.nextInt();

        if (size > 0) 
        {
            int mehran[] = new int[size];

            System.out.println(" input " + size + " elemen :");

            for (int i = 0; i < size; i++) 
            {
                mehran[i] = enter.nextInt();

            }
            System.out.println("-----------------------------------------------------");
            System.out.println("( " +max(mehran, size) + " , " + negmax(mehran, size)+ " )");
        }
        else
        {
            System.out.println("error :(");
        }

    }

    private static int max(int array[], int size) {
        int maxim = 0;
        for (int i = 0; i < size; i++) {
            if (array[0] <= array[i]) {
                maxim = array[i];
            }
        }
        return maxim;
    }

    private static int negmax(int array[], int size) {
        int maxim = 0;
        int new_array[] = new int[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] < 0) {
                new_array[count] = array[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            if (new_array[0] <= new_array[i]) {
                maxim = new_array[i];
            }
        }
        return maxim;

    }
}
