import java.util.Scanner;
public class ArrayIntersection {

	
	public static void intersections(int arr[],int arr1[])
	{
		int n = arr.length;
		int c = arr1.length;
		int p;
		boolean check1[] = new boolean[arr.length];
        boolean check2[] = new boolean[arr1.length];
		for(int i=0;i<n;i++)
		{
			p=0;
			for(int j=0;j<c;j++)
			{
				if(!check2[j])
                {
                    if(arr[i]==arr1[j])
                    {
                        check1[i] = true;
                        check2[j] = true;
                        // p++;
                        break;
                    }
                }    
			}
		}	
//			if(p>0)
//			{
//				System.out.print(arr[i]+" ");
//			}
			
			for(int i = 0; i <arr.length; i++)
            {
                if(check1[i]) {
                    System.out.print(arr[i] + " ");
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
			
			
			int c = s.nextInt();
			int arr1[] = new int[c];
			for(int i = 0; i < c; i++ )
			{
				arr1[i] = s.nextInt();
			}
			intersections(arr,arr1);
		}

	}

}
