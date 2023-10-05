//WAP that prompts the user to enter a letter and check whether a letter is a vowel or consonants
import java.util.*;

public class Vowel {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter The value of Character check vowel or consonants");
		char c = Sc.next().charAt(0);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A'
				|| c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			System.out.println("it is Vowel");
		} else {
			System.out.println("it is Consonants");

		}

	}
}
