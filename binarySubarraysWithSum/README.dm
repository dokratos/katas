# 930. Binary Subarrays With Sum

Medium - Leetcode

Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.

A subarray is a contiguous part of the array.

## Algomonster walk through

The solution to the subarray sum problem implements a variation of the two-pointer technique which helps to optimize the search for subarrays that add up to the goal. Here's a step-by-step explanation:

Initialize two pairs of pointers i1, i2 and their corresponding sums s1, s2 to 0. These will be used to manage two sliding windows. Also, initialize a pointer j to extend the window and ans to accumulate the number of valid subarrays found.
Iterate over the array with the main pointer j. For each element nums[j] being considered:
Add nums[j] to both s1 and s2, which represents attempting to add the current element to our current subarray sums.
If s1 exceeds the goal, shrink the first window:
Subtract nums[i1] from s1 and increment i1 to reduce the window from the left, doing this until s1 is no longer greater than goal.
Similarly, if s2 is at least the goal, shrink the second window:
Subtract nums[i2] from s2 and increment i2 to reduce the window from the left, doing this until s2 is smaller than goal.
After adjusting both windows, calculate the number of new subarrays found:
The difference i2 - i1 tells us how many valid subarrays end at j with the desired sum goal because those will be the subarrays contained within the window tracked by i2 but not yet by i1.
Add this difference to ans which tallies our result.
Repeat steps 2 through 5 as you move the pointer j to the right until you've processed every element in the array.
Once the iteration is complete, ans holds the final count of subarrays whose sum is equal to goal.
This code efficiently finds all subarrays with the desired sum in linear time.