package Assignment6;

public class Q1 {
	public static void main(String [] args) {
		MinHeap  h = new MinHeap(10);
		
		h.add(10);
		h.add(20);
		h.add(5);
		h.add(123);
		h.add(111);
		h.add(8);
		h.add(9);	
		h.add(15);
		
		int min = h.getMin();
		System.out.println("min : "+min);
		
		System.out.println("Deleted : "+h.delete(min));
		
		int min1 = h.getMin();
		System.out.println("min : "+min1);
		
	}
}




class MinHeap {
	private int [] arr;
	private int size;
	
	public MinHeap(int size) {
		this.size = 0;
		arr = new int[size];
	}
	
	public boolean isFull() {
		return size==arr.length-1;
	}
	
	public boolean isEmpty() {
		return arr[1] == 0;
	}
	
	public void add(int val) {
		size++;
		arr[size] = val;
		int ci = size;
		int pi = ci/2;
		
		while(pi>=1) {
			if(arr[pi]<arr[ci]) break;
			int temp  = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			
			ci =pi;
			pi = ci/2;
		}
	}
	
	public int delete(int val) {
		int min = arr[1];
		arr[1] = arr[size];
		size--;
		
		int pi = 1;
		int ci= pi * 2;
		
		while(ci<=size) {
			if((ci+1)<=size && arr[ci + 1] < arr[ci])
				ci = ci+1;
			if(arr[ci]>arr[pi]) break;
			
			int temp = arr[ci];
			arr[ci] = arr[pi];
			arr[pi] = temp;
			
			pi=ci;
			ci = pi*2;
		}
		
		return min;
	}
	
	
	int getMin() {
		return arr[1];
	}
	

}















