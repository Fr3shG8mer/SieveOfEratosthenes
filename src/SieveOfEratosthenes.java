
public class SieveOfEratosthenes {
	static int maxVal = 100;
	static boolean[] crossedOut = new boolean[maxVal + 1];

	public void sieve(boolean[] array) {
		
		for (int i = 0; i < array.length; i++) {
			if (i != 0 && i != 1) {
				array[i] = false;	
			} else {
				array[i] = true;
			}
		}
		
		for (int i = 2; i <= maxVal; i++) {
			if (!array[i]) {
				for (int j = 2; j <= maxVal / i; j++) {
					array[j * i] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
		
		sieveOfEratosthenes.sieve(crossedOut);
		
		for (int i = 0; i <= maxVal; i++) {
			if (!crossedOut[i] && i != 0 && i != 1) {
				System.out.print(i + " ");
			}
		}
	}
}
