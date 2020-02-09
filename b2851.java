import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int min = 100;

		// 조건 1 한번 패스하면 그 후 다 패스
		// 100 과 가깝게 둘다 비슷하면 더 큰 값으로
		int flag=0;
		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			int plus = Math.abs(a + result - 100);
			int now = Math.abs(a - 100);
			
			if (plus <= now) {
				if(plus==min) {
					result+=a;
					break;
				}
				if (plus < min) {
					if(i-flag>1) break;
					//System.out.println(i);
					min = plus;
					result += a;
					flag=i;
				}
			}
			//System.out.print(result+" ");
//			System.out.println(plus+" "+now+" "+min);
		
		}//i
		System.out.println(result);
	}
}

