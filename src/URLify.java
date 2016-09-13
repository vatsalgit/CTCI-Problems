import java.util.Scanner;

public class URLify {
	
	public char[] getURL(char[] s,int spaces)
	{
		if(spaces==0)
		{
			return s;
		}
		else
		{
			int new_length = s.length + (2*spaces);
			char url[] = new char[new_length];
			for(int x=0;x<s.length;x++)
			{
				url[x]=s[x];
			}
			int z = s.length-1;
			while(z>0)
			{
				if(url[z]==' ')
				{
					int j = s.length-1;
					while(j>z)
					{
						url[j+2]=url[j];
						j--;
					}
					url[z]='%';
					url[z+1]='2';
					url[z+2]='0';
					z=z-3;
				}			
				
				z--;
			}
			
			
			return url;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URLify obj = new URLify();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string and its true length");
		String str = sc.nextLine();
		char s[] = str.toCharArray();
		
		int spaces = 0;
		// count number of spaces
		for(int i=0;i<str.length();i++)
		{
			if(s[i] == ' ')
			{
				spaces++;
			}
		}
		System.out.println(obj.getURL(s,spaces));
		
		
		

	}

}
