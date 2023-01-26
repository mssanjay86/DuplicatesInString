package DuplicatesInString;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String str = "aaabbcc";
		System.out.print("Given string: " + str);
		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			for (int j = i + 1; j < charArr.length; j++) {
				if (charArr[i] == charArr[j] && charArr[i] != '$') {
					charArr[j] = '$';
				}
			}
		}
		System.out.println();
		System.out.print("After removing duplicates from string:");
		for (char ch : charArr) {

			if (ch != '$') {
				System.out.print(ch);

			}

		}

	}

}
