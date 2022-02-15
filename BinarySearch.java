import java.util.Scanner;
public class BinarySearch {

	public static int binarySearch(int[] arr, int x) {
    	int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
			int mid = (start+end)/2;
            if(arr[mid]<x)
            {
            	start = mid + 1;
            }
            else if(arr[mid]>x)
            {
				end = mid-1;
            }
            
            else            	
            {
                return mid;
            }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int p = s.nextInt();
        while(p>0)
        {
			int x = s.nextInt();
            for(int i=0;i<n;i++)
            {
				a[i] = s.nextInt();
            }
    		System.out.println(binarySearch(a,x));
    		p--;
        }
    }

}
