/*Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
*/


class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n=nums.length,i,j,count=0;
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(nums[i]==nums[j] && i<j){
                    count++;
                }
            }
        }
        return count;
    }
}
