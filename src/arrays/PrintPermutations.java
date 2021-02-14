package arrays;

public class PrintPermutations {

	public static void main(String[] args) {
		String input = "acn";
		printPerm(input, "");

	}

	private static void printPerm(String input, String ans) {

		if (input.length() == 0) {
			System.out.println(ans);
			//return;
		}
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			String ros = input.substring(0, i) + input.substring(i + 1);
			printPerm(ros, ans + ch);
		}

	}

}
