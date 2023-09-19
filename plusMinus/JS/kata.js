const plusMinus = arr => {
  let plus = 0;
  let minus = 0;
  let zeros = 0;
  
  for (const num of arr) {
      if (num === 0) {
          zeros++;
      }
      if (num < 0) {
          minus++;
      }
      if (num > 0) {
          plus++;
      }
  }
  
  console.log((plus/arr.length).toFixed(6));
  console.log((minus/arr.length).toFixed(6));
  console.log((zeros/arr.length).toFixed(6));
  return (plus/arr.length).toFixed(6);
}

module.exports = plusMinus;