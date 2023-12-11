import java.util.*;

class knap{
	double profit;
	double weight;
	knap(double profit , double weight){
		this .profit = profit;
		this.weight = weight;
	}
}

public class knapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		knap d1 = new knap(sc.nextDouble() , sc.nextDouble());
		knap d2 = new knap(sc.nextDouble() , sc.nextDouble());
		knap d3 = new knap(sc.nextDouble() , sc.nextDouble());
		
		double sackWeight = sc.nextDouble();
		
		Hashtable< Double , knap> ht = new Hashtable<>();
		
		double one = d1.profit / d1.weight;
		double two = d2.profit / d2.weight;
		double three = d3.profit / d3.weight;
		
		ht.put( one , d1);
		ht.put( two , d2);
		ht.put( three , d3);
		
		double result = 0;
		Map< Double , knap> tm = new TreeMap<>(Collections.reverseOrder());
		tm.putAll(ht);
		
		for(Map.Entry< Double , knap> temp : tm.entrySet()) {
			double key = temp.getKey();
			knap value = temp.getValue();
			
//			System.out.print(key + " : ");
//			System.out.print(value.profit + " " + value.weight);
//			System.out.println();
			
			if(value.weight <= sackWeight) {
				result += value.profit;
				sackWeight -= value.weight;
			}
			if(sackWeight <= value.weight && sackWeight >= 0) {
				result += sackWeight*(value.profit/value.weight);
				sackWeight -= value.weight;
			}
			
		}
//		System.out.println(d1.profit+" "+ d1.weight +" " + one);
//		System.out.println(d2.profit+" "+ d2.weight +" " + two);
//		System.out.println(d3.profit+" "+ d3.weight +" " + three);
		System.out.println(result);
		
	}

}
