import java.util.Scanner;

public class crossword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] A = sc.next().toCharArray();
		char[] B = sc.next().toCharArray();

	//	int len  = A.length>B.length? B.length : A.length;
		char crossword=0;
		int y=0,x=0;
		for(int i=0;i<A.length;i++) {
			if(crossword!=0) break;
			for(int j=0;j<B.length;j++) {
				if(A[i]==B[j]) {
					crossword =A[i];
					x=i;
					y=j;
					break;
				}
			}
		}
		char [][] result = new char [B.length][A.length];
		for(int i=0;i<B.length;i++) {
			for(int j=0;j<A.length;j++) {
				if(j==x && i!=y) {
					result[i][j] = B[i];
				}
				else if(i==y) {
					result[i][j]=A[j]; 
				}
				else result[i][j]= '.'; 
			}
		}
		for(int i=0;i<B.length;i++) {
			for(int j=0;j<A.length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		
	}//main

}
