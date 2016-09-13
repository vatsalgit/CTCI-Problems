public class inorder_successor
{
	public static void main(String args[])
	{
		BinarySearchTree tree = new BinarySearchTree();
		BSN root=null;
		root = tree.insert(root, 20);
        root = tree.insert(root, 8);
        root = tree.insert(root, 22);
        root = tree.insert(root, 4);
        root = tree.insert(root, 12);
        root = tree.insert(root, 10);
        root = tree.insert(root, 14);
        BSN current = tree.Inorder_Successor(root);
        if(current!=null)
        System.out.println(current.data);
        
        	
	}
}

class BSN {
 
    int data;
    BSN left;
	BSN right, parent;
 
    BSN(int d)
    {
        data = d;
        left = right = parent = null;
    }
}
 
class BinarySearchTree 
{
 
    static BSN head;
 
    /* Given a binary search tree and a number, 
     inserts a new node with the given number in 
     the correct place in the tree. Returns the new 
     root pointer which the caller should then use 
     (the standard trick to avoid using reference 
     parameters). */
    BSN insert(BSN left, int data) {
 
        /* 1. If the tree is empty, return a new,     
         single node */
        if (left == null) {
            return (new BSN(data));
        }
        else
        {
 
            BSN temp = null;
             
            /* 2. Otherwise, recur down the tree */
            if (data <= left.data) {
                temp = insert(left.left, data);
                left.left = temp;
                temp.parent = left;
 
            } else {
                temp = insert(left.right, data);
                left.right = temp;
                temp.parent = left;
            }
 
            /* return the (unchanged) node pointer */
            return left;
        }
    }
    
    BSN Inorder_Successor(BSN node)
    {
    	if(node.right!=null)
    	{
    		return findMin(node.right); 
    	}
    	
    	BSN papa =node.parent;
    	while(papa!=null && node==papa.right)
    	{
    		node = papa;
    		papa=papa.parent;
    	}
    	return papa;
    }
    BSN findMin(BSN node)
    {
    	while(node.left!=null)
    	{
    	node = (node.left);
    	}
    	return node;
    }
    
}


 
