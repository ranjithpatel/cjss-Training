//For the below matrix find out the cell having ‘1’.
//Now replace the entire diagonal cell of that with ‘0’ in which that cell is available.
public class JLQ7B {
	public static void main(String[] args) {
		char[][] a = { { 'a', 'b', '1', 'd', '1', 'f' },
				{ '3', 't', 'z', 'k', 'r', 's' },
				{ 'a', 'd', 'a', 'f', '1', 't' },
				{ 'b', 'h', 'j', 'm', 'p', 'a' },
				{ '1', 'f', 'g', 'u', 'r', 'b' } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] == '1') {
					for(int k=j+1,l=i;k<6&&l<4;k++) {
							l++;
							if(a[l][k] == '1') {
								a[l][k] = '1';
							}
							else if (k != j) {
							a[l][k] = '0';
						}
					}
					for(int k=j-1,l=i;k>=0&&l<4;k--) {
						l++;
						if(a[l][k] == '1') {
							a[l][k] = '1';
						}
						else if (k != j) {
						a[l][k] = '0';
					}
				}
				for(int k=j+1,l=i;k<6&&l>0;k++) {
						l--;
						if(a[l][k] == '1') {
							a[l][k] = '1';
						}
						else if (k != j) {
						a[l][k] = '0';
					}
				}
				for(int k=j-1,l=i;k>=0&&l>0;k--) {
					l--;
					if(a[l][k] == '1') {
						a[l][k] = '1';
					}
					else	if (k != j) {
					a[l][k] = '0';
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
