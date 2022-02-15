import java.util.Scanner;
public class Arrays {
	
	public static int[] takeInput()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter total number : ");
		int n = s.nextInt();
		int arr[] = new int [n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Array at "+i+"th position : ");
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int arr[])
	{
		int n = arr.length;
		System.out.println("Entered Array is : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter total number : ");
//		int n = s.nextInt();
//		int arr[] = new int [n];
//		for(int i=0;i<n;i++)
//		{
//			System.out.print("Array at "+i+"th position : ");
//			arr[i] = s.nextInt();
//		}
//		System.out.println("Entered Array is : ");
//		for(int i=0;i<n;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		
//		**************  USING FUNCTIONS  *******************
		int arr[] = takeInput();
		printArray(arr);

	}

}
