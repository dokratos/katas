const breakingRecords = (scores)  => {
  const result = [];
  let minCount = 0;
  let maxCount = 0;
  let min = scores[0];
  let max = scores[0];
  
  for (let score of scores) {
      if (score < min) {
          min = score;
          minCount++;
      }
      if (score > max) {
          max = score;
          maxCount++;
      }
  }
  
  result.push(maxCount);
  result.push(minCount);
  
  return result;
}

module.exports = breakingRecords;