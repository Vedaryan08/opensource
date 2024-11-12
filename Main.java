import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0;i<T;i++){
            int N=sc.nextInt();
            int M=sc.nextInt();
            if(M>N){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
