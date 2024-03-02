/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortedSquares = function(nums) {
  let i = 0;
  for (let num of nums) {
      nums[i] = num*num;
      i++;
  }

  return nums.sort((a, b) => a - b);
};