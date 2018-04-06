import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        Map<Integer,Integer> sock = new HashMap<>();
        int pair=0;
        for(int i =0 ; i<n;i++){
        if(sock.containsKey(ar[i])){
            Integer a = sock.get(ar[i]);
            a++;
            if(a==2){
                pair++;
                sock.put(ar[i],0);
            }
            else{
                sock.put(ar[i],a);
            }
        }
        else{
            sock.put(ar[i],1);
        }
        }
        return pair;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
