//Algorithm for Length of longest substring.
import java.util.*;
public class Day_002 {
	
	    public static int lengthOfLongestSubstring(String s) {
	        int length = 0;
	        for(int i = 0 , j = 0 ; i < s.length() ; i++){
	            int index =  s.indexOf(s.charAt(i) , j);
	            if(index != i){
	                j = index+1;
	            }
	            length = Math.max(length , i-j+1);                    
	        }
	        return length;
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(lengthOfLongestSubstring(s));

	}
}
