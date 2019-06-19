/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */
class Solution {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int length = new Solution().removeElement(nums, val);
        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }

    public int removeElement(int[] nums, int val) {
        // 指向将要插入的位置,在new_point增加时，需要设置当前值
        int new_point = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[new_point] = nums[i];
                new_point++;
            }
        }
        return new_point;
    }
}
