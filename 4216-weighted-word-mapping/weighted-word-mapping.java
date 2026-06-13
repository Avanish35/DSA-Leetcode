class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sol = new StringBuilder();

        for(String w : words){
            int tot = 0;

            for(char f : w.toCharArray()){
                int i = f-'a';
                tot = tot + weights[i];
            }
            int m = tot % 26;
            char mchar = (char)('z' - m);

            sol.append(mchar);
        }
        return sol.toString();
    }
}