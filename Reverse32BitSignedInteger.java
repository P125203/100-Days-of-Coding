//Algorithm for reversing an 32 bit signed integer.
import java.util.*;
public class Day_009 {
	
	public static int reverse(int x) {
        long n = 0;
        while(x != 0){
            n = (n * 10) + (x % 10);
            x = x / 10;
        }
        return (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) ? 0 : (int) n;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println(reverse(x));
	}
}
