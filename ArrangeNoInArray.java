import java.util.Scanner;
public class ArrangeNoInArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		while(n>0)
		{
			int b = s.nextInt();
			int arr[] = new int[b];
			int k=0;
			if(b%2==0)
			{
				for(int i=1;i<b;i=i+2)
				{
					arr[k] = i;
					k++;
				}
				for(int i=b;i>0;i=i-2)
				{
					arr[k] = i;
					k++;
				}
				for(int i=0;i<b;i++)
				{
					System.out.print(arr[i]+" ");
				}
			}
		    
			else {
				
				for(int i=1;i<=b;i=i+2)
				{
					arr[k] = i;
					k++;
				}
				for(int i=b-1;i>0;i=i-2) //1 3 5 7 9 8 6 4 2
				{
					arr[k] = i;
					k++;
				}
				for(int i=0;i<b;i++)
				{
					System.out.print(arr[i]+" ");
				}
			}
			
			n--;
		}
		

	}

}
