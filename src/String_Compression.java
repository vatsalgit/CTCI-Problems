
public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "aaaabb";
		StringBuilder str = new StringBuilder();
		int z=0;
		int count = 1;
		int flag = 1;
		while(z<x.length())
		{
			
			if( x.charAt(z+1)==x.charAt(z))
			{
				
				count++;
				z++;				
			}
			else
			{
				flag=0;
				str.append(x.charAt(z)+""+count);
				count=1;
				z++;
			}
		}
		if(flag==1)
		{
			System.out.println(x.charAt(z-1)+""+count);
		}
		String c = str.length()<x.length()? str.toString() : x;
		System.out.println(c);
	}

}
