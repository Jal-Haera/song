import java.util.Scanner;

public class sw7272 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result;
        for(int TC=1;TC<=N;TC++){
            String s1 = sc.next();
            String s2 = sc.next();
            result=0;
            //b는 구분
            //adopqr 는 같이

            if(s1.length()!=s2.length()) {
                result=-1;
                System.out.printf("#%d DIFF\n",TC);
                continue;
            }
            char [] c1 = new char[s1.length()];
            char [] c2 = new char[s2.length()];
            c1 = s1.toCharArray();
            c2 = s2.toCharArray();
            int [] i1 = new int[s1.length()];
            int [] i2 = new int[s2.length()];
           for(int i=0;i<s1.length();i++){
               if(c1[i]=='B') i1[i] = 2;
               else if(c1[i]=='A' || c1[i]=='D' || c1[i]=='O' || c1[i]=='P' || c1[i]=='Q' || c1[i]=='R') i1[i]=1;

           }
           for(int i=0;i<s2.length();i++){
               if(c2[i]=='B') i2[i] = 2;
               else if(c2[i]=='A' || c2[i]=='D' || c2[i]=='O' || c2[i]=='P' || c2[i]=='Q' || c2[i]=='R') i2[i]=1;

           }

           for(int i=0;i<s1.length();i++){
            if(i1[i] !=i2[i]) result =-1;
           }

            if(result!=0)  System.out.printf("#%d DIFF\n",TC);
            else  System.out.printf("#%d SAME\n",TC);
        }///TC
    }
}
