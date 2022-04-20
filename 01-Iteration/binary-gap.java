/** 
Description: Returns maximal sequence of consecutive zeros that is surrounded by ones at both ends
Examples:
  1. N = 15, binary = 1111, the maximum consecutive zeros will be 0
  2. N = 1041, binary = 10000010001, the maximum consecutive zeros will be 5
  3. N = 32, binary = 100000, the maximum consecutive zeros will be 0
**/

class Solution {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        char[] num = binary.toCharArray();

        int countGap = 0;
        int longest_gap = 0;
        boolean start = false;
        for(Character x : num) {
            if(x == '1') {
                if(countGap > longest_gap)
                    longest_gap = countGap;

                countGap = 0;
                start = true;
            } else {
                if(start)
                    countGap++;
            }
        }
        return longest_gap;
    }
}
