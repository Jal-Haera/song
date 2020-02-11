import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class b14889 {
	static int [] gr;
	static int N;
	static boolean []visited;
	static int [][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		map = new int [N+1][N+1];
		gr = new int[N/2+1];
		visited = new boolean [N+1];
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				map[i][j]=sc.nextInt(); 
			}
		}
		
		group(1,1);
		System.out.println(result);
	}//main
	static int result=1000;
	static void group(int cnt,int begin) {
		int min=1000;
		int temp1=0,temp2=0;
		if(cnt==gr.length) {
			for(int i=1;i<gr.length;i++) {
				visited[gr[i]] = true;
			}
			for(int i=1;i<visited.length;i++) {
				for(int j=i+1;j<visited.length;j++) {
					if(visited[i]&& visited[j] ) temp1+=map[i][j]+map[j][i]; 
					if(!visited[i]&&!visited[j] ) temp2+=map[i][j]+map[j][i]; 
				}
			}
		}
		//----------------------------
		if(cnt>=gr.length) {
			for(int i=1;i<visited.length;i++) {
				visited[i]= false; 
			}
			if(Math.abs(temp1-temp2)<min) min = Math.abs(temp1-temp2);
			if(result>min) result= min;
		//	System.out.println(result);
			return;
		}
		//----------------------------
		for(int i=begin;i<=N;i++) {
			gr[cnt]=i; 
			group(cnt+1,i+1);
		}
	}//group
}
