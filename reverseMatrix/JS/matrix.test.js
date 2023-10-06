const matrix = require("./matrix");

test("checkMaxValue", () => {
  expect(matrix([[ 112, 42, 83, 119 ], 
    [ 56, 125, 56, 49 ], 
    [ 15, 78, 101, 43 ], 
    [ 62, 98, 114, 108 ]])).toBe(414);
})