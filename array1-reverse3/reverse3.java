public int[] reverse3(int[] nums) {
  int[] nums2 = new int [3];
  for (int i = 0; i < nums.length; i++) {
    nums2[i] = nums[nums.length - 1 - i];
  }
  return nums2;
}