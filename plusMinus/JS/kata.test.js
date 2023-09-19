const plusMinus = require('./kata');

test('return ratios', () => {
  expect(plusMinus([1, 1, 0, -1, -1])).toBe("0.400000");
});