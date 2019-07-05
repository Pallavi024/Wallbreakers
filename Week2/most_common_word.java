class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph += ".";

        Set<String> set = new HashSet();
        for(int i=0;i<banned.length;i++)
            set.add(banned[i]);
        Map<String, Integer> map = new HashMap();

        String ans = "";
        int ansfreq = 0;

        StringBuilder word = new StringBuilder();
        for (char c: paragraph.toCharArray()) {
            if (Character.isLetter(c)) {
                word.append(Character.toLowerCase(c));
            } else if (word.length() > 0) {
                String finalw = word.toString();
                if (!set.contains(finalw)) {
                    map.put(finalw, map.getOrDefault(finalw, 0) + 1);
                    if (map.get(finalw) > ansfreq) {
                        ans = finalw;
                        ansfreq = map.get(finalw);
                    }
                }
                word = new StringBuilder();
            }
        }

     return ans;
    }
}