import java.util.Arrays;
import java.util.Scanner;

public class 최적경로 {
	static int N;
	static int[][] map;
	static boolean[] visited;
	static int home1,home2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			map = new int[N][2];
			visited = new boolean[N];
			int com1 = sc.nextInt();
			int com2 = sc.nextInt();
			home1 = sc.nextInt();
			home2 = sc.nextInt();
			for (int i = 0; i < N; i++) {
				map[i][0] = sc.nextInt();
				map[i][1]= sc.nextInt();
				
			}
			result = 1000;
			
			dfs(com1, com2, 0, 0);
			System.out.printf("#%d %d\n",tc,result);

		} // tc
	}// main

	static int result;

	// 회사 시작 집으로 돌아오기
	static void dfs(int x, int y, int depth, int distance) {
		if (depth == N) {
			int temp = Math.abs(x-home1)+Math.abs(y-home2);
			distance+=temp;
			if (result > distance)
				result = distance;
			return;
		}
		for(int i=0;i<N;i++) {
			if(visited[i]) continue;
			int dis =  Math.abs(x-map[i][0])+Math.abs(y-map[i][1]);
			 if(dis+distance>result) continue;
			visited[i]= true; 
			dfs(map[i][0], map[i][1], depth+1, distance+dis);
			visited[i]=false; 
		}
	
	}

}
