//Longest Substring with out repeating characters
import java.util.*;
public class LongSubString
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		int max=Integer.MIN_VALUE;
		int startIndex=0,currIndex=0;
		
		HashSet<Character> set = new HashSet<>();
		
		while(currIndex<s.length())
		{
			if(!set.contains(s.charAt(currIndex)))
			{
				set.add(s.charAt(currIndex));
				max=Math.max(max,set.size());
				currIndex+=1;
			}
			else
			{
				set.remove(s.charAt(startIndex));
				startIndex+=1;
			}
		}
		
		System.out.println(max);
		
	}
}
