package com.kky;

import java.util.ArrayList;

/**
 * @author 柯凯元
 * @date 2021/08/21 16:24
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = new int[2];
        nums[0] = 1;
        nums[1] = 2;
        Solution solution = new Solution();
        solution.moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int i = 0;
        for (int j = 0; j < length; j++) {
            if (nums[j] != 0) {
                if (i != j) {
                    int temp = nums[i];
                    nums[i++] = nums[j];
                    nums[j] = temp;
                }

            }
        }
    }
}