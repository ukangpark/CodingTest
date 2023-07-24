import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int num1 = 0;
        int num2 = 0;
        Arrays.sort(numbers);
        num1 = numbers[numbers.length-2];
        num2 = numbers[numbers.length-1];
        return num1 * num2;
    }
}