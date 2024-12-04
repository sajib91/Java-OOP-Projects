
/*Write a Java program to create a method that takes a string as 
 * input and throws an exception if the string does not contain vowels.*/

package exception_handling1;

public class Main {

	public static void main(String[] args) {
		try {
			String text = "Java handling & managing exception ";
			 //String text = "Type gyps fly";
			System.out.println("Original String: " + text);
			checkVowels(text);
			System.out.println("String contain vowels.");
		} catch(NoVowelException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void checkVowels(String text) throws NoVowelException {
		boolean containsVowels = false;
		String vowels = "aeiouAEIOU";
		
		for(int i=0; i<text.length(); i++) {
			char ch = text.charAt(i);
			if(vowels.contains(String.valueOf(ch))) {
				containsVowels = true;
				break;
			}
		}
		if(!containsVowels) {
			throw new NoVowelException("String doesn't contain any vowels.");
		}
	}

}
class NoVowelException extends Exception {
	public NoVowelException(String message) {
		super(message);
	}
}