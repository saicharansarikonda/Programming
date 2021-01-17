//Longest Common Subsequence
import java.util.*;
public class LCSubsequence
{
	
	public static int LCS(int x,int y,String a,String b)
	{
		int dp[][]=new int[x+1][y+1];
		int i=0,j=0;
		for(i=0;i<=a.length();i++)
		{
			for(j=0;j<=b.length();j++)
			{
				if(i==0 || j==0)
				{
					dp[i][j]=0;
				}
				else if(a.charAt(i-1)==b.charAt(j-1))
				{
					dp[i][j]=1+dp[i-1][j-1];
				}
				else
				{
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		
		return dp[a.length()][b.length()];
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.println("Enter size of both strings");
		String s[]=new String[2];
		for(int i=0;i<2;i++)
		{
			s[i]=sc.next();
		}
		x=Integer.parseInt(s[0]);
		y=Integer.parseInt(s[1]);
		
		String a,b;
		System.out.println("Enter first string");
		a=sc.next();
		System.out.println("Enter second string");
		b=sc.next();
		
		System.out.println("Common Length is "+LCS(x,y,a,b));
		
	}
}
