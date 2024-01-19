class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int right = 0, left =0 ;
        while(right<s.length()){
           while(map.containsKey(s.charAt(right))){
                 map.remove(s.charAt(left));
               left +=1;
           }
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            count = Math.max(count,(right-left + 1));
            right +=1;
        }
        return count;
    }
}