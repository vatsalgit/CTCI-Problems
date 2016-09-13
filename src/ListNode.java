
public class ListNode {
	
	int data;
	ListNode next=null;
	ListNode()
	{
		this.next=null;
	}
	ListNode(int d)
	{
		this.data=d;
	}
	public void AddNewNode(int data)
	{
		ListNode newNode = new ListNode(data);
		ListNode pointer = this;
		while(pointer.next!=null)
		{
			pointer = pointer.next;
		}
		pointer.next=newNode;
	}
	public void display()
	{
		ListNode pointer=this;
		while(pointer!=null)
		{
			System.out.print(pointer.data+"=>");
			pointer=pointer.next;
		}
	}
	public ListNode DeleteNode(int data)
	{
		ListNode pointer = this;
		if(pointer.data==data)
		{
			return pointer.next; //if node to be deleted is first node
		}
		while(pointer.next!=null)
		{
			if(pointer.next.data==data)
			{
				pointer.next=pointer.next.next;
				return this;
			}
			pointer=pointer.next;
		}
		return this;
		
		
		
		
	}
	

	
}
