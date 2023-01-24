
public class SeriesNumbers {
	public static void main(String[] args) {
		String s = "J";
		char[] ch = s.toCharArray();
		int res = 0;
		String s1 = "AEIOU";
		char[] ch1 = s1.toCharArray();
		String ss = "   ";
		char[] ch2 = ss.toCharArray();
		for (int j = 0; j < ch2.length; j++) {
			for (int i = 0; i < s.length(); i++) {
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
