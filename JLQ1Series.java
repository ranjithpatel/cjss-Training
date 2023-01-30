// JAF, JEF, JIF, JOF, ? , KAG, KEG, ?, ?, ?....., LUH
//	a. Print the above series completely for the letter starting from 'J' to 'L'
//		explanation: The middle letters which are vowels have an increasing trend of A, E, I, O,U 


public class JLQ1Series {
	public static void main(String[] args) {
		char[] ch = { 'J' };
		String str = "";
		char[] ch1 = { 'A', 'E', 'I', 'O', 'U' };
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < ch.length; i++) {
				char c = (char) (ch[i]);
				String s2 = String.valueOf(c);
				char c1 = (char) (ch[i] - 4);
				for (int k = 0; k < ch1.length; k++) {
					str = s2 + ch1[k] + c1;
					System.out.print(str + " ");

				}
				System.out.println();
				c = (ch[i]++);
			}
		}

	}

}
