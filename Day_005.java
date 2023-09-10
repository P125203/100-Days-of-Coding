import java.util.*;
public class Day_005 {
	
	static int binary(int arr[] , int key , int start , int end){
		
		int mid = (start + end)/2;
		
		if(arr[mid] == key) return mid;
		
		if(arr[mid] > key) return binary(arr , key , start , mid -1);
		
		if(arr[mid] < key) return binary(arr , key , mid+1 , end);
		
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int key = sc.nextInt();
		
		System.out.print(binary(arr , key , 0 , arr.length-1));

	}

}
