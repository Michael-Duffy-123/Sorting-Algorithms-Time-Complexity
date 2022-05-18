public class AlgorithmsTest {
	
	// RANDOM NUMBER ARRAYS
	// The Following Arrays Are Used To Store Random Numbers To Be Used To Test Algorithms
	// Array Sizes Range From n = 100 to n = 10000
	// Arrays Are Populated With Random Numbers Each Time The Set Of Algorithms Is Tested
	
		public static int[] ignoredArray = new int[100];
		public static int[] n100 = new int[100];
		public static int[] n250 = new int[250];
		public static int[] n500 = new int[500];
		public static int[] n750 = new int[750];
		public static int[] n1000 = new int[1000];
		public static int[] n1250 = new int[1250];
		public static int[] n2500 = new int[2500];
		public static int[] n3750 = new int[3750];
		public static int[] n5000 = new int[5000];
		public static int[] n6250 = new int[6250];
		public static int[] n7500 = new int[7500];
		public static int[] n8750 = new int[8750];
		public static int[] n10000 = new int[10000];
	
	// TOTAL TEST TIMES
	// This Array Is Used To Store Cumulative Total Test Times For Each Algorithm
	// The Array Stores The Number of The Algorithm (Range 0 - 4) and Random Number Array Number (0 - 12)
	// Array Indexed as Follows :
	// totalTestTimes[Algorithm Number][0] = Total Time For Random Number Array of Size n = 100
	// totalTestTimes[Algorithm Number][1] = Total Time For Random Number Array of Size n = 250
	// totalTestTimes[Algorithm Number][2] = Total Time For Random Number Array of Size n = 500
	// totalTestTimes[Algorithm Number][3] = Total Time For Random Number Array of Size n = 750
	// totalTestTimes[Algorithm Number][4] = Total Time For Random Number Array of Size n = 1000
	// totalTestTimes[Algorithm Number][5] = Total Time For Random NumberArray of Size n = 1250
	// totalTestTimes[Algorithm Number][6] = Total Time For Random Number Array of Size n = 2500
	// totalTestTimes[Algorithm Number][7] = Total Time For Random Number Array of Size n = 3750
	// totalTestTimes[Algorithm Number][8] = Total Time For Random NumberArray of Size n = 5000
	// totalTestTimes[Algorithm Number][9] = Total Time For Random Number Array of Size n = 6250
	// totalTestTimes[Algorithm Number][10] = Total Time For Random Number Array of Size n = 7500
	// totalTestTimes[Algorithm Number][11] = Total Time For Random Number Array of Size n = 8750
	// totalTestTimes[Algorithm Number][12] = Total Time For Random Number Array of Size n = 10000
	
		public static double[][] totalTestTimes = new double[5][13];

	// AVERAGE TEST TIME
	// This Array Is Used To Store Average Test Times For Each Algorithm
	// The Array Stores The Number of The Algorithm (Range 0 - 4) and Random Number Array Number (0 - 12)
	// Array Indexed as Follows :
	// averageTestTime[Algorithm Number][0] = Average Time For Random Number Array of Size n = 100
	// averageTestTime[Algorithm Number][1] = Average Time For Random Number Array of Size n = 250
	// averageTestTime[Algorithm Number][2] = Average Time For Random Number Array of Size n = 500
	// averageTestTime[Algorithm Number][3] = Average Time For Random Number Array of Size n = 750
	// averageTestTime[Algorithm Number][4] = Average Time For Random Number Array of Size n = 1000
	// averageTestTime[Algorithm Number][5] = Average Time For Random Number Array of Size n = 1250
	// averageTestTime[Algorithm Number][6] = Average Time For Random Number Array of Size n = 2500
	// averageTestTime[Algorithm Number][7] = Average Time For Random Number Array of Size n = 3750
	// averageTestTime[Algorithm Number][8] = Average Time For Random Number Array of Size n = 5000
	// averageTestTime[Algorithm Number][9] = Average Time For Random Number Array of Size n = 6250
	// averageTestTime[Algorithm Number][10] = Average Time For Random Number Array of Size n = 7500
	// averageTestTime[Algorithm Number][11] = Average Time For Random Number Array of Size n = 8750
	// averageTestTime[Algorithm Number][12] = Average Time For Random Number Array of Size n = 10000
		
		public static double[][] averageTestTime = new double[5][13];

	// TEST COUNT : Variable Used To Store The Number of Times Algorithms Have Been Tested
		
		public static int testCount = 0;
		
	// MAIN METHOD
		
			public static void main(String[] args) {
			
			// Test Algorithms
				runTests();
			// Calculate Averages
				calculateAverages();
			// Print Results
				printTestResults();
			
		}
	
	// RUN TESTS
	// This Method Performs Tests On All Algorithms 100 Times Using A Loop
			
			public static void runTests() {
			
			// Test All Algorithms 100 Times Using Loop
			
				for (testCount = 0; testCount < 100 ; testCount++) {
					
						// Populate Random Number Arrays With New Numbers
							populateRandomNumberArrays();
						// Test Set of Algorithm With Random Number Arrays
							testSetOfAlgorithms();
							
				}
			}
		
		// POPULATE RANDOM NUMBER ARRAYS
		// This Method Populates All Random Number Arrays By Calling A Method Which Generates A Random Number Array Of Specified Size
		
			public static void populateRandomNumberArrays() {
	
				ignoredArray = generateArrayWithRandomNumbers(100);
				n100 = generateArrayWithRandomNumbers(100);
				n250 = generateArrayWithRandomNumbers(250);
				n500 = generateArrayWithRandomNumbers(500);
				n750 = generateArrayWithRandomNumbers(750);
				n1000 = generateArrayWithRandomNumbers(1000);
				n1250 = generateArrayWithRandomNumbers(1250);
				n2500 = generateArrayWithRandomNumbers(2500);
				n3750 = generateArrayWithRandomNumbers(3750);
				n5000 = generateArrayWithRandomNumbers(5000);
				n6250 = generateArrayWithRandomNumbers(6250);
				n7500 = generateArrayWithRandomNumbers(7500);
				n8750 = generateArrayWithRandomNumbers(8750);
				n10000 = generateArrayWithRandomNumbers(10000);
				
			}
	
		// GENERATE ARRAY WITH RANDOM NUMBERS
		// This Method Returns A Generated Array of A Specified Size Populated With A Random Number In Range 0 - 100.
		
			public static int[] generateArrayWithRandomNumbers(int arraySizeSpecified) {
				
				int[] randomNumberArray = new int[arraySizeSpecified];
				
					for (int index = 0; index < arraySizeSpecified; index++) {
						randomNumberArray[index] = (int)(Math.random() * 100);
					}
					
				return randomNumberArray;
				
			}
			
		// TEST SET OF ALGORITHMS
		// This Method Runs A Test On Each Algorithm Using A Loop To Specify Which Number Algorithm To Be Tested (Algorithm Numbers 0 - 4)
			
			public static void testSetOfAlgorithms() {
				
				for (int algorithmToBeTested = 0; algorithmToBeTested < 5; algorithmToBeTested++) {
					// Run Recorded Tests
					runTestsOnSpecificAlgorithm(algorithmToBeTested);
				}
			}
			
		// RUN TESTS ON SPECIFIC ALGORITHM
		// This Method Tests A Specified Algorithm With All Random Number Arrays And Adds The Result To To The Total Test Times Array
			
			public static void runTestsOnSpecificAlgorithm(int algorithmToBeTested) {
				
				// Loop Through All Random Number Arrays (Random Number Array Number 0 - 12)
				for (int randomNumberArraySpecifiedNumber = 0; randomNumberArraySpecifiedNumber < 13; randomNumberArraySpecifiedNumber++) {
					
					// Assign A Random Number Array To Use For Test Based On Specified Number (Random Number Array Numbers 0 -12)
					int[] randomNumberArray = assignRandomNumberArray(randomNumberArraySpecifiedNumber);
					
					// Record Test Time For Specified Algorithm Using Specified Random Number Array
					double testResult = timeAlgorithmNumber(algorithmToBeTested, randomNumberArray);
										
					// Convert Test Result From X to Y
					double convertedTestResult = convertTestResult(testResult);
					
					// Add Test Result To Total Test Times Array
					addTestResultToTotal(algorithmToBeTested, randomNumberArraySpecifiedNumber, convertedTestResult);
					
				}
				
			}
			
		// ASSIGN RANDOM NUMBER ARRAY
		// This Method Returns A Random Number Array Based On A Specified Number (Random Number Array Numbers 0 -12)
			
			public static int[] assignRandomNumberArray(int randomNumberArraySpecifiedNumber) {
				
				if (randomNumberArraySpecifiedNumber == 0) {
					return n100;
				}
				
				if (randomNumberArraySpecifiedNumber == 1) {
					return n250;
				}
				
				if (randomNumberArraySpecifiedNumber == 2) {
					return n500;
				}
				
				if (randomNumberArraySpecifiedNumber == 3) {
					return n750;
				}
				
				if (randomNumberArraySpecifiedNumber == 4) {
					return n1000;
				}
				
				if (randomNumberArraySpecifiedNumber == 5) {
					return n1250;
				}
				
				if (randomNumberArraySpecifiedNumber == 6) {
					return n2500;
				}
					
				if (randomNumberArraySpecifiedNumber == 7) {
					return n3750;
				}
					
				if (randomNumberArraySpecifiedNumber == 8) {
					return n5000;
				}
					
				if (randomNumberArraySpecifiedNumber == 9) {
					return n6250;
				}
					
				if (randomNumberArraySpecifiedNumber == 10) {
					return n7500;
				}
					
				if (randomNumberArraySpecifiedNumber == 11) {
					return n8750;
				}
				
				if (randomNumberArraySpecifiedNumber == 12) {
					return n10000;
				}
						

				else {
					int[] failedToAssignRandomNumberArray = new int[1];
					System.out.println("FAILED TO ASSIGN RANDOM NUMBER ARRAY");
					return failedToAssignRandomNumberArray;
				}
				
			}
				
		//TIME ALGORITHM NUMBER
		// This Method Times A Selected Algorithm Based On A Specified Number (Algorithm Number 0 - 4)
			
			public static double timeAlgorithmNumber(int algorithmToBeTested, int[] arrayToSort) {

		
				
				// Create A Variable To Store The Result For Algorithm Test
				double testResult = 0;
				
				// Decide Which Algorithm To Test Based On Specified Number
					
					// Test Algorithm 0
					if (algorithmToBeTested == 0 ) {
						
						// Time Algorithm Using Random Number Array
						new Algorithm0();
						testResult = Algorithm0.timeAlgorithm0(arrayToSort);
						
						// Return Test Result
						return testResult;
					
					}
					
					// Test Algorithm 1
					if (algorithmToBeTested == 1 ) {
					
						// Time Algorithm Using Random Number Array
						new Algorithm1();
						testResult = Algorithm1.timeAlgorithm1(arrayToSort);
						
						// Return Test Result
						return testResult;
					
					}
					
					// Test Algorithm 2
					if (algorithmToBeTested == 2 ) {
					
						// Time Algorithm Using Random Number Array
						new Algorithm2();
						testResult = Algorithm2.timeAlgorithm2(arrayToSort);
						
						// Return Test Result
						return testResult;
					
					}
					
					// Test Algorithm 3
					if (algorithmToBeTested == 3 ) {
					
						// Time Algorithm Using Random Number Array
						new Algorithm3();
						testResult = Algorithm3.timeAlgorithm3(arrayToSort);
						
						// Return Test Result
						return testResult;
					
					}
					
					// Test Algorithm 4
					if (algorithmToBeTested == 4 ) {
					
						// Time Algorithm Using Random Number Array
						new Algorithm4();
						testResult = Algorithm4.timeAlgorithm4(arrayToSort);
						
						// Return Test Result
						return testResult;
					
					}				
				
				// Return Result of Test
				System.out.println(" Test Failed : Algorithm Was Not Selected Correctly");
				return testResult;
				
			}
		
		// CONVERT TEST RESULT
		//This Method Converts A Test Result From X To Y
		
			public static double convertTestResult(double testResult) {
				
				double convertedTestResult = testResult /1000000;
				return convertedTestResult;
			}
		
		// ADD TEST RESULT TO TOTAL TEST TIMES ARRAY
		//This Method Adds The Test Result From A Single Algorithm Test To The Total Test Times Array
			
			public static void addTestResultToTotal(int algorithmToBeTested, int randomNumberArraySpecifiedNumber, double convertedTestResult) {
			
				totalTestTimes[algorithmToBeTested][randomNumberArraySpecifiedNumber] = totalTestTimes[algorithmToBeTested][randomNumberArraySpecifiedNumber] + convertedTestResult;
			}
			
		// CALCULATE AVERAGES
		// This Method Calculates The Average Test Time For Each Algorithm And Assigns The Value To The Average Test Times Array
			
			public static void calculateAverages() {
				
				// Loop Through Average Test Time Array Index
				
					// Loop Through Algorithm Numbers Index (0 - 4)
					for (int algorithmNumber = 0; algorithmNumber < 5 ; algorithmNumber++) {
						
						// Loop Through Random Number Array Index (0 - 12)
						for (int randomNumberArrayNumber = 0 ; randomNumberArrayNumber < 13; randomNumberArrayNumber++) {
							
							// Calculate Average Test Time By Diving Total Test Time By Number of Times Tested
							double averageTestTimeCalculated = (totalTestTimes[algorithmNumber][randomNumberArrayNumber] / testCount);
							
							// Assign Average Test Time To Average Test Time Array
							averageTestTime[algorithmNumber][randomNumberArrayNumber] = averageTestTimeCalculated;
						}		
					}	
			}
					
		// PRINT TEST RESULTS
		// This Method Prints The Average Test Times Array In A Formated Table
				
				public static void printTestResults() {
					
					System.out.println("TEST RESULTS TABLE : AVERAGE TIMES OF " + testCount + " TESTS");
					
					final Object[][] table = new String[6][];
					table[0] = new String[] { "Size", "100", "250", "500", "750", "1000", "1250", "2500", "3750", "5000", "6250", "7500", "8750", "10000" };
					table[1] = new String[] { "Selection Sort", String.format("%.3f", averageTestTime[0][0]), String.format("%.3f", averageTestTime[0][1]), String.format("%.3f", averageTestTime[0][2]), String.format("%.3f", averageTestTime[0][3]), String.format("%.3f", averageTestTime[0][4]), String.format("%.3f", averageTestTime[0][5]), String.format("%.3f", averageTestTime[0][6]), String.format("%.3f", averageTestTime[0][7]), String.format("%.3f", averageTestTime[0][8]), String.format("%.3f", averageTestTime[0][9]), String.format("%.3f", averageTestTime[0][10]), String.format("%.3f", averageTestTime[0][11]), String.format("%.3f", averageTestTime[0][12])};
					table[2] = new String[] { "Merge Sort", String.format("%.3f", averageTestTime[1][0]), String.format("%.3f", averageTestTime[1][1]), String.format("%.3f", averageTestTime[1][2]), String.format("%.3f", averageTestTime[1][3]), String.format("%.3f", averageTestTime[1][4]), String.format("%.3f", averageTestTime[1][5]), String.format("%.3f", averageTestTime[1][6]), String.format("%.3f", averageTestTime[1][7]), String.format("%.3f", averageTestTime[1][8]), String.format("%.3f", averageTestTime[1][9]), String.format("%.3f", averageTestTime[1][10]), String.format("%.3f", averageTestTime[1][11]), String.format("%.3f", averageTestTime[1][12])};
					table[3] = new String[] { "Counting Sort", String.format("%.3f", averageTestTime[2][0]), String.format("%.3f", averageTestTime[2][1]), String.format("%.3f", averageTestTime[2][2]), String.format("%.3f", averageTestTime[2][3]), String.format("%.3f", averageTestTime[2][4]), String.format("%.3f", averageTestTime[2][5]), String.format("%.3f", averageTestTime[2][6]), String.format("%.3f", averageTestTime[2][7]), String.format("%.3f", averageTestTime[2][8]), String.format("%.3f", averageTestTime[2][9]), String.format("%.3f", averageTestTime[2][10]), String.format("%.3f", averageTestTime[2][11]), String.format("%.3f", averageTestTime[2][12])};
					table[4] = new String[] { "Bubble Sort", String.format("%.3f", averageTestTime[3][0]), String.format("%.3f", averageTestTime[3][1]), String.format("%.3f", averageTestTime[3][2]), String.format("%.3f", averageTestTime[3][3]), String.format("%.3f", averageTestTime[3][4]), String.format("%.3f", averageTestTime[3][5]), String.format("%.3f", averageTestTime[3][6]), String.format("%.3f", averageTestTime[3][7]), String.format("%.3f", averageTestTime[3][8]), String.format("%.3f", averageTestTime[3][9]), String.format("%.3f", averageTestTime[3][10]), String.format("%.3f", averageTestTime[3][11]), String.format("%.3f", averageTestTime[3][12])};
					table[5] = new String[] { "Quick Sort", String.format("%.3f", averageTestTime[4][0]), String.format("%.3f", averageTestTime[4][1]), String.format("%.3f", averageTestTime[4][2]), String.format("%.3f", averageTestTime[4][3]), String.format("%.3f", averageTestTime[4][4]), String.format("%.3f", averageTestTime[4][5]), String.format("%.3f", averageTestTime[4][6]), String.format("%.3f", averageTestTime[4][7]), String.format("%.3f", averageTestTime[4][8]), String.format("%.3f", averageTestTime[4][9]), String.format("%.3f", averageTestTime[4][10]), String.format("%.3f", averageTestTime[4][11]), String.format("%.3f", averageTestTime[4][12])};
					
		
						for (final Object[] row : table) {
						    System.out.format("%-15s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n", row);
						}
					
				}
			
}



