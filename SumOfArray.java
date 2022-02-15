import java.util.Scanner;
public class SumOfArray {
	
	public static int[] takeInput()
    {
		Scanner s = new Scanner(System.in);
		int b = s.nextInt();
		int arr[] = new int [b];
		for(int i=0;i<b;i++)
		{
			arr[i] = s.nextInt();
		}
		return arr;
        
    }
	public static int sum(int arr[])
	{
		int n = arr.length;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		while(a>0)
		{
			int arr[]=takeInput();
			System.out.print(sum(arr));
	        a--;
		}
		
        

	}

}
