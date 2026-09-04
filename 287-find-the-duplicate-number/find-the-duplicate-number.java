class Solution {
    public int findDuplicate(int[] nums) {
        cyclic(nums);
        int i = 0, ans = 0;
        while (i<nums.length) {
            if(nums[i]!=i + 1){
                ans = nums[i];
            } 
            i++;
        }
        return ans;
    }

    static void cyclic(int[] arr){
        int i = 0;
        while (i<arr.length) {
            if(arr[i]!=arr[arr[i]-1]){
                swap(arr, i, arr[i]-1);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}