import java.util.Scanner;

public class Cjss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String str=sc.next();
		char[] ch = str.toCharArray();

		int c = 0;
		int j = 0;
		int s = 0;
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'C' || ch[i] == 'c') {
				c++;
			}
			if (ch[i] == 'J' || ch[i] == 'j') {
				j++;
			}
			if (ch[i] == 'S' || ch[i] == 's') {
				s++;
			}

		}

		int divs = s / 2;
		if (c < j && c < divs) {
			System.out.println("occurs :" + c);
		} else if (j < divs && j < c) {
			System.out.println("occurs :" + c);
		} else {
			System.out.println("occurs :" + divs);

		}

	}
}
