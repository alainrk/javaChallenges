import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Encryption {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int curr = 0;
        char res[] = new char[s.length()];

        double sq = Math.sqrt(s.length());
        int col = (int) sq;
        int row = (int) Math.ceil(s.length() / col);
        int l = (Math.floor(sq) <= row && row <= col && col <= Math.ceil(sq)) ? col : col+1;

        for (int i=0; i<l; i++){
          for (int j=i; j<s.length(); j+=l){
            res[j] = s.charAt(curr);
            curr++;
          }
        }

        String r = new String(res), ret = "";

        for (int i=0; i<s.length(); i+=l){
          ret += r.substring(i, Math.min(i+l, s.length())) + " ";
        }

        System.out.println(ret.trim());
    }
}
