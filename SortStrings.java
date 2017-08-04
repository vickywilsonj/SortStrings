/**
 * 
 */
package com.vwj.learning.java.problems.algorithms.sorting;

/**
 * @author Vicky Wilson Jacob
 * @date 2017-08-03
 *
 */
public class SortStrings {

	/**
	 * input: Unsorted Array[Strings] 
	 * output: Sorted Array[Strings] 
	 * Algorithm: BubbleSort 
	 * Time Complexity: Worst: O(n^2)
	 */
	private static String[] sort(String[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) {
				if (data[j].compareToIgnoreCase(data[j + 1]) > 0) {
					String tmp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tmp;
				}
			}
		}
		return data;
	}

	private static void display(String[] input) {
		for (String in : input) {
			System.out.print(in + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String[] input = { "Ball", "Cat", "Apple", "Zen" };

		System.out.println("Input before Sorting:");
		display(input);

		sort(input);

		System.out.println("After sorting:");
		display(input);

	}

}
