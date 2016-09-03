import java.util.HashMap;

// Check if 2 strings are permutations of each other
public class string_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		String b = "AbcHe";
		HashMap<Character,Integer> table = new HashMap<Character,Integer>();
		
		// to check if a is a permutation of b
		
		//check lengths
		if(a.length()!=b.length())
		{
			System.out.println("The 2 strings are not permutations");
		}
		else
		{
				for(int i=0;i<a.length();i++)
			{
				int value = 1;
				if(!(table.containsKey(a.charAt(i))))
				{
					table.put(a.charAt(i), value);
				}
				else
				{
					table.put(a.charAt(i),table.get(a.charAt(i))+1);					
				}
			}
			
			System.out.println(table);
		}
		// code to check 2nd string 
		for(int i=0;i<a.length();i++)
		{
			
			if(!(table.containsKey(b.charAt(i))))
			{
				System.out.println("Not permutations");
				break;
			}
			else
			{
				table.put(b.charAt(i),table.get(b.charAt(i))-1);					
			}
		}
		
		System.out.println(table);
		
		int flag = 1;
		for(Character key:table.keySet())
		{
		if(table.get(key)!= 0)
		{
			flag = 0;
			System.out.println("Not permuation");
			break;
		}
		 
		}
		if(flag == 1)
		{
			System.out.println("Permuatation");
		}
		
	
		
		

	}

}
