import java.util.Scanner;

public class StringUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean ASCII[] = new boolean [256];
		System.out.println("Enter the String");
		String value = sc.nextLine();
		
		int i = 0;
		int flag = 0;
		while(i<value.length())
		{
			int x = value.charAt(i);
			if(ASCII[x] == true)
			{
				System.out.println("String does not have unique characters");
				flag = 1;
				break;
			}
			else
			{
				ASCII[x]=true;
			}
			i++;
		}
		if(flag == 0)
		{
			System.out.println("All characters are unique");
		}
				
	}

}
