package linkedlist;

public class Main {

	public static void main(String[] args) {
		/**
		 * object of class linkedlist created to invoke the methods
		 	to add values using methods
		 	to display the values using methods
		 	*/
		toStart();
		LinkedList list = new LinkedList();
		list.toPush(70);
		list.toPush(30);
		list.toPush(56);
		list.show();
		
	}
	public static void toStart() {
		System.out.println("Welcome to the LinkedList Program");
	}
	}


