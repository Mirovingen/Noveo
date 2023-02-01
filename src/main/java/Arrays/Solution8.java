package Arrays;
// Time complexity O(N)
// Space complexity O(1)
public class Solution8 {
    public int trap(int[] height) {
        int left_max = 0,right_max = 0;
        int left=0, right=height.length- 1, ans= 0;
        while (left < right){
            if (height[left] < height[right]){
                if (height[left] > left_max){
                    left_max = height[left];
                }else{
                    ans += left_max - height[left];
                    left++;
                }
            }else{
                if (height[right] > right_max){
                    right_max = height[right];
                }else{
                    ans += right_max - height[right];
                    right--;
                }
            }
        }
        return ans;
    }
    // Time complexity O(K*N) haha, who know leetcode uses array bigger than 65kb which invokes "code too large"
    // Space complexity O(1)
    public int trap2(int[] height) {

        int h = 1;
        int count = 0;

        boolean rocks_exist = true;

        while (rocks_exist){
            rocks_exist = false;
            boolean open = false;
            int temp_count = 0;
            for (int i = 0; i < height.length; i++){
                if (height[i] >= h){
                    count += temp_count;
                    temp_count = 0;
                    open = true;
                    rocks_exist = true;
                } else if (height[i] < h && open){
                    temp_count++;
                }
            }
            h++;
        }
        return count;
    }
}
