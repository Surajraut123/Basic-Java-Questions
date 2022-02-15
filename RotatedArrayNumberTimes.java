import java.util.Scanner;
public class RotatedArrayNumberTimes {

	public static int arrayRotateCheck(int[] arr){
    	int n = arr.length;
        if(n==0)
        {
            return 0;
        }
        int p = arr[n-1];
        int c =0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>p)
            {
                c++;
            }
        }
        return c;
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
			System.out.print(arrayRotateCheck(arr));
			n--;
		}

	}

}
