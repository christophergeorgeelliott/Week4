
public class Week4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array Manipulation:  
		//a.
		// 1. Array Manipulation:

		// a.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int result = ages[ages.length - 1] - ages[0];
		System.out.println("Result of subtraction: " + result);

		// b.
		int[] ages2 = new int[9];
		int result2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println("Dynamic subtraction result: " + result2);

		// c.
		int sum = 0;
		for (int age : ages) {
		    sum += age;
		}
		double average = (double) sum / ages.length;
		System.out.println("Average age: " + average);


		// 2. String Array Operations:

		// a.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int totalLetters = 0;
		for (String name : names) {
		    totalLetters += name.length();
		}
		double averageLetters = (double) totalLetters / names.length;
		System.out.println("Average letters per name: " + averageLetters);

		// b.
		StringBuilder concatenatedNames = new StringBuilder();
		for (String name : names) {
		    concatenatedNames.append(name).append(" ");
		}
		System.out.println("Concatenated names: " + concatenatedNames.toString().trim());


		// 3. Accessing the Last Element:
		// To access the last element of an array, use array[array.length - 1].
		
		// 3. Accessing the Last Element:
		// To access the last element of an array, use array[array.length - 1].
		
		int[] array = ages;
		int lastIndex = array.length - 1;
		int lastElement = array[lastIndex];

		// 4. Accessing the First Element:
		// To access the first element of an array, use array[0].
		int firstElement = array[0];


		// 5. Creating and Populating nameLengths Array:
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
		    nameLengths[i] = names[i].length();
		}


		// 6. Calculating Sum of Elements in nameLengths Array:
		int sumOfNameLengths = 0;
		for (int length : nameLengths) {
		    sumOfNameLengths += length;
		}
		System.out.println("Sum of name lengths: " + sumOfNameLengths);}


		// 7. Repeating a Word n Times:
		public static String repeatWord(String word, int n) {
		    StringBuilder result = new StringBuilder();
		    for (int i = 0; i < n; i++) {
		        result.append(word);
		    }
		    return result.toString();
		}


		// 8. Concatenating First and Last Names:
		public static String fullName(String firstName, String lastName) {
		    return firstName + " " + lastName;
		}


		// 9. Checking if Sum is Greater Than 100:
		public static boolean isSumGreaterThan100(int[] array) {
		    int sum = 0;
		    for (int num : array) {
		        sum += num;
		    }
		    return sum > 100;
		}


		// 10. Calculating Average of Double Array:
		public static double calculateAverage(double[] array) {
		    double sum = 0;
		    for (double num : array) {
		        sum += num;
		    }
		    return sum / array.length;
		}


		// 11. Comparing Averages of Two Double Arrays:
		public static boolean compareAverages(double[] array1, double[] array2) {
		    return calculateAverage(array1) > calculateAverage(array2);
		}


		// 12. Buying a Drink Based on Weather and Money:
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		    return isHotOutside && moneyInPocket > 10.50;
		}


		// 13. Custom Method:
		// Method to find the maximum value in an array of integers
		public static int findMaxValue(int[] array) {
		    int max = Integer.MIN_VALUE;
		    for (int num : array) {
		        if (num > max) {
		            max = num;
		        }
		    }
		    return max;
		
		// I created this method to solve a common problem of finding the maximum value in an array.



	}

}
