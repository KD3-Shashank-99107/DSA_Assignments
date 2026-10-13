package Que2;

public class Successor {
      class Node {
    	  int data;
    	  Node left;
    	  Node right;
      }
      
      Node root;
      
	
	public int findSuccessor(int key) {
   	 Node trav = root;
   	 Node parent = null;
   	 while(trav != null) {
   		 if (trav.data == key) {
    	 		break;
    	 	} else {
    	 		parent = trav;
    	 		if (trav.data > key) {
    	 			trav = trav.left;
    	 		} else {
    	 			trav = trav.right;
    	 		}
    	 	}
   	 }
   	 

   	 
   		 Node succ = trav.right;
   		 while(succ.left != null) {
   			 succ=succ.left;
   		 }
   	 
   	 return succ.data;
    }
     }
