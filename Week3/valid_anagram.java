class Solution {
    public boolean isAnagram(String s, String t) {
        
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        s = String.valueOf(arr1);
        t = String.valueOf(arr2);
        if(s.equals(t))
            return true;
        return false;
    }
}