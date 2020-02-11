import java.util.Scanner;

public class rollcake {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int N = sc.nextInt();
		int [][] box = new int[N+1][2];
		int [] cake = new int[L+1];
		int max=0;
		int real_max=0;
		int man=0;
		int real_man=0;
		for(int i=1;i<=N;i++) {
			int cake_s= sc.nextInt();
			int cake_e = sc.nextInt();
			if(max<cake_e-cake_s) {
				max = cake_e-cake_s;
				man=i;
			}
			int temp=0;
			for(int j=cake_s;j<=cake_e;j++) {
				if(cake[j]!=0) continue;
				cake[j]= i; 
				temp++;
			}
			if(temp>real_max) {
				real_max = temp;
				real_man=i;
			}
		}
		System.out.println(man);
		System.out.println(real_man);
	}
}
