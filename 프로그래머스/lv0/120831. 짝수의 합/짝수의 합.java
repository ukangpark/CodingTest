class Solution {
    public int solution(int n) {
        // int i = 1;
        // int sum = 0;
        // while (i <= n) {
        //     if(i%2 == 0) {
        //     sum += i;
        //     }
        //     i++;
        // }
        // return sum;
        
        int sum = 0;
        for (int i=0; i<=n; i+=2) {
            sum += i;
        }
        return sum;
    }
}