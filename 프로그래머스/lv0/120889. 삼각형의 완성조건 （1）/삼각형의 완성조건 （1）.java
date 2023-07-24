import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        
        int a = 0;
        Arrays.sort(sides);
        if(sides[sides.length-1] < (sides[0] + sides[1])) {
            a = 1;
        }else {
            a = 2;
        }
        return a;
    }
}