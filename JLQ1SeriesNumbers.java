// JAF, JEF, JIF, JOF, ? , KAG, KEG, ?, ?, ?....., LUH
//	b. Now for the above series print the output should be 17, 21, ....
//		explanation: (10+1+6), (10+5+6), .....



public class JLQ1SeriesNumbers {
	public static void main(String[] args) {
		char[] ch = { 'J' };

		char[] ch1 = { 'A', 'E', 'I', 'O', 'U' };
		int res = 0;
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < ch.length; i++) {
				int a = (ch[i] + 0);
				a = a - 64;
				int a1 = (ch[i] - 4);
				a1 = a1 - 64;

				for (int k = 0; k < ch1.length; k++) {
					int a2 = (ch1[k] - 64);
					res = a + a2 + a1;
					System.out.print(res + " ");

				}
				System.out.println();
				a = (ch[i]++);

			}
		}
	}
}
