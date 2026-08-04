class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missingElements = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            int current = nums[i];
            int next = nums[i + 1];

            for (int missing = current + 1; missing < next; missing++) {
                missingElements.add(missing);
            }
        }

        return missingElements;
    }
}