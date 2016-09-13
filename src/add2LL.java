
public class add2LL extends ListNode {

	public static ListNode addlists(ListNode a,ListNode b)
	{
		ListNode temp=null,prev=null,res=null;
		int carry =0,sum;
		 while (a != null || b != null) //while both lists exist
	        {
	            // Calculate value of next digit in resultant list.
	            // The next digit is sum of following things
	            // (i)  Carry
	            // (ii) Next digit of first list (if there is a next digit)
	            // (ii) Next digit of second list (if there is a next digit)
	            sum = carry + (a != null ? a.data : 0)
	                    + (b != null ? b.data : 0);
	 
	            // update carry for next calulation
	            carry = (sum >= 10) ? 1 : 0;
	 
	            // update sum if it is greater than 10
	            sum = sum % 10;
	 
	            // Create a new node with sum as data
	            temp = new ListNode(sum);
	 
	            // if this is the first node then set it as head of
	            // the resultant list
	            if (res == null) {
	                res = temp;
	            } else // If this is not the first node then connect it to the rest.
	            {
	                prev.next = temp;
	            }
	 
	            // Set prev for next insertion
	            prev = temp;
	 
	            // Move first and second pointers to next nodes
	            if (a != null) {
	                a = a.next;
	            }
	            if (b != null) {
	                b = b.next;
	            }
	        }
	 
	        if (carry > 0) {
	            temp.next = new ListNode(carry);
	        }
	 
	        // return head of the resultant list
	        return res;
	    }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		a.AddNewNode(2);
		a.AddNewNode(3);
		ListNode b = new ListNode(9);
		b.AddNewNode(8);
		b.AddNewNode(7);
		b.AddNewNode(8);
		ListNode c = add2LL.addlists(a,b);
		a.display();
		System.out.println();
		b.display();
		System.out.println();
		c.display();
		
	}

}
