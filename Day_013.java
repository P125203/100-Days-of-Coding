//Algorithm for printing reverse of a number.
import java.util.*;
public class Day_013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = 0;
		int n = sc.nextInt();
		while (n != 0) {
			m = (m*10) + (n%10);
			n = n/10;
		}
		System.out.println();
	}
}