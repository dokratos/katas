const findSubArray = array => {
  array.sort();
  let subLen = 0;
  let count = 0;
  let index = 0;

  for (let i = 1; i < array.length; i++) {
    if (Math.abs(array[index] - array[i]) <= 1) {
      count++;
    } else {
      if (count > subLen) subLen = count;
      count = 0;
      index = i;
    }
  }

  return count > subLen ? ++count : ++subLen;
}

module.exports = findSubArray;