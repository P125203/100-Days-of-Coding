//Algorithm for counting total no. of chars in  a string.
import java.util.*;
public class Day_012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int count = 0;
		for(int i = 0 ; i < s.length() ; i++) {
			if(i < s.length())
				count++;
		}
		System.out.print(count);
	}
}
