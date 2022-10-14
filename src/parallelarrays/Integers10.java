package parallelarrays;

public class Integers10 {
	public static void main(String[] args) {
		// declaring the array
		int[] tenMult = {10, 20, 30, 40, 50, 60};
		
		// displaying array using for loop 
		for (int x : tenMult) {
			System.out.println(x);
		}
		// creating a blank space 
		System.out.println("");
		
		// now displaying the array backwards
		for (int x = tenMult.length - 1; x >= 0; x-- ) {
			System.out.println(tenMult[x]);
			
		}
		
		// creating values for summing 
		int sum = 0;
		
		// variables for the mean
		int count = 0;
				
		// mean 
		int mean = 0;
		
		for (int x : tenMult) {
			sum+=x;
			count++;
		}
		// creating a space between the number
		System.out.println("");
		// displaying the sum 
		System.out.println(sum);
		
		
		// calculating the mean avg
		mean = sum / count;
		
		// displaing mean 
		System.out.println(mean);
		
		
		
		
		
		
		
	}

}
