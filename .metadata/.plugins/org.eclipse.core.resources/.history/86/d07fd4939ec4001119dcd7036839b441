package DoubleLinearLinkedList;
import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		int choice;

		do {
			System.out.println("Enter choice : ");
			System.out.println("1.Add First");
			System.out.println("2.Add Last");
			System.out.println("3.Add Position");
			System.out.println("4.Delete First");
			System.out.println("5.Delete Last");
			System.out.println("6.Delete Position");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter value to add");
				int value = sc.nextInt();
				list.addFirst(value);
				list.displayFirst();
				list.displayLast();
				break;
			case 2:
				System.out.println("Enter value to add");
				value = sc.nextInt();
				list.addLast(value);
				list.displayFirst();
				list.displayLast();
				break;
			case 3:
				System.out.println("Enter value to add");
				value = sc.nextInt();
				System.out.println("Enter position");
				int pos = sc.nextInt();
				list.addPosition(value,pos);
				list.displayFirst();
				list.displayLast();
				break;
			case 4:
				list.deleteFirst();
				list.displayFirst();
				list.displayLast();
				break;
			case 5:
				list.deleteLast();
				list.displayFirst();
				list.displayLast();
				break;
			case 6:
				System.out.println("Enter position to delete");
				pos = sc.nextInt();
				list.deletePosition(pos);
				list.displayFirst();
				list.displayLast();
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		} while (choice != 0);
//		list.addLast(10);
//		list.addLast(20);
//		list.addLast(30);
//		list.addLast(40);
//		
//		list.addPosition(100, 100);
//		list.deletePosition(2);
////		list.deleteFirst();
////		list.deleteLast();
////		list.deleteAll();
//		
//		list.display();
	}

}
