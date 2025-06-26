import java.util.HashSet;

public class Q_2351 {
  public char repeatedCharacter(String s) {
    // method 1

    // char ch[] = new char[26];
    // for(int i=0; i<s.length(); i++){
    // ch[s.charAt(i)-'a']++;
    // for(int j=0; j<26; j++){
    // if(ch[j] == 2){
    // return s.charAt(i);
    // }
    // }
    // }
    // return 'm';

    // method 2

    HashSet<Character> set = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      if (set.contains(s.charAt(i))) {
        return s.charAt(i);
      } else {
        set.add(s.charAt(i));
      }
    }
    return 'm';
  }
}
