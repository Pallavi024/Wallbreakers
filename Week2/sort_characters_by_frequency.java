import java.util.*; 
import java.lang.*; 
import java.io.*;
class valuecomparator implements Comparator <Map.Entry<Character,Integer>> {
    
    @Override
    public int compare (Map.Entry<Character,Integer> o1, Map.Entry<Character,Integer> o2){
        
        return o2.getValue().compareTo(o1.getValue());
    }
}

class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        StringBuilder res = new StringBuilder();
        
        for(char ch : s.toCharArray())
        	map.put(ch,map.getOrDefault(ch, 0) + 1);
        List<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(map.entrySet());
        
        valuecomparator vc = new  valuecomparator();
        
        list.sort(vc);

        for(Map.Entry<Character, Integer> map2 : list) {
        	char ch = map2.getKey();
        	int freq = map2.getValue();
        	while(freq-- > 0)
        		res.append(ch);
        }
        return res.toString();
        
    }
}