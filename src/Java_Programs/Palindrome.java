package Java_Programs;

public class Palindrome {
	// Identify the Length of String to be Iterated
	// Reverse the given input String
	// Compare Reversed String with the Original String
	public static void main(String args[]) {

		String original = "MADAM";
		String reverse = ""; // Empty String

		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}

		if (original.equals(reverse)){
			System.out.println(original + ": It's a Palindrome.");
		} else{
		System.out.println(original + ": It's not a Palindrome.");
		}
	}
}
