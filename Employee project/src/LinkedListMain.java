import java.util.Collection;
import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.addFirst(new Employee(1 , "Shashank" , 50000.100));
		list.addFirst(new Employee(2 , "Sachin" , 20000.100));
		list.addFirst(new Employee(3 , "Sudarshan" , 30000.100));
		list.addFirst(new Employee(4 , "Anuj" , 40000.100));
		list.displayFirst();
		int choice;
		
		do {
			System.out.println("Enter choice : ");
			System.out.println("1.Add First");
			System.out.println("2.Add Last");
			System.out.println("3.Search Employee by ID");
			System.out.println("4.Delete Employee by ID");
			System.out.println("5.Update salary of Employee");
			System.out.println("6.Sort by salary");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				Employee emp = new Employee();
				emp.acceptEmp();
				list.addFirst(emp);
				list.displayFirst();
				break;
			case 2:
				emp = new Employee();
				emp.acceptEmp();
				list.addLast(emp);
				list.displayFirst();
				break;
			case 3:
				System.out.println("Enter Employee id");
				int empId = sc.nextInt();
				list.searchEmployee(empId);
				break;
			case 4:
				System.out.println("Enter Employee id");
				empId = sc.nextInt();
				list.deleteEmployee(empId);
				list.displayFirst();
				break;
			case 5:
				System.out.println("Enter Employee id");
				empId = sc.nextInt();
				System.out.println("Enter new Salary");
				int salary = sc.nextInt();
				list.updateSalary(empId, salary);
				list.displayFirst();
				break;
			case 6:
				
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
