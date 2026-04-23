package hackerrank.java.basic;
import java.util.Scanner;

public class Java_Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean result =  false;
        
        a = a.replace(" ", "").toLowerCase();
        b = b.replace(" ", "").toLowerCase();
        
        char[] c = a.toCharArray();
        char[] d = b.toCharArray();
        
        java.util.Arrays.sort(c);
        java.util.Arrays.sort(d);
        
        if(java.util.Arrays.equals(c, d)){
            result = true;
        }
        return result;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
