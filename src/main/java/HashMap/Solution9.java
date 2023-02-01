package HashMap;

import java.util.HashMap;
// Time complexity O(N)
// Space complexity O(1)
public class Solution9 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++){

            if (map.containsKey(nums[i])){
                return new int[] { map.get(nums[i]), i };
            }
            map.put(target - nums[i], i);
        }
        return new int[1];
    }
}
