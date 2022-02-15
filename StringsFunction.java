import java.util.Scanner;
public class StringsFunction {

	public static void main(String[] args) {
		
		//*********************String are in java are immutable
		//means we cannot change on string after we dec;ared a string
//		String str = "Suraj";
//		String str1 = " Raut";
//		String str2 = "Auraj";
//		String s = str.substring(2);
//		str = str.concat(str1);
//		System.out.println(str);
//		System.out.println(str.equals(str1));
//		System.out.println(str.compareTo(str2));
//		System.out.println(str.contains("aj"));
//		System.out.println(str.substring(2));//means which word want to start at first
//		System.out.println(s.length());
//		
//		String a="coding";
//		for(int i=2;i<5;i++)
//		{
//		    System.out.print(a.substring(i-2,i+1));
//		}
		
//		Scanner sT = new Scanner(System.in);
//		String str3 = sT.next();
//		String str4 = sT.nextLine();
		StringBuffer str = new StringBuffer("Suraj");
//		System.out.println(str3+" "+str3.length());
//		System.out.print(str4+" "+str4.length());
		
		str.setCharAt(0,'A');
		str.append("Raut");
		System.out.println(str);
		
	}

}
