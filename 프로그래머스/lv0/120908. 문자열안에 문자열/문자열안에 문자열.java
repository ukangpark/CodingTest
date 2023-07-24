class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int location = str1.indexOf(str2);
        for(int i=0; i<str1.length(); i++) {
            if (location != -1) {
                answer = 1;
            }else {
                answer = 2;
            }
        }
        return answer;
    }
}