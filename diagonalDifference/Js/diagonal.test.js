const diff = require('./diagonal');

test('calculate abs', () => {
  expect(diff([[1, 2, 3], [4, 5, 6], [9, 8,9]])).toBe(2);
})