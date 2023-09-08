//Algorithm for selection sort
import java.util.*;
public class Day_003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();				//Taking array size from user.
		int arr[] = new int[n];
		
		//Taking array input from user.
		for(int i = 0 ; i < n ; i++ ) {
			arr[i] = sc.nextInt();
		}
		
		//Sorting the array in ascending order using selection sort.
		for(int i = 0 ; i < n ; i++) {
			int minindex = i;
			for(int  j = i+1 ; j < n ; j++) {
				if(arr[j] < arr[minindex]) {
					minindex = j ;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minindex];
			arr[minindex] = temp;
		}
		
		//Loop for printing sorted array.
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
