
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
 * less than or equal to sqrt(n) can divide n evenly. If not, 
 * n is prime. Rewrite Listing 5.15 to display the first 50 
 * prime numbers using this approach. You need to use an 
 * array to store the prime numbers and later use them to 
 * check whether they are possible divisors for n.
 */
import java.util.Scanner;

public class Problem_7_6 {
	Scanner input = new Scanner(System.in);
	// Some code was pulled from listing 5.15
	final static int NUMBER_OF_PRIMES = numberOfPrimes();
	// Array for storing the prime numbers
	static int [] primeNumbers = new int[NUMBER_OF_PRIMES];
	// The key to the battleship 
	public static void main(String[] args) {
		int count = 0; // counter to track the array index
		// find and place primes in array
		for (int i = 2; count < NUMBER_OF_PRIMES; i++) {
			if (checkForPrime(i)) {
				primeNumbers[count++] = i;
			}
		}
		// call method for printing primes
		printPrimes(primeNumbers);
	}
	// method for printing the prime numbers
	private static void printPrimes(int[] array) {
		for (int i = 0; i < array.length; i++) {
			// used http://alvinalexander.com/programming/
			// printf-format-cheat-sheet
			// for formating information
			System.out.printf("%5d", array[i]);
			// create new line after every 10th number
			if ((i + 1) % 10 == 0) {
				System.out.println("");
			}
		}
	}
	// method for checking if number is prime
	private static boolean checkForPrime(int number) {
		// avoids division by zero
		if (number == 2) {
			primeNumbers[0] = 2;
		}
		// divides n by each prime number that is less than
		// or equal to the square root of n, and checks
		// for a zero remainder
		for (int i = 0; primeNumbers[i] <= Math.sqrt(number); 
				i++) {
			if (number % primeNumbers[i] == 0) {
				return false; // Returns false if not prime
			}
		}
		return true; // Returns true if prime
	}
	// Ask for input to determine how many primes are found
	// return that input
	private static int numberOfPrimes() {
		/* Jason, would you mind writing this method?
		 * It needs to ask the user to input how many prime
		 * numbers they want to have found, and then return 
		 * that number. Thanks!!
		 * Yes i will. -Jason
		 * 
		 * edit: If this doesnt work i'm sorry i cant run it currently.
		 *  I tried. Don't hate me.
		 */
		System.out.print("How many prime numbers do you want, bruh? ");
		int howManyPrimes = input.nextInt;
		System.out.print("Your prime numbers are: " + i);
		return 50;
	}	
}


