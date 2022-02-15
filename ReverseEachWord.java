
public class ReverseEachWord {

	public static String reverseEachWord(String str)
	{
		String ans = "";
		int currentWordStart=0;
		int i=0;
//		int i = str.length();
		for(;i<str.length();i++)
		{
			if(str.charAt(i) == ' ')
			{
				int currentwordend = i;
				String reverseword = "";
//				for(int j=currentwordend;j>=currentWordStart;j--)
				for(int j=currentwordend;j>=currentWordStart;j--)
				{
//					reverseword = str.charAt(j)+reverseword;
					reverseword = reverseword+str.charAt(j);
				}
				ans+= reverseword+" ";
//				currentWordStart = i+1;
				currentWordStart = i-1;
			}
		}
		int currentwordend = i;
		String reverseword = "";
//		for(int j=currentWordStart;j<=currentwordend;j++)
		for(int j=currentwordend;j>=currentWordStart;j--)
		{
//			reverseword = str.charAt(j)+reverseword;
			reverseword = reverseword+str.charAt(j);
		}
		ans+= reverseword;
		return ans;
		
	}
	
	public static void main(String[] args) {
		String abc = "abc def efg";
		System.out.print(reverseEachWord(abc));
	}

}
