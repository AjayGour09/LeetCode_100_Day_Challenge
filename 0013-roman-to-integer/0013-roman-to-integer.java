import java.util.*;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Loop from end to start
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanMap.get(s.charAt(i));

            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }

            prevValue = currValue;
        }

        return result;
    }

    // Main method to test
    public static void main(String[] args) {
        Solution sol = new Solution();
        String roman = "MCMXCIV";
        System.out.println("Roman numeral " + roman + " = " + sol.romanToInt(roman));
    }
}
