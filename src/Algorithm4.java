// QUICK SORT ALGORITHM

import java.util.Random;

public class Algorithm4 {
	
			// TIME ALGORITHM 4 : QUICK SORT
			// This Method Times The Quick Sort Algorithm
					
				public static double timeAlgorithm4(int[] unsortedArray) {
					
					int[] sortedArray = new int[unsortedArray.length];
					long currentTestStartTime = 0;
					long currentTestEndTime = 0;
					long currentTestTime = 0;
								
					// Record Start of Test Time;
					currentTestStartTime = System.nanoTime();
								
					// Call Quick Sort
					sortedArray = quickSort(unsortedArray);
								
					//Record End of Test Time
					currentTestEndTime = System.nanoTime();
								
					// Calculate Test Time Result
					currentTestTime = currentTestEndTime - currentTestStartTime;
								
					// Return Test Time
					return currentTestTime;
								
				}
				
			// QUICK SORT
			// This Method Takes An Unsorted Array and Sorts It Using The Quick Sort Algorithm
				
				private static int[] quickSort(int[] array) {
					
					// Call Quick Sort
					quickSortRecursive(array, 0, array.length -1);
					
					// Return Sorted Array
					return array;
					
				}
				
				// QUICK SORT RECURSIVE
				// This Method Recursively Call Quick Sort Until Array Is Sorted
				
					private static void quickSortRecursive (int[] array, int lowerIndex, int upperIndex) {
						
						// Base Case : Check If Remaining Elements To Sort
						if (lowerIndex < upperIndex + 1) {
							// Determine Pivot Index Value
							int partition = quickSortPartition(array, lowerIndex, upperIndex);
							// Call Quick Sort On Left of Partition
							quickSortRecursive(array, lowerIndex, partition - 1);
							// Call Quick Sort On Right of Partition
							quickSortRecursive(array, partition + 1, upperIndex);
						}
					}
				
				// QUICK SORT SWAP
				// This Method Swaps Two Elements In The Array
					
					private static void quickSortSwap(int[] array, int indexLow, int indexHigh) {
						// Variable Used To Temporarily Store Value of Element To Swap
						int swapValue = array[indexLow];
						// Swap Value of Lower Index Array With Higher Index Array
						array[indexLow] = array[indexHigh];
						// Replace Value of Higher Index Array With Swap Value
						array[indexHigh] = swapValue;
					}
				
				// QUICK SORT PIVOT
				// This Method Selects An Element To Use As The Pivot Element
					
					private static int quickSortPivot(int lowRange, int highRange) {
						Random randomNumber = new Random();
						// Select Random Value Within Low - High Range
						return randomNumber.nextInt((highRange - lowRange) + 1) + lowRange;
					}
				
				// QUICK SORT PARTITION
				// This Method Compares Each Element To The Pivot Value and Decides If Element Need To Be Swapped
					
					private static int quickSortPartition(int[] array, int lowIndex, int highIndex) {
						
						// Swap Pivot Index To Lower Index
						quickSortSwap(array,lowIndex,quickSortPivot(lowIndex,highIndex));
						// Point To Next Element After The Lower Index
						int pointer = lowIndex + 1;
						
						// Loop Through Elements In Partition
						for (int i = pointer; i <= highIndex; i++) {
							// Compare Current Element To Lower Index Element
							if (array[i] < array[lowIndex]) {
								// Swap Current Element With Pointer Element
								quickSortSwap(array, i, pointer++);
							}
						}
						
						// Swap Pivot Value With Lower Index
						quickSortSwap(array,lowIndex,pointer - 1);
						// Return Pivot Value
						return pointer - 1;
					}

}
