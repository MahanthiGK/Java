/*You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
Letters are case sensitive, so "a" is considered a different type of stone from "A".
Example 1:
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
*/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int i,j,count=0;
        int n=stones.length();
        int m=jewels.length();
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(stones.charAt(i)==jewels.charAt(j)){
                    count++;
                }
            }
        }
        return count;        
    }
}
