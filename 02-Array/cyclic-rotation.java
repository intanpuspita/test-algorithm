/** 
Description: Rotate the array, K times. 
             Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place
Examples:
  1. A = [3, 8, 9, 7, 6], K = 3, the rotated array will be [9, 7, 6, 3, 8]
**/

class Solution {
    public int[] solution(int[] A, int K) {
        if(A.length == 0 || K == 0 || K % A.length == 0)
            return A;

        if(K > A.length)
            K = K % A.length;

        int[] rotatedArray = new int[A.length];

        for(int i=0; i<A.length; i++) {
            int newIndex = i + K;
            newIndex = newIndex > A.length-1 ? newIndex - A.length : newIndex;
            rotatedArray[newIndex] = A[i];
        }

        return rotatedArray;
    }
}
