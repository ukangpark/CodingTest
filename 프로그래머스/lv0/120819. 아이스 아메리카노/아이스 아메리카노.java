class Solution {
    public int[] solution(int money) {
        int qty = 0;
        int price = 0;
        
        
        if(money%5500==0) {
            qty = money/5500;
            price = money - qty*5500;
        }else {
            qty = money/5500;
            price = money - qty*5500;
        }
        
        int[] answer = {qty, price};
        return answer;
    }
}