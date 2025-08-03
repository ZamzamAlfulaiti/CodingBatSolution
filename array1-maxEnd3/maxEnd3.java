public int[] maxEnd3(int[] nums) {
  int maxNums = Math.max(nums[0],nums[2]);
  return new int[] { maxNums, maxNums, maxNums};
}