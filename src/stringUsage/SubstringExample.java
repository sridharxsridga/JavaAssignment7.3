/*
 * program to find a substring in a String without using an inbuilt method of String class for the same.
 */

package stringUsage;

public class SubstringExample {

	public static void main(String[] args) {
		String mainString = "This is a sample line";// Declaring string variable
		char[] mainStringToCharArray = mainString.toCharArray(); //Converting string to char array so as to iterate over it
				
		System.out.println(subStringWithStartingEndPosition(mainStringToCharArray, 2, 4));  //calling substring with begin and end index
		
		System.out.println(subStringWithStartingEndPosition(mainStringToCharArray, 2, 1)); // calling substring with begin and end index
		
		System.out.println(subStringWithStartingPosition(mainStringToCharArray, 2)); // calling substring with begin index

	}

	//substring function with begin index
	private static String subStringWithStartingPosition(char[] mainToChar, int startingIndex) {
		char[] subStringCharArray = new char[mainToChar.length];//char array to store the substring fetched
		int counter = 0; // to be used as index for subStringCharArray
		for (int init = startingIndex; init < mainToChar.length; init++) {// iterate From begin index till end of the string
			subStringCharArray[counter] = mainToChar[init]; //Storing from begin index
			counter++; //incrementing index
		}
		return String.valueOf(subStringCharArray);//return string value

	}

	// substring method with begin index and end index
	private static String subStringWithStartingEndPosition(char[] mainToChar, int startingIndex, int endIndex) {
		char[] subStringCharArray = new char[mainToChar.length];//char array to store the substring fetched
		int counter = 0;// to be used as index for subStringCharArray
		
		if (endIndex <= startingIndex) {//if end index is less than begin index 
			System.out.println("String Not Found");
			
		}

		for (int init = 1; init <= endIndex && startingIndex < endIndex; init++) {//Iterate till end index
			subStringCharArray[counter] = mainToChar[startingIndex];// Start storing  From begin index till end of the string
			counter++;//incrementing index
			startingIndex++;//incrementing index
		}
		return String.valueOf(subStringCharArray);//return string value

	}

}
