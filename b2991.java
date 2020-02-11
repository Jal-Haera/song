import java.util.Scanner;

public class dogdog {
	static int A, B, C, D, P, M, N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt(); // 멍1 A분 동안 공격적
		B = sc.nextInt(); // 멍1 쉬는 중
		C = sc.nextInt(); // 멍2 C분 동안 공격적
		D = sc.nextInt(); // 멍2 쉬는중
		P = sc.nextInt(); // 우체부의 도착시간
		M = sc.nextInt(); // 우유배달이 도착시간
		N = sc.nextInt(); // 신문 도착시간
		
		System.out.println(dog(P));
		System.out.println(dog(M));
		System.out.println(dog(N));
		
	}// main

	static int dog(int time) {
		int result=0;
		int barkA=1,barkB=1;
		int restA=A,restB=C;
		int tempA =time,tempB=time;

		while(true) {
//			System.out.println(barkA+" "+restA);
			if(barkA>time) break;
			if(tempA<=barkA) {
//				System.out.println("hello");
				result++;
				break; 
			}
			if(barkA<=tempA && tempA<=restA) {
//				System.out.println("world");
				result++;
			}
			barkA = restA+B+1;
			restA = barkA+A-1;
			
		}
		
		while(true) {
//			System.out.println(barkA+" "+restA);
			if(barkB>time) break;
			if(tempB<=barkB) {
//				System.out.println("hello");
				result++;
				break; 
			}
			if(barkB<=tempB && tempB<=restB) {
//				System.out.println("world");
				result++;
			}
			barkB = restB+D+1;
			restB = barkB+C-1;
			
		}
		return result;
	}
}
