const migrate = require("./birds");

test('', () => {
  expect(migrate([1, 1, 2, 3, 2])).toBe(1);
})