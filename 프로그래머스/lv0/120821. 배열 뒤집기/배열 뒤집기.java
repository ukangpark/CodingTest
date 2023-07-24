class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        int index = 0;
        for(int j=num_list.length-1; j>=0; j--) {
        answer[index] = num_list[j];
            index++;

        }
        return answer;
    }
}