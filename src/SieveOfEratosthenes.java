
public class SieveOfEratosthenes {
	static int maxVal = 100;
	static boolean[] crossedOut = new boolean[maxVal + 1];

	public void sieve(boolean[] array, int maxVal) {
		array[0] = true;
		array[1] = true;
		
		for (int i = 2; i <= maxVal / i; i++) {
			if (!array[i]) {
				for (int j = 2; j <= maxVal / i; j++) {
					array[j * i] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
		
		sieveOfEratosthenes.sieve(crossedOut, maxVal);
		
		for (int i = 0; i <= maxVal; i++) {
			if (!crossedOut[i]) {
				System.out.print(i + " ");
			}
		}
	}
}
