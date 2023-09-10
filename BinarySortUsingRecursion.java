//Algorithm for binary search in a sorted array using recursion.
import java.util.*;
public class Day_005 {

	//Recursive method for binary search.
	static int binarySearch(int arr[] , int key , int start , int end){
		
		int mid = (start + end)/2;
		
		if(arr[mid] == key) return mid;
		
		if(arr[mid] > key) return binarySearch(arr , key , start , mid -1);
		
		if(arr[mid] < key) return binarySearch(arr , key , mid+1 , end);
		
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		//Taking the element for search.
		int key = sc.nextInt();
		//Calling Recursive method
		System.out.print(binarySearch(arr , key , 0 , arr.length-1));
	}

}
