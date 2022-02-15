import java.util.Scanner;
public class RotateArray {

	public static void rotate(int[] arr, int d) {
    	int n = arr.length;
        int arr1[] = new int[n];
        int k=0;
        for(int i= d;i<n;i++)
        {
            arr1[k] = arr[i];
            k++;
        }
        for(int i= 0;i<d;i++)
        {
            arr1[k] = arr[i];
            k++;
        }
        for(int i= 0;i<n;i++)
        {
            System.out.print(arr1[i]+" ");
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
			int d = s.nextInt();
			rotate(arr,d);
			n--;
		}

	}

}
