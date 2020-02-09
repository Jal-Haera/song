import java.util.Scanner;

public class farm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result;
        for(int TC=1;TC<=N;TC++){
            int n = sc.nextInt();
            char [][] box = new char [n][n];
            result=0;

            for(int i=0;i<n;i++){
                String s = sc.next();
                box[i] = s.toCharArray();

            }

            //13531
            int begin=n/2;
            int end =1;
            int beginflag=0;
            for(int i=0;i<n;i++){
                for(int j=begin;j<begin+end;j++){
                   // System.out.println(begin+" "+end);
                    //System.out.print(box[i][j]+" ");
                    result+=(box[i][j]-'0');
                }
                if(beginflag==0) {
                    begin --;
                    end +=2;
                }
                if(beginflag==1){
                    begin++;
                    end-=2;
                }
                if(begin==0) beginflag=1;

            }

            System.out.printf("#%d %d\n",TC,result);
        }//tc
    }
}
