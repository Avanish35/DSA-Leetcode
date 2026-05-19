class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String sorted1 = new String(ch1);
        String sorted2 = new String(ch2);
        int i=0;
        int j=0;
        boolean ana = true;
        if(sorted1.length()!=sorted2.length()){
            return false;
        }
        while(i<sorted1.length() && j<sorted2.length()){
            if(sorted1.charAt(i)!=sorted2.charAt(j)){
                ana = false;
            }
            i++;
            j++;
        }
        return ana; 
    }
}