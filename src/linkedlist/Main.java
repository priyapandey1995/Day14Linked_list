package linkedlist;

public class Main {

	public static void main(String[] args) {
		/**
		 * object of class linkedlist created to invoke the methods
		 	firstly,56 is added and then append 30 and then 70
		 	to display the values using methods
		 	*/
		toStart();
		LinkedList list = new LinkedList();
		list.add(56);
		list.toAddNodeAtFirst(30);
		list.toAddNodeAtFirst(70);
		list.show();
		
	}
	public static void toStart() {
		System.out.println("Welcome to the LinkedList Program");
	}
	}


