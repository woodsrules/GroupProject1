// importing the scanner to access the library
import java.util.Scanner;

public class HangmanGame {
	// this is the main method
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// These are my chosen  words
		String[] words = { "soup", "chicken", "meat", "cake", "pizza", "burger",
				"hotdog", "steak", "pasta", "icecream", "sleep" };

		String answer;
		// this is my do while loop that will keep everything going
		do {
			//this where i establish my variables
			int i = intRandom(0, words.length - 1);
			char[] word = words[i].toCharArray();
			boolean[] mask = new boolean[word.length];
			int howManyYouGotCorrect = 0;
			int howManyYouMissed = 0;
			while (howManyYouGotCorrect != word.length) {
				System.out.print("Try and enter the correct letter for the mystery word given ");

				// this is where i will be printing out the users results
				for (int j = 0; j < word.length; j++) {

					if (mask[j])
						System.out.print(word[j]);
					else
						System.out.print("*");

				}


				char guess = input.next().charAt(0);

				// Checking the data so far
				boolean miss = true;
				boolean repeat = false;

				for (int j = 0; j < word.length; j++) {
					if (word[j] == guess) {
						if (mask[j] != true) {
							mask[j] = true;
							howManyYouGotCorrect++;
						} else {
							repeat = true;
							break;
						}
						miss = false;
					}
				}
				// this will keep track of how many you miss
				if (miss)
					howManyYouMissed++;
				// This 
				if (repeat)
					System.out.println("You have already used "+ guess);

			}

			System.out.println("The mystery word is " + String.valueOf(word)
			+ ". You answered incorrectly " + howManyYouMissed + " times");
			System.out
			.print("Do you want to play again? Enter y/n");
			answer = input.next();
		} while (answer.charAt(0) != 'n');

	}

	public static int intRandom(int lowerBound, int upperBound) {
		return (int) (lowerBound + Math.random()
		* (upperBound - lowerBound + 1));
	}

}