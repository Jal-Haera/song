import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dx[] ={0,1,0,-1};
        int dy[] ={-1,0,1,0}; //up right down left
        int [][]map = new int [101][101];
        int N =sc.nextInt();
        for(int i=0;i<N;i++){
            int x =sc.nextInt();
            int y = sc.nextInt();
//            for(int j=y;j<y+10;j++) {
//                map[j][x] =1;
//                map[j][x+9] =1;
//
//            }
//            for(int k=x;k<x+10;k++) {
//                map[y][k]=1;
//                map[y+9][k]=1;
//
//            }
            for(int j=y;j<y+10;j++) {
                for(int k=x;k<x+10;k++) {
                map[j][k]=1;
            }
            }
        }//make map
        int temp=0;
        for(int i=0;i<101;i++){
            for(int j=0;j<101;j++){
                //System.out.print(map[i][j]);
                if(map[i][j]==1) {
                    int ny=0;
                    int nx=0;
                    for(int k=0;k<4;k++){
                        ny = dy[k] + i;
                        nx = dx[k] + j;
                        if(ny>=0 || ny<100 || nx>=0||ny<100 ){
                            if(map[ny][nx] ==0)
                                temp++;
                        }

                    }
                }
            }
           // System.out.println();
        }
        System.out.println(temp);

    }//main
}

