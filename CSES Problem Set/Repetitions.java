import java.util.*;
public class Repetitions
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		char temp[]=s.toCharArray();
		int i=0;
		int maxLength=Integer.MIN_VALUE;
		int n=temp.length;
		if(n==1)
		{
			System.out.println(1);
		}
		else
		{
			while(i<temp.length-1)
			{
				int len=1;
				while(temp[i]==temp[i+1]){
					len+=1;
					i+=1;
					if(i==temp.length-1)
					{
						break;
					}
				}
				if(len>maxLength)
				{
					maxLength=len;
				}
				i+=1;
			}
			System.out.println(maxLength);
		}
	}
}
