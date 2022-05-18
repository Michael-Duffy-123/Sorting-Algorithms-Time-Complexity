// COUNTING SORT ALGORITHM

public class Algorithm2 {
	
			// TIME ALGORITHM 2 : COUNTING SORT
			// This Method Times The Counting Sort Algorithm
					
				public static double timeAlgorithm2(int[] unsortedArray) {
					
					int[] sortedArray = new int[unsortedArray.length];
					long currentTestStartTime = 0;
					long currentTestEndTime = 0;
					long currentTestTime = 0;
								
					// Record Start of Test Time;
					currentTestStartTime = System.nanoTime();
								
					// Call Counting Sort
					sortedArray = countingSort(unsortedArray);
							
					//Record End of Test Time
					currentTestEndTime = System.nanoTime();
								
					// Calculate Test Time Result
					currentTestTime = currentTestEndTime - currentTestStartTime;
								
					// Return Test Time
					return currentTestTime;
								
				}
				
				// COUNTING SORT
				// This Method Takes An Unsorted Array and Sorts It Using The Counting Sort Algorithm
							
					private static int[] countingSort(int[] array) {
						// Declare The Range of Values of Elements The Array : For These Examples All Elements Are In The Range 0 - 100
						int range = 100;
						
						// Create Array To Count Frequency of Occurrence Of Elements
						int occurrence[] = new int[range + 1]; 
						
						// Count Occurrences of Elements In Array
						for (int i : array) { 
							occurrence[i]++;
						} 
						
						// Add Elements To Array Based On Frequency of Occurrences of Elements
						int indexArray = 0; 
						// Loop Over Occurrence Array
						for (int indexOccurrence = 0; indexOccurrence < occurrence.length; indexOccurrence++) { 
							// Check If Value Occurs In Array (Only Occurred If Counted At Least Once)
							while (0 < occurrence[indexOccurrence]) { 
								//Assign Occurrence Value To Array
								array[indexArray++] = indexOccurrence; 
								// Decrease Frequency of Occurrence By One
								occurrence[indexOccurrence]--; 
							} 
						}
						
						return array;
					}

}
