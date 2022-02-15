import java.util.Scanner;
public class CheckPalindromeOnString {

	public static boolean isPalindrome(String str) {
		boolean p = false;
        String reverse= "";
//		for(int i=str.length()-1;i>=0;i--)
//        {
//            reverse = reverse + str.charAt(i);
//        }
		int i=0;
		int j = str.length()-1;
		while(i<j)
		{
			if(str.charAt(i) != str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.print(isPalindrome(str));

	}

}
