import java.util.Scanner;
public class SwapAlternate {

	public static int[] swapAlternate(int arr[]) {
    	for(int i=0;i<arr.length-1;i=i+2)
        {
    		int tmp = arr[i];
    		arr[i] = arr[i+1];
    		arr[i+1] = tmp;
        }
    	return arr;
        
    }
	
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] takeInput(int arr[])
	{
		Scanner s = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n>0)
        {
        	int b = s.nextInt();
        	int arr[] = new int[b];
        	int arr2[]=takeInput(arr);
        	int arr1[]=swapAlternate(arr2);
        	printArray(arr1);
        	n--;
        }    

	}

}
