import java.util.*;
import java.lang.Math;
public class MonkArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,m;
		String s[]=new String[2];
		for(int i=0;i<2;i++)
		{
			s[i]=sc.next();
		}
		n=Integer.parseInt(s[0]);
		m=Integer.parseInt(s[1]);
		
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			String s1[]=new String[m];
			for(int j=0;j<m;j++)
			{
				s1[j]=sc.next();
				a[i][j]=Integer.parseInt(s1[j]);
			}
		}
		int x;
		int min=Integer.MAX_VALUE;
		boolean flag=false;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<m;j++)
			{
				int key=a[i][j];
				for(int k=0;k<m;k++)
				{
					x=Math.abs(a[i+1][k]-key);
					if(min>x)
					{
						min=x;
					}
					if(min==0)
					{
						flag=true;
						break;
					}
				}
				if(flag)
				{
					break;
				}
			}
			if(flag)
			{
				break;
			}
		}
		
		System.out.println(min);
	}
}
