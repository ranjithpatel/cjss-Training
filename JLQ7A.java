// For the below matrix find out the cell having ‘1’.
//Now replace the entire row and column with ‘0’ in which that cell is available.

public class JLQ7A {
	public static void main(String[] args) {
		char[][] a = { { 'a', 'b', 'c', 'd', 'e', 'f' },
				{ '3', 't', 'm', 'k', 'd', 's' },
				{ 'a', '1', 'i', 'k', '1', 'f' },
				{ 'b', 'e', 'z', 'm', 'p', 'a' },
				{ 'c', '1', 'g', 'v', 'r', 'k' } };

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {

				if (a[i][j] == '1') {
					for (int l = 0; l < 6; l++) {
						int k = i;
						if(a[k][l] == '1') {
							a[k][l] = '1';
						}
						else if (l != j) {
							a[k][l] = '0';
						}
					}
					for (int m = 0; m < 5; m++) {
						int n = j;
						if(a[m][n] == '1') {
							a[m][n] = '1';
						}
						else if (m != i) {
							a[m][n] = '0';
						}
					}

				}

			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();

		}

	}

}
