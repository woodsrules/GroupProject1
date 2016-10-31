
/* Problem 7.20
 * From Introduction to Java Programming 
 * By Y Daniel Liang
 * 
 * (Revise selection sort) In Section 7.11, you used 
 * selection sort to sort an array. The selection-sort 
 * method repeatedly finds the smallest number in the 
 * current array and swaps it with the first. Rewrite this 
 * program by finding the largest number and swapping it with 
 * the last. Write a test program that reads in ten double 
 * numbers, invokes the method, and displays the sorted 
 * numbers.
 */

import java.util.Scanner;

public class Problem_7_20 {
	// The key to the battleship
	public static void main(String[] args) {
		printSortedList(selectionSort(getListOfNumbers()));
	}
	private static void printSortedList(double[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + " > ");
		}
		System.out.print(array[array.length - 1]);
	}
	// Method for getting user input for making array
	private static double[] getListOfNumbers () {
		// initializes scanner
		Scanner input = new Scanner(System.in);
		// ask how many numbers will be sorted
		System.out.println("How many numbers would you like" +
				" to sort?");
		// set size of array to be sorted
		double[] listOfNumbers = new double[input.nextInt()];
		// ask for numbers to be sorted
		System.out.print("Please enter the numbers that " +
				"you would like to sort,\nmaking sure " +
				"to press enter after each number.");
		// set user input to the array
		for (int i = 0; i < listOfNumbers.length; i++) {
			listOfNumbers[i] = input.nextDouble();
		}	
		return listOfNumbers; // return the new array
	}
	// Method for sorting the array in descending order
	// code modified from listing 7.8
	private static double[] selectionSort (double[] array) {
		// find the max in the list
		for (int i = 0; i < array.length - 1; i++) {
			double currentMax = array[i];
			int currentMaxIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (currentMax < array[j]) {
					currentMax = array[j];
					currentMaxIndex = j;
				}
			}
			if (currentMaxIndex != i) {
				array[currentMaxIndex] = array [i];
				array[i] = currentMax;
			}
		}
		return array;
	}
}
