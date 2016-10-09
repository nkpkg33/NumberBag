
public class NumberBagTwoTester {
	
public static void main(String[] args){
		
		NumberBagTwo b = new NumberBagTwo(100);
		
		b.add(3);
		
		b.add(3);
		
		b.add(5);
		
		System.out.println("There are: " + b.getFreqFor(3) + " 3's");
		
	}

}
