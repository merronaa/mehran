import java.util.Scanner;

import javax.print.event.PrintJobListener;

class nomreh 
{
    public static void main(String[] args) {
        Scanner enter = new Scanner ( System.in);

        int number , max , min ,counter = 0 , i = 0 ,sum = 0;

        System.out.print("input number score >>>>>> ");

        int size = enter.nextInt();

        

        int array[]= new int[size];

        

        while (counter < size)
        {
            number = enter.nextInt();

            array[counter++]=number;

        }


        max = array [0];
        i = 0;
        while (i<size)
        {
            if (max<=array[i])
            {
                max = array [i];
            }
            i++;
        }
        

        min = array [0];
        i = 0;

        while (i<size)
        {
            if (min>=array[i])
            {
                min = array [i];
            }
            i++;
        }


        i = 0;
        while (i<size)
        {
            sum +=array[i];

            i++;
        }
        System.out.println();
        System.out.println();
        System.out.println("****** the best score : " + max + " // the worst number : " + min + " // average is : "+ sum/size + " ******");








        
    }
}