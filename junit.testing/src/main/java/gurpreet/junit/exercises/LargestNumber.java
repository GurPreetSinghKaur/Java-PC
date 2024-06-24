package gurpreet.junit.exercises;

/*
Write a function that takes an integer and returns the largest number that can
be made by rearranging the digits.

Examples:

3 returns 3
123 returns 321
937846 returns 987643
43 returns 43

 */

public class LargestNumber {
	
	static int solve(int input){
  
    // Insert your code here
    //if the number is less than 10 it means it is a single digit and cannot be re-arranged
if (input < 10) return input;

		//create an array of these numbers and use bubble sort. |Arrays.sort() is also useful
String intString = input+"";
char[] charArray = intString.toCharArray();

     for (int i = 0; i < charArray.length; i++) {
       for (int k = i + 1; k < charArray.length; k++)
         {if (charArray[i] < charArray[k]) {
           //swap 
           char swap = charArray[i];
           charArray[i] = charArray[k];
           charArray[k] = swap; 
         }}
         
     }
intString = "";
     for (char digit : charArray){
       intString += digit;
     }
     
     
     return Integer.parseInt(intString);

  }
}
