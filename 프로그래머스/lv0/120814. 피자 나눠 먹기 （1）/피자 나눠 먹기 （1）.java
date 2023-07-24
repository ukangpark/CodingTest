class Solution {
    public int solution(int n) {
        int pizza = 0;
        
        if(n%7 == 0) {
            return pizza = n / 7;
        }else {
            return pizza = (n / 7) + 1;
        }
    }
}