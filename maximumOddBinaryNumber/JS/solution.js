/**
 * @param {string} s
 * @return {string}
 */
var maximumOddBinaryNumber = function(s) {
  let count0 = 0;
  let count1 = 0;

  for (let i = 0; i < s.length; i++) {
      if (s[i] == 0) count0++;
      if (s[i] == 1) count1++;
  }

  let result = "";
  for (let i = 0; i < count1-1; i++) {
      result+= "1";
  }
  for (let i = 0; i < count0; i++) {
      result+= "0";
  }
  result+="1";
  return result;
  
};