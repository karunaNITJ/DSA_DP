import java.util.*;
public class dpA4 {
    static int count = 0;
    public static void print(int sr,int sc,int er,int ec,String s) {
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec) {
            System.out.println(s);
            count++;
            return;
        }
        print(sr,sc+1,er,ec,s+"R");
        print(sr+1,sc,er,ec,s+"D");
    }
    public static void main(String[] args) {
        int m = 3,n = 2;
        System.out.println("Unique paths are:- ");
        print(1,1,m,n,"");
        System.out.println("Unique path is:-> "+count);
    }
}
