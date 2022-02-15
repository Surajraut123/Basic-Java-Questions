import java.util.Scanner;
public class TripletSum {

	public static int pairSum(int arr[], int x) {
        int b = arr.length;
        int count = 0,p=0;
    	for(int i = 0; i < b; i++ )
        {
			for(int j = i+1; j < b; j++ )
        	{
				for(int k= j+1; k < b ; k++)
				{
					p = arr[i]+arr[j]+arr[k];
	                if(x==p)
	                {
	                    count++;
	                }
				}    
        	}
        }
        return count;
    }
    
    public static int[] takeinput(int arr[])
    {
    	Scanner s = new Scanner(System.in);
        int b = arr.length;
        for(int i = 0; i < b; i++ )
			{
				arr[i] = s.nextInt();
			}
        return arr;
    }
    
    public static void main(String[] args)
    {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n>0)
        {
            int b = s.nextInt();
            int a[] = new int[b];
            int arr[]=takeinput(a);
            int c = s.nextInt();
            System.out.println(pairSum(arr,c));
            n--;
            
        }
    }

}
