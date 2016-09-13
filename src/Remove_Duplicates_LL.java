import java.util.LinkedList;

public class Remove_Duplicates_LL {
	public static void main(String args[])
	{
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(2);
		l.add(2);
		l.add(5);
		l.add(1);
		l.add(2);
		l.add(2);
		int c=0;
		
		while(c<l.size())
		{
		System.out.print(l.get(c)+"=>");
		c++;
		}
		int k=0;
		while(k<l.size())
		{
			int i=k+1;
			int j=i+1;
			
			while(j<l.size() && i<l.size())
			{
				 
				if(l.get(j)==l.get(k))
				{
					l.remove(j);
					j=j-2;
					
				}
				if(l.get(i)==l.get(k))
				{
					l.remove(i);
					i=i-2;
				}				
				
				i+=2;
				j+=2;
				
			}
		
			k++;
		}
		
		if(l.get(l.size()-1)==l.get(l.size()-2))
			l.remove(l.size()-1);
		
		int x=0;
		System.out.println("\n New Linked List");
		while(x<l.size())
		{
		System.out.print(l.get(x)+"=>");
		x++;
		}
		
	}
	
	
	
}
