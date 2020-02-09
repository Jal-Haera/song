import java.util.Scanner;

public class Main {
    static int [] result;
    static boolean []visited;
    static int N,M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        result = new int[M+1];
        visited = new boolean[N+1];
        nm(1);
    }//main
    static void nm(int cnt){
        if(cnt>=result.length){
            for(int i=1;i<=M;i++){
                System.out.printf("%d ",result[i]);
            }
            System.out.println();
            return;
        }
        for(int i=1;i<=N;i++){
            if(visited[i]==false){
                result[cnt] = i;
                visited[i] = true;
                nm(cnt+1);
                visited[i] = false;
            }
        }
    }//nm
}


