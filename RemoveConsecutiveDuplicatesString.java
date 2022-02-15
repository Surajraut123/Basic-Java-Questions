import java.util.Scanner;
public class RemoveConsecutiveDuplicatesString {

	public static String removeConsecutiveDuplicates(String str) {
		int a= str.length();
		
        String p = "";
        int c;
        for(int i =0 ;i<=a;i++)
        {
        	int q=0;
        	int j=i;
        	while(str.charAt(j)==str.charAt(i))
        	{
        		i++;
        		q++;
        	}
        	if(q==0 || q==1)
            {
            	p = p + str.charAt(j);
            }
        }
        for(int i=0;i<a-1;i++)
        {
        	
        	c=0;
        	int j=i;
        	
            while(str.charAt(j) == str.charAt(i+1))
            {
            	c++;
            	i++;
            	if(i==a-1)
            	{
            		break;
            	}
            }
            if(c==0 || c==1)
            {
            	p = p + str.charAt(j);
            }
        }
        return p;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.print(removeConsecutiveDuplicates(str));

	}

}
