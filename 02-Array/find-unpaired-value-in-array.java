/** 
Description: Find value that occurs in odd number of elements.
             The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
             Return that 1 unpaired value in an array
Examples:
A = [9, 3, 9, 7, 6, 7, 6] the unpaired value in given array is 3, because it occurs only once
**/

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        if(A.length == 1)
            return A[0];

        int i = 0;
        Arrays.sort(A);
        while(i < A.length-1) {
            if(A[i] != A[i+1])
                return A[i];

            i = i+2;
        }
        return A[A.length-1];
    }
}
