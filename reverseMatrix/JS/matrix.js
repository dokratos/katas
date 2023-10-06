const matrix = array => {
let sum = 0;
let forIndex = array.length;
let maxI = forIndex - 1;
for (let i = 0; i < forIndex / 2; i++) {
  for (let j = 0; j < forIndex / 2; j++) {
    sum += Math.max(Math.max(array[i][j], array[maxI - i][j]), 
      Math.max(array[maxI - i][maxI - j], array[i][maxI - j]));
  }
}
return sum;
}

module.exports = matrix;