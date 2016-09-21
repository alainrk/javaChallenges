/* From https://www.codewars.com/kata/duplicate-encoder/train/java

The goal of this exercise is to convert a string to a new string where each character in the new string is '(' if that character appears only once in the original string, or ')' if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

Examples:

"din" => "((("

"recede" => "()()()"

"Success" => ")())())"

"(( @" => "))(("

*/

import java.util.*;

public class DuplicateEncoder {
	static String encode(String word){
    int count;
    HashMap<String, Integer> hmap = new HashMap<String, Integer>();
    word = word.toLowerCase();

    for (int i = 0; i < word.length(); i++){
      String c = word.charAt(i) + ""; // Conversion
      try {
        count = hmap.get(c);
      } catch (NullPointerException e) {
        count = 0;
      }
      hmap.put(c, count + 1);
    }

    String res = "";
     for (int i = 0; i < word.length(); i++){
      String c = word.charAt(i) + ""; // Conversion
      count = hmap.get(c);
      res += (count == 1) ? "(" : ")";
    }
    return res;
  }
}
