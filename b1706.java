import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,M;
        N = sc.nextInt();
        M = sc.nextInt();
        char [][] map = new char [N][M];
        for(int i=0;i<N;i++){
            String s = sc.next();
            map[i] = s.toCharArray();
        }
        String temp ="",temp2="";
        String [] dic = new String[100];
        int dicnum=0;
        for(int i=0;i<N;i++){
            temp="";
            for(int j=0;j<M;j++){
                if(map[i][j]=='#') {
                    if(temp=="") continue;
                    if(temp.length()==1) {
                        temp="";
                        continue;
                    }
                    dic[dicnum++] = temp;
                    temp="";
                    continue;
                }
                temp+=map[i][j];
                if(j==M-1){
                    if(temp.length()==1) {
                        temp="";
                        continue;
                    }
                    dic[dicnum++] = temp;
                }
            }
        }

        for(int i=0;i<M;i++){
            temp2="";
            for(int j=0;j<N;j++){
                if(map[j][i]=='#') {
                    if(temp2=="") continue;
                    if(temp2.length()==1) {
                        temp2="";
                        continue;
                    }
                    dic[dicnum++] = temp2;
                    temp2="";
                    continue;
                }
                temp2+=map[j][i];
                if(j==N-1){
                    if(temp2.length()==1) {
                        temp2="";
                        continue;
                    }
                    dic[dicnum++] = temp2;
                }
            }
        }
        int sum=1000;
        int where=0;
        String [] dic2 = new String[dicnum];
        for(int i=0;i<dicnum;i++){
          //  System.out.println(dic[i]);
            dic2[i] = dic[i];
        char [] a = dic[i].toCharArray();
        int tempN=0;
        for(int j=0;j<2;j++){
            tempN += a[j];
        }
        if(tempN<sum) {
            sum = tempN;
            where =i;
        }
        }

        Arrays.sort(dic2);
        System.out.println(dic2[0]);
      //  System.out.println(dic[where]);
    }//main
}


