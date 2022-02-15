import java.util.Scanner;
public class MergeTwoSortedArray {

	public static int[] merge(int arr1[], int arr2[]) {
    	int n = arr1.length;
        int m = arr2.length;
        int arr3[] = new int[m+n];
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
    		if(arr1[i]<=arr2[j])
            {
				arr3[k] = arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<n)
        {
			arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j<m)
        {
			arr3[k] = arr2[j];
            j++;
            k++;
        }
        
        return arr3;
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

			int c = s.nextInt();
			int arr1[] = new int[c];
			for(int i=0;i<c;i++)
			{
				arr1[i] = s.nextInt();
			}
			System.out.print(merge(arr,arr1)+" ");
			n--;
		}

	}

}
