import java.util.Scanner;
import java.util.*;
public class SumOfTwoArrayInSortedOrder {

	
public static void SumOfArray(int arr1[], int n, int arr2[], int m) {
	Vector<Integer> ans = new Vector<Integer>();
	int i = n-1;
	int j = m-1;
	int carry = 0;
	while(i>=0 && j>=0) {
		int val1 = arr1[i];
		int val2 = arr2[j];
		int sum = val1 + val2 + carry;
		carry = sum/10;
		sum = sum%10;
		i--;
		j--;
//		System.out.print(sum + " ");
		ans.add(sum);
	}
	
	while(i>=0) {
		int sum = arr1[i] + carry;
		carry = sum/10;
		sum = sum%10;
		i--;
//		System.out.print(sum + " ");
		ans.add(sum);
	}
	while(j>=0) {
		int sum = arr2[j] + carry;
		carry = sum/10;
		sum = sum%10;
		j--;
//		System.out.print(sum + " ");
		ans.add(sum);
	}
	
	while(carry != 0) {
		int sum = carry;
		carry = sum/10;
		sum = sum%10;
//		System.out.print(sum + " ");
		ans.add(sum);
	}
	
	for(int p=ans.size()-1; p>=0 ;p++) {
		System.out.print(ans.get(p) + " ");
	}
}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print(" Size of First Array : ");
		int n = s.nextInt();
		int arr1[] = new int[n];
		System.out.print("Enter element in first array : ");
		for(int i=0;i<n;i++) {
			arr1[i] = s.nextInt();
		}
		
		System.out.print(" Size of Second Array : ");
		int m = s.nextInt();
		int arr2[] = new int[m];
		System.out.print("Enter element in Second array : ");
		for(int i=0;i<m;i++) {
			arr2[i] = s.nextInt();
		}
		
		SumOfArray(arr1, n, arr2, m);
	}

}
