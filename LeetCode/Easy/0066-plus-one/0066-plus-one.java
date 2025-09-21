import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            sb.append(digits[i]);
        }
        BigInteger num = new BigInteger(sb.toString());
        BigInteger plusOne = num.add(BigInteger.ONE);
        String[] strs = String.valueOf(plusOne).split("");
        int[] answer = new int[strs.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(strs[i]);
        }
        return answer;
    }
}