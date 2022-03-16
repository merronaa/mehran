import java.util.Scanner;

public class move_to_end {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("input the number to move  >>>>");
        number = input.nextInt();

        int size;
        System.out.println("input the size >>>>");
        size = input.nextInt();

        int first_arr[] = new int[size];

        System.out.println("input the elements >>>>");

        for (int i = 0; i < size; i++) {
            first_arr[i] = input.nextInt();
        }
        System.out.println("-----------------------------------------");

        System.out.println("");
        System.out.println("");

        System.out.print("****** Your first array : ");

        System.out.print("{ ");

        for (int i = 0; i < size; i++) {
            System.out.print(first_arr[i]);
            if (i == size - 1) {
                break;
            }
            System.out.print(",");
        }
        System.out.println(" } ******");
        mover(first_arr,size,number);

    }

private static void mover (int first_arr[],int size,int mover)
    {
        int counter =0;
        int array[]=new int[size];
        
        for(int i=0 ; i < size ;i++ )
        {
            if(first_arr[i] != mover)      
            {
            array[counter]=first_arr[i];
            counter++;
            }
        }
        for(int i = counter; i<size ;i++)
        {
            array[i]=mover;
        }

        System.out.println("");
        System.out.println("");


        System.out.print("****** Your array after sort : ");
  
        System.out.print("{ ");
  
        for (int i =0;i<size ; i++)
        {
            System.out.print(array[i]);
            if(i==size-1){break;}
            System.out.print(",");
        }
        System.out.println(" } ******");

        System.out.println("");
        System.out.println("");
    }

}