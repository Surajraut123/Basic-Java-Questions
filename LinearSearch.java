import java.util.Scanner;
public class LinearSearch {

	public static int linearSearch(int arr[], int x) {
		for(int i=0;i<arr.length;i++)
		{
			if(x == arr[i])
            {
                return i;
            }
            
		}
        return -1;
        
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b = s.nextInt();
        int arr[] = new int[b];
        for(int i=0;i<b;i++)
		{
			arr[i] = s.nextInt();
		}
        int search = s.nextInt();
        System.out.println(linearSearch(arr,search));

	}

}
