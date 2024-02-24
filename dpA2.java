import java.util.*;
public class dpA2 {
  public static int tribo(int n) {
    // int a = 0,b = 1,c = 1;
    // int d = 0;
    // for(int i=2;i<n;i++) {
    //   d = a+b+c;
    //   a=b;
    //   b=c;
    //   c=d; 
    //}
    int res[] = new int[n+1];
    res[0] = 0;
    res[1] = 1;
    res[2] = 1;
    if(n<3) return n==0?0:1;
    for(int i=3;i<=n;i++) {
        res[i] = res[i-1]+res[i-2]+res[i-3];
    }
    return res[n];
  }
    public static void main(String[] args) {
        //System.out.println("hello");
        int n = 25;
        System.out.println("Nth tribonacci is :-> "+tribo(n));
    }
}