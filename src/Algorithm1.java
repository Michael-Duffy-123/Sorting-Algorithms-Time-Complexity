// MERGE SORT ALGORITHM


public class Algorithm1 {
	
			// TIME ALGORITHM 1 : MERGE SORT
			// This Method Times The Merge Sort Algorithm
				
				public static double timeAlgorithm1(int[] unsortedArray) {
								
					int[] sortedArray = new int[unsortedArray.length];
					long currentTestStartTime = 0;
					long currentTestEndTime = 0;
					long currentTestTime = 0;
								
					// Record Start of Test Time;
					currentTestStartTime = System.nanoTime();
								
					// Call Merge Sort
					sortedArray = mergeSort(unsortedArray);
							
					//Record End of Test Time
					currentTestEndTime = System.nanoTime();
								
					// Calculate Test Time Result
					currentTestTime = currentTestEndTime - currentTestStartTime;
								
					// Return Test Time
					return currentTestTime;
								
				}
				
				// MERGE SORT
				// This Method Takes An Unsorted Array and Sorts It Using The Merge Sort Algorithm
						
					private static int[] mergeSort(int[] array) {
						
						// Run Merge Sort Algorithm Passing The Unsorted Array & The Size of The Array
					    mergeSortRun(array, array.length);
					    // Return The Array Which Is Now Sorted
					    return array;
					}
					
				// MERGE SORT RUN
				// This Method Recursively Calls Itself To Split Into An Array Pairs Then Merges The Pairs
					
					private static void mergeSortRun(int[] array, int arraySize) {
						
						// Base Case For Recursion : Determine If Array Can Be Split Any Further
					    if (arraySize < 2) {
					        return;
					    }
					    
					    // Determine Index Number of The Middle Element In Array
					    int middle = arraySize / 2;
					    
					    // Create A New Array Which Is Half The Size of The Original Array (Left of Middle)
					    int[] leftArray = new int[middle];
					    
					    // Create A New Array Which Is Half The Size of Original (Right of Middle)
					    int[] rightArray = new int[arraySize - middle];

					    // Assign Left Half of Original Array To New Array (Left Array) By Looping
						    for (int i = 0; i < middle; i++) {
						        leftArray[i] = array[i];
						    }
					    
						// Assign Right Half of Original Array To New Array (Right Array) By Looping
						    for (int i = middle; i < arraySize; i++) {
						        rightArray[i - middle] = array[i];
						    }
						
						// Call Method By Passing The Left Array and The Length of The Left Array
					    mergeSortRun(leftArray, middle);
					    
					    // Call Method By Passing The Right Array and The Length of The Right Array
					    mergeSortRun(rightArray, arraySize - middle);

					    // Call Merge Method To Merge Left & Right Arrays
					    mergeSortMerge(array, leftArray, rightArray, middle, arraySize - middle);
					}
					
				// MERGE SORT MERGE
				// This Method Merges Two Arrays By Comparing The First Element In Each
					
					private static void mergeSortMerge(int[] array, int[] leftArray, int[] rightArray, int leftArraySize, int rightArraySize) {
						 
					    int i = 0, j = 0, k = 0;
					    
					   // Determine If Both Arrays Are Greater Than Zero
					    while (i < leftArraySize && j < rightArraySize) {
					    	
					    	// Compare The First Elements Of The Left & Right Array
					        if (leftArray[i] <= rightArray[j]) {
					        	
					        	// Assign Next Element of Left Array To Original Array
					            array[k++] = leftArray[i++];
					        }
					        
					        else {
					        	// Assign Next Element of Right Array To Original Array
					            array[k++] = rightArray[j++];
					        }
					        
					    }
					    
					    // Determine If Left Array Is Greater Than Zero
					    while (i < leftArraySize) {
					    	
					    	// Assign Next Element In Left Array To Original Array
					        array[k++] = leftArray[i++];
					    }
					    
					 // Determine If Right Array Is Greater Than Zero
					    while (j < rightArraySize) {
					    	
					    	// Assign Next Element In Right Array To Original Array
					        array[k++] = rightArray[j++];
					    }
					    
					}

}
