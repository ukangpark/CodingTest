class Solution {
    public int solution(int slice, int n) {
        int pizza = 0;
        if (n%slice==0) {
            return pizza = (n/slice);
        }else {
            return pizza = (n/slice) + 1;
        }
        
    }
}