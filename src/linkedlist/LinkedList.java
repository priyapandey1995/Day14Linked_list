package linkedlist;

public class LinkedList {
	     /**
	     * @author pande
	     *This class will generally show the implemenation of linked list
		 * where in the method is used to add the elements into the list and show method is used 
		 * to display the list data
	     */
	      
		
		//refer to the first Node
		Node head;
		
		/**
		 
		 * method is used to add the elements
		*/
		public void add(int data) {
			//node is created
			Node node = new Node(data);
			//data is inserted into the node
			node.data = data;
			node.next = null;//next node is null
			
			//checking if the head is null if it is null we dont have any nodes in the list
			if(head == null) {
				head = node;
			}
			else {
				Node n = head;//traverse between the next node ,hence n is taken
				while(n.next!=null) {
					n = n.next;
				}
				n.next = node;//next element gets replaced
				
				
			}
		}
		/**
		 * 
		 * show method is used to print all the elements in list
		 */
		public void show() {
			Node node = head;
			while(node.next!=null) {
				System.out.println(node.data);
				node = node.next;
			}
			//for the last element we have to print at last after the loop
			System.out.println(node.data);
		}
	}



