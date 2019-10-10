package arrays;

import java.util.Random;


public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array1 = {"","","hi","",""};


		//2. print the third element in the array
		System.out.println(array1[2]);
		//3. set the third element to a different value
		array1[2] = "test";
		//4. print the third element again
		System.out.println(array1[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		//6. make an array of 50 integers
		int ints50[] = new int[50];
		int smallest = 90000;
		int largest = 0;
		for(int i = 0; i < 50; i++) {
			Random rand = new Random();
			int randVal = rand.nextInt(50);
			ints50[i] = randVal;
			System.out.println(ints50[i]);
			if(ints50[i] < smallest) {
				smallest = ints50[i];
			}
			if(ints50[i] > largest) {
				
				largest = ints50[i];
			}
			
		}
		System.out.println("The Smallest number was: "+smallest);
		System.out.println("The Biggest number was: "+largest);

		//7. use a for loop to make every value of the integer array a random number
		
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
