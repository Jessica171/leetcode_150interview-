class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int total = 0;
        int prev = 0;

        for(char z : s.toCharArray()){
            int value = map.get(z);
            
            if (value > prev){
                total -= prev;
                total += value - prev;
            }
            else {
                total += value;
            }
            prev = value;
        }  
        return total;
    }
}