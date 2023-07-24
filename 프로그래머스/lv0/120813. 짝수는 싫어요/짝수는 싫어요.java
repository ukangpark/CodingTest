class Solution {
    public int[] solution(int n) {
        int len = (n+1)/2;
        int[] result = new int[len];
        int num = 1;
        for(int i=0; i<len; i++) {
                result[i] = num;
            num+=2;
        }
        return result;
    }
}