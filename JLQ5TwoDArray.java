//Create a 2 dimensional array of size 5 x 6, store values like shown below and print them
//2 4 6 8 10 12
//3 6 9 12 15 18
//4 8 12 16 20 24
//5 10 15 20 25 30
//6 12 18 24 30 36




import java.util.Arrays;
import java.util.Scanner;

public class JLQ5TwoDArray {
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
