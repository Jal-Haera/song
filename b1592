import java.util.Scanner;

public class throwball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,M,L;
        N = sc.nextInt();
        M = sc.nextInt();
        L = sc.nextInt();
        int [] man = new int[N+1];
        int max=1;
        int start=1;
        int result=0;
        while(true){

            man[start]++;
            if(man[start]==M) break;
         //   System.out.println(start);
            result++;
            if(man[start]%2==1){
                start = start+L;
                if(start>N) start = start-N;
            }
            else if(man[start]%2==0) {
                start = start-L;
                if(start<=0) start = start +N;
            }

        }
        System.out.println(result);

    }
}
