import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		int [][]paper = new int [101][101]; 
		for (int i = 0; i < N; i++) {
			int x =sc.nextInt();
			int y = sc.nextInt();
			//System.out.println(x+" "+y);
			for(int j=y;j<y+10;j++) {
				for(int k=x;k<x+10;k++) {
					paper[j][k]=1;
				}
			}
		}

		for(int i=0;i<101;i++) {
			for(int j=0;j<101;j++) {
				if(paper[i][j]==1 )result++;
				
				//System.out.print(paper[i][j]);
			}
			//System.out.println();
		}
	//	System.out.println();
		System.out.println(result);
	}//main
}

