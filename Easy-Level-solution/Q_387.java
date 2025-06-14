class Q_387 {
  public int firstUniqChar(String s) {
    char ch[] = s.toCharArray();
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
    }

    for (int i = 0; i < s.length(); i++) {
      if (map.get(ch[i]) == 1) {
        return i;
      }
    }
    return -1;
  }
}