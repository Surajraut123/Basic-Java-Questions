import java.util.Scanner;
public class findUnique {

	public static void findUnique(int[] arr){
		int n = arr.length;
//		int p=arr[0];
		int p ;
		for(int i = 0; i < n; i++ )
		{
			p=0;
//			p = p^arr[i];  Uing XOR Operator
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					p=p+1;
				}
			}
			if(p==1)
			{
				System.out.println("Unique Number : "+arr[i]);
			}
		}
    }
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(n>0)
		{	
			int b = s.nextInt();
			int arr[] = new int[b];	
			for(int i = 0; i < b; i++ )
			{
				arr[i] = s.nextInt();
			}
			findUnique(arr);
		}

	}

}
