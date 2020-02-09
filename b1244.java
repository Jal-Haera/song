import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//남학생은 자기가 받은 수의 배수이면 상태 *-1
		//여학생은 좌우 대칭 찾아서 안의 값 다 *-1
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int []sw = new int[N+1];
		for(int i=1;i<=N;i++) {
			sw[i]= sc.nextInt();
			// on - 1 off -0
		}
		int stu = sc.nextInt();
		for(int i=0;i<stu;i++) {
			//boy -1 girl -2
			int gender = sc.nextInt();
			int sw_num = sc.nextInt();
			switch(gender) {
			case 1:
				int k=1;
				while(true) {
					if(sw_num*k>N) break;
					if(sw[sw_num*k]==1) sw[sw_num*k] =0;
					else sw[sw_num*k]=1;
					k++;
				}
				break;
			case 2:
				int left = sw_num-1;
				int right = sw_num+1;
				if(sw[sw_num]==1) sw[sw_num] =0;
				else sw[sw_num] =1;
				while(true) {
				
					if(left<=0 || right>N) break;
					if(sw[left]!=sw[right])break;
					if(sw[left]==0) {
						sw[left]=1;
						sw[right]=1;
					}
					else{
						sw[left]=0;
						sw[right]=0;
					}
					left--;
					right++;
				}
				break;
			}
		}
		for(int i=1;i<=N;i++) {
			System.out.print(sw[i]+" ");	
			if(i%20==0)System.out.println();
		}
	}
}

