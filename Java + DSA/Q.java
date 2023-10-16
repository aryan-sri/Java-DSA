// Java program for the above approach

import java.util.LinkedList;
class Q {
	

	// Driver code
	public static void main(String[] args)
	{
		String str1 = "AACD";
		String str2 = "ACDA";

		// Function call
		if (check_rotation(str1, str2))
			System.out.println(
				"Strings are rotations of each other");
		else
			System.out.printf(
				"Strings are not rotations of each other");
	}
}

// This code is contributed by gauravrajput1
