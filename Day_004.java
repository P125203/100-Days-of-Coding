import java.util.*;
public class Day_004 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int n = sc.nextInt();		//Taking array size from user.
		int arr[] = new int[n];
		
		//Taking array input from user.
		for(int i = 0 ; i < n ; i++ ) {
			arr[i] = sc.nextInt();
		}
		
		//Sorting the array in ascending order using insertion sort.
		int temp;
		for(int i = 1 ; i < n ; i++ ) {
			temp  = arr[i];
			int j = i;
			while( j > 0 && temp < arr[j-1] ) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
		
		//Loop for printing sorted array.
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
