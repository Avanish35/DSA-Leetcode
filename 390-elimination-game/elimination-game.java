class Solution {
    public int lastRemaining(int n) {
        int head = 1;
        int step = 1;
        int rem = n;

        for(int i=0; rem>1; i++){
            if(i%2==0 || rem%2==1){
                head += step;
            }
            step *= 2;
            rem /= 2;
        }
        return head;
    }
}