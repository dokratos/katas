/**
 * @param {number[]} nums
 * @return {number}
 */
var maxFrequencyElements = function(nums) {
  if (nums.length === 1) return 1;
  nums.sort((a, b) => a - b);

  const frequencies = [];
  let ref = nums[0];
  let count = 0;
  let maxFrequency = 0;

  for (n of nums) {
      if (n === ref) {
          count++;
      } else {
          if (maxFrequency < count) maxFrequency = count;
          frequencies.push(count);
          ref = n;
          count = 1;
      }
  }
  frequencies.push(count);
  if (frequencies.length === 1) return count;
  if (maxFrequency < count) maxFrequency = count;
  let sum = 0;

  for (f of frequencies) {
      if (f === maxFrequency) {
          sum += f;
      }
  }

  return sum;
};