import java.util.Scanner;

class two_part {

	static int findSplitPoint(int arr[], int size) 
	{
		int leftside = 0,rightside = 0;


		for (int i = 0; i < size; i++) 
		{

			leftside += arr[i];

			rightside = 0;

			for (int j = i + 1; j < size; j++) 
			{
				rightside += arr[j];	
			}	
			if (leftside == rightside)
			{
				return i ;
			}
		
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner enter = new Scanner(System.in);

		System.out.print("input your size >>>>>> ");

		int size = enter.nextInt();
		System.out.println();
		System.out.println();
 //---------------------------------------------------------------
		int arr[] = new int[size];

		System.out.println(" input your  "+ size +" elements ");

		for (int i = 0; i < size; i++) 
		{
			arr[i] = enter.nextInt();
			if(i<size-1){System.out.println(" and ? ");}
		}
		int pointer = findSplitPoint(arr, size);
 //---------------------------------------------------------------


		System.out.println();
		System.out.println();
		System.out.println("*****************************************");
		System.out.println();
		System.out.println();
 //---------------------------------------------------------------
		System.out.println("your array is >>>>>>");

		System.out.println();
		System.out.println();
		
		System.out.print("{ ");
		for (int i = 0 ; i<size; i++)
		{
			System.out.print(arr[i]);
			if(i<size-1){System.out.print(" , ");}
		}
		System.out.println(" }");

		System.out.println();
		System.out.println();
 //---------------------------------------------------------------
		System.out.println("your split array >>>>>>");

		System.out.println();
		System.out.println();

		if(pointer != -1)
		{
			System.out.print("{ ");
			for (int i = 0 ; i<=pointer; i++)
			{
				System.out.print(arr[i]);
				if(i<pointer){System.out.print(" , ");}
			}
			System.out.println(" }");

			System.out.println();
			System.out.println();

			System.out.print("{ ");
			for (int i = pointer+1 ; i<size; i++)
			{
				System.out.print(arr[i]);
				if(i<size-1){System.out.print(" , ");}
			}
			System.out.println(" }");
			System.out.println();
			System.out.println();


		}
		else 
		{
			System.out.print("invalid :(");
		}

	}

}