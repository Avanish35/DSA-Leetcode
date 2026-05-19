class Solution {
    public boolean isValid(String word) {
        boolean ans = true;
        if(word.length()<3){
            return false;
        }
        boolean hasvowel = false;
        boolean hasconso = false;

        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    hasvowel = true;
                } else {
                    hasconso = true;
                }
            }
        }
        return hasvowel && hasconso;
        }
    }
