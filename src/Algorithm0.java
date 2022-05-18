// SELECTION SORT ALGORITHM

public class Algorithm0 {
	
			// TIME ALGORITHM 0 : SELECTION SORT
			// This Method Times The Selection Sort Algorithm
				
				public static double timeAlgorithm0(int[] unsortedArray) {
					
					int[] sortedArray = new int[unsortedArray.length];
					long currentTestStartTime = 0;
					long currentTestEndTime = 0;
					long currentTestTime = 0;
					
					// Record Start of Test Time;
					currentTestStartTime = System.nanoTime();
					
					// Call Selection Sort
					sortedArray = selectionSort(unsortedArray);
					
					//Record End of Test Time
					currentTestEndTime = System.nanoTime();
					
					// Calculate Test Time Result
					currentTestTime = currentTestEndTime - currentTestStartTime;
					
					// Return Test Time
					return currentTestTime;
					
				}
				
				// SELECTION SORT
				// This Method Takes An Unsorted Array and Sorts It Using The Selection Sort Algorithm
					
					private static int[] selectionSort(int[] array) {
									
							// Create Variable To Store The Value Of The Smallest Element Found So Far 
							int minValue = 0;
							
							// Create Variable To Store The Index Of The Smallest Element Found So Far
							int minIndex = 0;
							
							// Create Variable To Temporally Store The Element To be Swapped
							int temp = 0;
							
							// Loop Through Array
							for (int i = 0; i < array.length; i++) {
										
								// Assign Minimum Value To Value of The Current Element In The Loop
								minValue = array[i];
								
								// Store The Index of The Current Element In The Loop
								minIndex = i;
										
								// Loop Through The Remainder Of The Array
								for (int j = i; j < array.length; j++) {
											
									// Compare The Minimum Value To The Current Element In The Inner Loop
									if (array[j] < minValue) {
										
										// Assign The Value Of The Current Element To The Minimum Value
										minValue = array[j];
										
										// Store The Value of The Current Element In The Inner Loop
										minIndex = j;
									}
											
								}
								
								// Compare The Minimum Value To The Current Element In The Loop
								if (minValue < array[i]) {
									
									// Assign The Element To Be Swapped To The Temporary Variable
									temp = array[i];
									
									// Swap The Minimum Value With The Current Element In The Loop
									array[i] = array[minIndex];
									
									// Replace The Current Element In The Loop With The Temporary Variable
									array[minIndex] = temp;
								}
							}
									
							return array;
									
						}

}
