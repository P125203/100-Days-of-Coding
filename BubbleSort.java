//Algorithm for bubble sort user input.
import java.util.*;
public class Day_001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	//Taking array size from user. 
		int arr[]=new int[n];
		
		//Taking array input from user.
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		//Sorting the array in ascending order using bubble sort.
		for(int i = 0 ; i < n ; i++) {
			for(int j = i+1 ; j < n ; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
//		System.out.println(Arrays.toString(arr));	//Arrays method to print array.
		
		//Loop for printing sorted array.
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
