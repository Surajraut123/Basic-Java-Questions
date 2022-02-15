import java.util.Scanner;
public class BubbleSort {

	public static void bubbleSort(int[] arr)
    {
    	int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }     
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
			for(int i=0;i<b;i++)
			{
				arr[i] = s.nextInt();
			}
			bubbleSort(arr);
			n--;
		}

	}

}
