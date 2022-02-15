import java.util.Scanner;
public class SecondLargestElement {
	
	public static int secondLargestElement(int[] arr) {
    	int n = arr.length;
        for(int i=0; i<n; i++)
        {
			for(int j=i+1;j<n;j++)
            {
				if(arr[i]<arr[j])
                {
					int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr[1];
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
			System.out.print(secondLargestElement(arr));
			n--;
		}
	}	

}
