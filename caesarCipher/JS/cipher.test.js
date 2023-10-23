const cc = require("./cipher");

test('correctly decodes', () => {
  expect(cc('Hello_World!', 4)).toBe('Lipps_Asvph!');
})