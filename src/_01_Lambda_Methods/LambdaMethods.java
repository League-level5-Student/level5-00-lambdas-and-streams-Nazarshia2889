package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s) -> {
			StringBuilder builder = new StringBuilder();
			StringBuilder x = builder.append(s);
			x.reverse();
			System.out.println(x);
		}, "repeat");
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			char[] arr = s.toCharArray();
			for(int i = 0; i < s.length(); i++) {
				if(i % 2 == 0) { 
					arr[i] = Character.toUpperCase(arr[i]);
				}
			}
			System.out.println(arr);
		}, "repeat");
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s) -> {
			StringBuilder builder = new StringBuilder();
			StringBuilder x = builder.append(s);
			for(int i = 1; i < x.length(); i++) {
				x.insert(i, '.');
				i++;
			}
			System.out.println(x);
		}, "repeat");
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s) -> {
			String vowels = "aeiouy";
			for(int i = 0; i < s.length(); i++) { 
				if(vowels.indexOf(s.charAt(i)) != -1) { 
					s = s.substring(0, i) + s.substring(i + 1, s.length());
					i--;
				}
			}
			System.out.println(s);
		}, "repeat");
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
