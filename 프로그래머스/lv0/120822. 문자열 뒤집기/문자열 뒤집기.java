class Solution {
    public String solution(String my_string) {
        String str = "";
        for (int i=my_string.length(); i>=1; i--) {
            str += my_string.charAt(i-1);
        }
        return str;
    }
}