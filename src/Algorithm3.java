// BUBBLE SORT ALGORITHM

public class Algorithm3 {
	
			// TIME ALGORITHM 3 : BUBBLE SORT
			// This Method Times The Bubble Sort Algorithm
					
				public static double timeAlgorithm3(int[] unsortedArray) {
								
					int[] sortedArray = new int[unsortedArray.length];
					long currentTestStartTime = 0;
					long currentTestEndTime = 0;
					long currentTestTime = 0;
								
					// Record Start of Test Time;
					currentTestStartTime = System.nanoTime();
								
					// Call Bubble Sort
					sortedArray = bubbleSort(unsortedArray);
								
					//Record End of Test Time
					currentTestEndTime = System.nanoTime();
								
					// Calculate Test Time Result
					currentTestTime = currentTestEndTime - currentTestStartTime;
								
					// Return Test Time
					return currentTestTime;
								
				}
				
				// BUBBLE SORT
				// This Method Takes An Unsorted Array and Sorts It Using The Bubble Sort Algorithm
								
					private static int[] bubbleSort(int[] array) {
												
						//Outer Loop : Loop Through Array
						for (int i = 0; i < array.length -1; i++) {
							
							// Inner Array : Loop Through Array Minus The Number of Elements Which Have Been Sorted
							for (int j = 0; j < array.length - 1 - i; j++) {
								
								// Compare Side By Side Elements In Array
								if (array[j] > array[j + 1]) {
									// Assign Value of Left Element In Pair To Swap Value
									int swapValue = array[j];
									// Assign Value of Right Element In Pair To Left Value
									array[j] = array[j + 1];
									// Assign Value of Swap Value To Right Element In Pair
									array[j + 1] = swapValue;
								}
								
							}
						}
						
						// Return Array Once Sorted
						return array;				
							
												
								}
	
	

}
