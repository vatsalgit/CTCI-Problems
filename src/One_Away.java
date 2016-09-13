import java.util.Scanner;

public class One_Away {
	public boolean check(String s1,String s2)
	{
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		int i=0,j=0,count=0;
		while(i<s1.length() && j<b.length)
		{
			if(count<2)
			{
			if(a[i]==b[j])
			{
				i++;
				j++;
			}
			else
			{
				count++;
				i++;
			}
			
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		One_Away x =new One_Away();
		System.out.println("Enter the 2 strings");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		if(str1.equals(str2))
		{
			System.out.println("Yes");
		}
		else
		{
			//check lengths
			if(Math.abs(str1.length()-str2.length())>1)
			{
				System.out.println("No");
			}
			else
			{
				if(str1.length()>str2.length())
				{
					boolean get=x.check(str1, str2);
					System.out.println(get);
				}
				else
				{
					boolean get=x.check(str2, str1);
					System.out.println(get);
				}
				// add function for replace if lengths are equal
				
			}
		}
		
	}

}
