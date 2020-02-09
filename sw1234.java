import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC=10,N;
        String s;

        for(int i=0;i<TC;i++){
            N = sc.nextInt();
            s = sc.next();
            char [] pw = s.toCharArray();
            Stack<Integer> stack = new Stack<Integer>();
            int [] result;
            for(int j=0;j<N;j++){
                if(stack.isEmpty()){
                    stack.push(pw[j]-'0');
                    continue;
                }
                if(stack.peek()==pw[j]-'0') {
                    stack.pop();
                }
                else {
                    stack.push(pw[j]-'0');
                }

            }//N

            result = new int[stack.size()];
            for(int j=stack.size()-1;j>=0;j--){
                result[j] = stack.pop();
            }
            String ans = "";
            for(int x : result){
                ans+= x;
            }
            System.out.printf("#%d %s\n",i+1,ans);
        }//TC

    }//main
}//Class

