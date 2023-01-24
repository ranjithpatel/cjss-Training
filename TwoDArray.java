import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row size :");
		int b = sc.nextInt();
		System.out.println("enter the column size :");
		int b1 = sc.nextInt();
		int[][] a = new int[b][b1];
		  int ele=2;
		for (int i = 0; i < b; i++) {
			for (int j =0,k=1; j < b1 && k<=6; j++) {
				
				a[i][j]=k*ele;
				System.out.print(a[i][j]+" ");
				k++;
			}
			ele=ele+1;
			
			System.out.println();

		}
		
	}
}
