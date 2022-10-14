package parallelarrays;

public class Integers2 {
	public static void main(String[] args) {
		// creating empty array
		double [] powers = new double[5];
		
		// creating for loop that increments by the powers of 2
		for(int i = 0; i < powers.length; i++) { 
			powers[i] = Math.pow(2, i + 1);

		}
		System.out.println("");// creating space
		// display the array 
		for(double x : powers) {
			System.out.println(x);
		}
		System.out.println(""); // creating space
		// displaying new array
		for(int x = powers.length - 1; x >= 0; x--) {
			System.out.println(powers[x]);
		}
		
	} 

}
