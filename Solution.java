import java.util.HashMap;

class Solution {
  public static char mostFrequentChar(String s) {
      char most_freq = s.charAt(0);
      //Hash map for frequency and index
      HashMap<Character, Integer> h_map = new HashMap<Character, Integer>();
      HashMap<Character, Integer> char_first_index = new HashMap<Character, Integer>();
      for(int i = 0; i < s.length();i++){
        //check if hashmap has key
        if(h_map.containsKey(s.charAt(i))){
          //update entry
          h_map.put(s.charAt(i), h_map.get(s.charAt(i))+1);
        }
        else{ 
          //add new entry
          h_map.put(s.charAt(i), 1);
          char_first_index.put(s.charAt(i), i);
        }
        //check if frequency is higher or if tie
        if(h_map.get(s.charAt(i))>h_map.get(most_freq)||(h_map.get(s.charAt(i))==h_map.get(most_freq) && char_first_index.get(s.charAt(i))<char_first_index.get(most_freq))){
          most_freq = s.charAt(i);
        }
      }
      return most_freq;
    }

  public static void main(String[] args) {
    // Try out your test cases:
    System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'
    System.out.println(Solution.mostFrequentChar("david")); // -> 'd'
    System.out.println(Solution.mostFrequentChar("mississippi")); // -> 'i'
    System.out.println(Solution.mostFrequentChar("eleventennine")); // -> 'e'
  }

}
