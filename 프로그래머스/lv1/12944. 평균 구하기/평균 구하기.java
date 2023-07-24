class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        int count = 0;
        
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
            count++;
        }
        return (double)sum/count;
    }
}