class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                return new int[] {nums[j], j + 1};
            }
        }

        return new int[] {-1, -1};
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
