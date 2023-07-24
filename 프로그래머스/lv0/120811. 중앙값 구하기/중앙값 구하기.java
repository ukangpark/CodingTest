import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int result = 0;
        for (int i=0; i<array.length; i++) {
            Arrays.sort(array);
            result = array[array.length/2];
        }
        return result;
    }
}