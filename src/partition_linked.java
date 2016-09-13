
public class partition_linked extends ListNode{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode original = new ListNode(3);
		int partition = 5;
		original.AddNewNode(5);
		original.AddNewNode(8);
		original.AddNewNode(5);
		original.AddNewNode(10);
		original.AddNewNode(2);
		original.AddNewNode(1);
		
		original.display();
		
		
		ListNode less=null,more=null; 
		
		
		while(original!=null)
		{
			if(less==null && original.data<partition)
			{
				less =  new ListNode(original.data);
			}
			else if(more==null && original.data>=partition)
			{
				more =  new ListNode(original.data);
			}
			
			else if(less!=null && original.data<partition)
			{
				less.AddNewNode(original.data);
			}
			else if(more!=null && original.data>=partition)
			{
				more.AddNewNode(original.data);
			}
			
			original=original.next;
			
		}
		
		
		System.out.println("\nLeft");
		less.display();
		System.out.println("\nRight");
		more.display();
		
		ListNode pointer=less;
		while(pointer.next!=null)
		{
			pointer=pointer.next;
		}
		pointer.next = more;
		System.out.println("\nMerged");
		less.display();
		
		
		

	}

}
