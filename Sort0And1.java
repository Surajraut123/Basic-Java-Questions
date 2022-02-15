import java.util.Scanner;
public class Sort0And1 {

	public static void sortZeroesAndOne(int[] arr) {
    	int e = arr.length;
    	int s=0;
    	while(s<=e)
    	{
    		int i=0;
    		s=arr[i];
    		
    		//if()
    	}
    	
    	
    	
//        for(int j=0; j<n; j++)
//        {
//            System.out.print(arr[j]+" ");
//        }
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
            int arr[] = takeinput(a);
            sortZeroesAndOne(arr);
            n--;
        }
    }

}
