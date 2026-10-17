package Assignment7;

public class Q1 {
	public static void selection(int [] arr) {
		int n = arr.length;
		for(int i = 0; i<n-1; i++) {
		int min = i;
			for(int j = i+1; j<n; j++) {
				if(arr[min]>arr[j]) {
					min = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	
	
	
	public static void bubble(int [] arr) {
		int n = arr.length;
		
		for(int i = 1; i<n; i++) {
			for(int j = 0; j<n-i; j++) {
				if(arr[j+1]<arr[j]) {
					int temp  = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String [] args) {
		int [] arr = {44, 11, 55, 22, 66, 33};
		
		System.out.print("Before Sorting : ");
		for(int ele : arr) {
			System.out.print(ele+ " ");
		}
		
		selection(arr);
		System.out.println();
		System.out.print("Selection Sort : ");
		for(int ele : arr) {
			System.out.print(ele+ " ");
		}
	}
}


