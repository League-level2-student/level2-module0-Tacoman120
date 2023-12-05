package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String sheet[] = {"m", "mo", "mou", "mous", "mouse"}; 
		//2. print the third element in the array
		System.out.println(sheet[2]);
		//3. set the third element to a different value
		sheet[2] = "mou";
		//4. print the third element again
		System.out.println(sheet[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		System.out.println();
		for(int i = 0; i<sheet.length; i++) {
			System.out.println(sheet[i]);
		}
		
		//6. make an array of 50 integers
		int array[] = {50}; 
		//7. use a for loop to make every value of the integer array a random number
		Random ran = new Random();
		for(int i = 0; i< array.length; i++) {
			array[i] = ran.nextInt(50)+1; 
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = 1000;
		for(int x = 0; x<array.length; x++) {
			
			int value = array[x];
			if(value<smallest) {
				smallest = value;
			}
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
