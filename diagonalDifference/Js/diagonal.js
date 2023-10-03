const difference = array => {
  let leftToR = 0;
  let rightToL = 0;

  for (let i = 0, j = array.length - 1; i < array.length; i++, j--) {
    leftToR += array[i][i];
    rightToL += array[i][j];
  }

  return Math.abs(leftToR - rightToL);
}

module.exports = difference;