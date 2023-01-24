
public class Series {
	public static void main(String[] args) {
		String s = "J";
		char[] ch = s.toCharArray();
		String str = "";
		String s1 = "AEIOU";
		char[] ch1 = s1.toCharArray();
		String ss="   ";
		char[] ch2=ss.toCharArray();
		for(int j=0;j < ch2.length;j++) {
		for (int i = 0; i < s.length(); i++) {
			int a = (ch[i] +0);
			char c = (char) a;
			String s2=String.valueOf(c);
			int a1 = (ch[i] -4);
			char c1 = (char) a1;
			for (int k = 0; k < ch1.length; k++) {
				str = s2 + ch1[k] + c1;
				System.out.print(str + " ");

			}
			System.out.println();
			a = (ch[i] ++);
		}
		}
		
	}

}
