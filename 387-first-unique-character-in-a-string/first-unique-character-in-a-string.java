class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            char currCh = s.charAt(i);
            int index = currCh -'a';
            freq[index]++; 
        }
        for(int i=0;i<s.length();i++){
            char currCh = s.charAt(i);
            int index = currCh -'a';
            if(freq[index]==1){
                return i;
            }
        }
        return -1;
    }
}