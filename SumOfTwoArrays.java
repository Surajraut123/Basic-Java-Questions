import java.util.Scanner;
public class SumOfTwoArrays {

	public static int[] SumOfTwoArray(int arr1[], int arr2[])
	{
		int i = arr1.length-1;
		System.out.println(i);
		int j = arr2.length-1;
		System.out.println(j);
		int k;
		if(i<j)
		{
			k=j;
		}
		else {
			k=i;
		}
		System.out.println(k);
		int output[] = new int[k];
		int sum=0;
		int carry =0 ;
		while(k>=0)
		{
			if(i>0)
			{
				sum+=arr1[i];
				i--;
			}
			if(j>0)
			{
				sum+=arr2[j];
				j--;
			}
			sum +=carry;
			carry = sum/10;
			output[k] = sum%10;
			k--;
		}
		return output;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(n>0)
		{
			int b= s.nextInt();
			int arr[] = new int[b];
			for(int i=0;i<b;i++)
			{
				arr[i] = s.nextInt();
			}
			int c = s.nextInt();
			int arr1[] = new int[c];
			for(int i=0;i<c;i++)
			{
				arr1[i] = s.nextInt();
			}
			
			System.out.print(SumOfTwoArray(arr,arr1));
			n--;
		}

	}

}
