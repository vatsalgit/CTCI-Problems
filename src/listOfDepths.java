import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data = data;
		this.left = null;
		this.right =null;
	}
}
class ListNode{
	int data;
	ListNode next;
	public ListNode(int data){
		this.data = data;
		this.next = null;
	}
}
public class listOfDepths {
	
		public static void main (String[] args) throws java.lang.Exception
		{
			Node root = new Node(5);
			root.left = new Node(10);
			root.left.left = new Node(20);
			root.left.left.left = new Node(25);
			root.left.left.left.left = new Node(30);
			root.left.left.left.left.left = new Node(35);

			listOfDepths i  = new listOfDepths();
			//i.levelOrder(root);
			i.levelOrderQueue(root);
			System.out.println(i.isBalanced(root));
		}
		ArrayList<ListNode> al =new ArrayList<ListNode>();
		public void levelOrderQueue(Node root)
		{
			Queue q = new LinkedList();
			if(root==null)
				return;
			else
			{
				q.add(root);
				
				while(q.size()>0)
				{
					int levelNodes=q.size();
					ListNode head = null,current = null;
					while(levelNodes>0)
					{
						Node n = (Node) q.remove();
						ListNode ln =  new ListNode(n.data);
						if(head==null)
						{
							head = ln;
							current = ln;
						}
						else
						{
							current.next=ln;
							current = current.next;
						}
						if(n.left!=null)
							q.add(n.left);
						if(n.right!=null)
							q.add(n.right);
						levelNodes--;
						
					}
					al.add(head);
					
				}
				display(al);
				
			}
			}
		
public void display(ArrayList al){
	Iterator it = al.iterator();
	while(it.hasNext()){
	  ListNode head = (ListNode) it.next();
	  //System.out.print("=>" + head.data);
	  while(head!=null){
		  System.out.print("=>" + head.data);
		  head = head.next;
	  }
	  System.out.println("");
	}
	
	}
int height(Node node)
{
   /* base case tree is empty */
   if(node == null)
       return 0;
 
   /* If tree is not empty then height = 1 + max of left
      height and right heights */
   return 1 + Math.max(height(node.left), height(node.right));
} 
int isBalanced(Node root)
{
   int lh; /* for height of left subtree */
   int rh; /* for height of right subtree */ 
 
   /* If tree is empty then return true */
   if(root == null)
    return 1; 
 
   /* Get the height of left and right sub trees */
   lh = height(root.left);
   rh = height(root.right);
 
   if( Math.abs(lh-rh) <= 1 && isBalanced(root.left)==1 && isBalanced(root.right)==1)
     return 1;
 
   /* If
    *  we reach here then tree is not height-balanced */
   return 0;
}




}


