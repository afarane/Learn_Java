package hackerrank.java.basic;
import java.io.*;
import java.util.*;

public class Java_Static_initializer_Block {
    static int B,H;
    public static void main(String[] args) {
        // https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
        
        Scanner sc = new Scanner(System.in);
         B = sc.nextInt();
         H = sc.nextInt();
        if(B<= 0 || H <= 0){
             
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            System.out.println(B*H);
        }
       
    }
}