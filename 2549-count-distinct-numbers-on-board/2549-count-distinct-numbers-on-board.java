class Solution {
    public int distinctIntegers(int n) {
        int count = 0;
        if(n == 1){
            return n;
        }
        return n-1;
    }
}