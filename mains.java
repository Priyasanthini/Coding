package tutorials;
import java.util.*;
public class mains {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
                int [] result=new int[t];
		for(int i=0;i<t;i++)
		{
			String A=s.next();
			String B=s.next();
			result[i]=check(A,B);
                }
                for(int i=0;i<t;i++)
                {
			if(result[i]!=0)
			System.out.println("YES");
			else
			System.out.println("NO");
		}
	}
	public static int check(String A, String B)
	{
		int ans=0;
		int [] arrB=new int[26];
		int [] arrA=new int[26];
		int i=0;
		for( i=0;i<B.length();i++)
		{
			char b= B.charAt(i);
			arrB[b-'a']++;
			char a= A.charAt(i);
			arrA[a-'a']++;
		}
		if(isSame(arrA, arrB))
			ans++;
		int j=0;
		while(i<A.length())
		{
			char ai=A.charAt(i);
			char aj=A.charAt(j);
			arrA[aj-'a']--;
			arrA[ai-'a']++;
			if(isSame(arrA, arrB))
				ans++;
			i++;
			j++;
		}
		
		
		return ans;
	}
	public static boolean isSame(int[]a, int []b)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}

}
