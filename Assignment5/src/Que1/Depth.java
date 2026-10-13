package Que1;



public class Depth {
	class Node {
		int data;
		Node left;
		Node right;
	}
	Node root;
	
	public Node search(int key) {
		Node trav = root;
		while (trav != null) {
			if (trav.data == key) {
				return trav;
			} else {
				if (trav.data > key) {
					trav = trav.left;
				} else {
					trav = trav.right;
				}
			}
		}
		return null;
	}
	
	 public int height(Node trav) {
    	 if(trav == null) {
    		 return -1;
    	 }
    	 
    	 int hl = height(trav.left);
    	 
    	 int hr = height(trav.right);
    	 
    	 int max = hl>hr ? hl : hr;
    	 return max +1;
     }
     
     public int findDepthOfGivenNode(int key) {
    	  Node trav = search(key);
    	  return height(trav);
     }
}
