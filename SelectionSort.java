import java.util.Scanner;
public class SelectionSort {

	public static void selectionSort(int arr[])
	{
		int n = arr.length;//5 4 6 2 8 9 7
		for(int i=0;i<n-1;i++)
		{
			int a = Integer.MAX_VALUE;
			int minIndex = -1;
			for(int j=i;j<n;j++)
			{
				if(arr[j]<a)
				{
					a = arr[j];
					minIndex = j;
				}
			}
			int tmp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = tmp;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(n>0)
		{
			int b = s.nextInt();
			int arr[] = new int[b];
			for(int i=0;i<n;i++)
			{
				arr[i] = s.nextInt();
			}
			selectionSort(arr);
			n--;
		}
	}

}
