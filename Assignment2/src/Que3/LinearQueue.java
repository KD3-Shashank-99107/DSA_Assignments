package Que3;
public class LinearQueue {
	private final int size;
	private int[] arr;
	private int rear;
	private int front;

	public LinearQueue(int size) {
		this.size = size;
		arr = new int[size];
		front = rear = 0;
	}

	public void offer(int value) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			rear = (rear) % size;
			arr[rear] = value;
			rear++;
		}
	}

	public int poll() {
		int temp = -1;
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			temp = arr[(front) % size];
			front = (front) % size;
			front++;
			if (rear == front) {
				rear = front = -1;
			}
		}
		return temp;
	}

	public int peek() {
		int temp = -1;
		if (isEmpty()) {
			System.out.println("Queue is empty");
		}
		temp = arr[(front) % size];
		return temp;
	}

	public boolean isEmpty() {
		return front == rear && rear == 0;
	}	

	public boolean isFull() {
		return (front == 0 && rear == size) || (front == rear && rear != 0) ;
	}

}
