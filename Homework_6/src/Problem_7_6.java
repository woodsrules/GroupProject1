
/*
 * Problem 7.6 
 * Introduction to Java Programming 
 * By Y Daniel Liang
 * 
 * (Revise Listing 5.15, PrimeNumber.java) Listing 5.15 
 * determines whether a number n is prime by checking 
 * whether 2, 3, 4, 5, 6, . . . , n/2 is a divisor. If a 
 * divisor is found, n is not prime. A more efficient 
 * approach is to check whether any of the prime numbers 
 * less than or equal to sqrt(n) can divide n evenly. If not, n 
 * is prime. Rewrite Listing 5.15 to display the first 50 
 * prime numbers using this approach. You need to use an 
 * array to store the prime numbers and later use them to 
 * check whether they are possible divisors for n.
 */

public class Problem_7_6 {
	
	// Some code was pulled from listing 5.15
	final static int NUMBER_OF_PRIMES = numberOfPrimes();
	public static void main(String[] args) {
		// Array for storing the prime numbers
		int [] primeNumbers = new int[NUMBER_OF_PRIMES];
		int count = 0;
		for (int i = 2; count < NUMBER_OF_PRIMES; i++) {
			if (checkForPrime(i)) {
				primeNumbers[count] = i;
				count++;
			}
		}

		printPrimes(primeNumbers);
	}
	// method for printing the prime numbers
	private static void printPrimes(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%5d", array[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println("");
			}
		}
	}
	private static boolean checkForPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	// Ask for input to determine how many primes are found
	// return that input
	private static int numberOfPrimes() {

		return 300;
	}	
}


